package com.daily.util;
import gherkin.deps.com.google.gson.Gson;

public class MockTestUtil {
	public static String convertToJsonFormat(Object anyObject) {
		Gson gson = new Gson();
		return gson.toJson(anyObject);
	}
}
