package com.my.app.web.common.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

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
	
}
