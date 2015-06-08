package com.my.app.web.common.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;

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

				if (StringUtils.isNotBlank(value)) {
					propertyDescriptor.getWriteMethod().invoke(t, value);
				}
			}
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

		return t;
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("user_name", "홍길동");
		Data data = map2Bean(map, Data.class);
		System.out.println(data.getUserName());
	}

}

class Data {
	String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}