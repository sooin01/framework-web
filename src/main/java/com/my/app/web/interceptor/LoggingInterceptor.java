package com.my.app.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggingInterceptor extends HandlerInterceptorAdapter {

	private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		logger.info("Remote IP => {}", request.getRemoteAddr());
		logger.info("Request => {} {}", new Object[] {
				request.getRequestURL(),
				request.getMethod()
		});
		
		return super.preHandle(request, response, handler);
	}
	
}
