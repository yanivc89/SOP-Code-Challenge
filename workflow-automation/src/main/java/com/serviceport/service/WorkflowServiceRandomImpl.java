package com.serviceport.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.serviceport.component.WorkCapacitiy;

public class WorkflowServiceRandomImpl implements WorkflowService {

	/* Using Random Function to decide on the number of
	 * cleaners to be employed. This assumption was based 
	 * on the fact that the partner is free to decide 
	 * on how many junior and senior cleaners must be
	 * employed.
	 */
	public String assignCleaners(JsonObject json) {
		
		int seniorCapacity = json.get("senior").getAsInt();
		
		int juniorCapacty = json.get("junior").getAsInt();
		
		JsonArray roomArray = json.get("rooms").getAsJsonArray();
				
		Random random = new Random();
		
		List<WorkCapacitiy> workForce = new ArrayList<WorkCapacitiy>();
		
		int roomArraySize = roomArray.size(); 
		
		for( int i = 0; i < roomArray.size(); i++){
			
			int seniorNum = random.nextInt( seniorCapacity / roomArraySize + i );
			
			int juniorNum = random.nextInt( juniorCapacty / roomArraySize + i );
			
			workForce.add(new WorkCapacitiy( seniorNum == 0 ? 1 : seniorNum , juniorNum));
		}	
		
		Gson gsonBuilder = new GsonBuilder().create();
		
		String outputJson = gsonBuilder.toJson(workForce);
		
		return outputJson;
		
		
	}

}
