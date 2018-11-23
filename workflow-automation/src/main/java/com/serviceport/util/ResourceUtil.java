package com.serviceport.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ResourceUtil {


	public JsonObject readJsonFile(String fileName) throws FileNotFoundException {
	

		ClassLoader loader = getClass().getClassLoader();
		
		File file = new File(loader.getResource(fileName).getFile());
	
		JsonParser parser = new JsonParser();		
		
		JsonElement jsonObj = parser.parse(new FileReader(file));
		
		JsonObject jsonObject = jsonObj.getAsJsonObject();

		return jsonObject;
		
	}

}
