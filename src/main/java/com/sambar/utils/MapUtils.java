
package com.sambar.utils;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapUtils {
	public static String mapToString(Map<String, String> map) {
		StringBuilder stringBuilder = new StringBuilder();

		for (Entry<String, String> key : map.entrySet()) {
			stringBuilder.append(key.getKey());
			stringBuilder.append("=");
			stringBuilder.append(key.getValue());
			stringBuilder.append(",");
		}
		return stringBuilder.toString();
	}

	public static Map<String, String> stringToMap(String mapAsString) {
		Map<String, String> map = Arrays.stream(mapAsString.split(",")).map(entry -> entry.split("="))
				.collect(Collectors.toMap(entry -> entry[0], entry -> entry[1]));
		return map;
	}
}
