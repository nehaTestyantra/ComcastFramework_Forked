package com.comcast.crm.generic.fileutility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class JsonUtility {
	public String getDataFromJsonFile(String key) throws Throwable {

		FileReader fileR = new FileReader("./configAppData/jsonFile.json");

		JSONParser parser = new JSONParser();
		Object obj = parser.parse(fileR);

		// convert java object to json object using down casting
		JSONObject map = (JSONObject) obj;

		// get the value from json file using key
		String data = (String) map.get(key);
		return data;

	}

}
