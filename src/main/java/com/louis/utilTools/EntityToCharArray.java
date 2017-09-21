package com.louis.utilTools;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

/**
 * 实体类转化为字符串数组
 *
 * @param <T>
 */
public class EntityToCharArray<T> {
	
	public String[] entityToArray(T model) {
		/**
		 * 思路：
		 * 1.反射获取所有的属性名
		 * 2.根据属性名获取属性值
		 * 3.将属性值存入到字符数组
		 */
		
		List<String> fieldValueList = null;
		//1-获取属性名
		Field[] fields = model.getClass().getDeclaredFields();
		if (fields != null) {
			fieldValueList = new LinkedList<>();
			
			for (Field field : fields) {
				try {
					//2.获取属性值
					Field fieldValue = model.getClass().getDeclaredField(field.getName());
					try {
						fieldValue.setAccessible(true);
						fieldValueList.add(fieldValue.get(model).toString());
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				}
			}
		}
		return fieldValueList.toArray(new String[]{});
	}
}
