package com.my.app.web.common.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

import com.google.common.base.CaseFormat;

public class CovertUtil {

	public static String underscore2Camel(String name) {
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name);
	}

	public static String camel2underscore(String name) {
		return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
	}

	public static <T> T map2Bean(Map<String, String> map, Class<T> clazz) {
		T t = null;

		try {
			t = clazz.newInstance();

			for (PropertyDescriptor propertyDescriptor : BeanUtils.getPropertyDescriptors(clazz)) {
				String name = propertyDescriptor.getName();
				String value = map.get(camel2underscore(name));

				if (value != null) {
					propertyDescriptor.getWriteMethod().invoke(t, value);
				}
			}
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

		return t;
	}
	
	public static Map<String, String> bean2Map(Object target) {
		Map<String, String> map = new HashMap<>();
		
		try {
			BeanWrapper wrapper = PropertyAccessorFactory.forBeanPropertyAccess(target);
			for (PropertyDescriptor pd : wrapper.getPropertyDescriptors()) {
				map.put(pd.getName(), String.valueOf(pd.getReadMethod().invoke(target)));
			}
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return map;
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("user_name", "홍길동");
		map.put("user_id", "kildong");
		Data data = map2Bean(map, Data.class);
//		System.out.println(data);
		
		map = bean2Map(data);
		System.out.println(map);
	}

}

class SuperData {
	private String userId;
	private Link link;

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}

class Data extends SuperData {
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}

class Link extends SuperData {
	private String href = "http://";

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
}