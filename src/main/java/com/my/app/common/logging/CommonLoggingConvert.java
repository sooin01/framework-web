package com.my.app.common.logging;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class CommonLoggingConvert extends ClassicConverter {

	@Override
	public String convert(ILoggingEvent event) {
		return Long.toString(System.nanoTime());
	}

}
