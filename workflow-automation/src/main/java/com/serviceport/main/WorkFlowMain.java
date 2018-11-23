package com.serviceport.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.google.gson.JsonObject;
import com.serviceport.service.WorkflowService;
import com.serviceport.service.WorkflowServiceRandomImpl;
import com.serviceport.util.ResourceUtil;

public class WorkFlowMain {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		ResourceUtil resourceUtil = new ResourceUtil();		
		
		JsonObject jsonObj = resourceUtil.readJsonFile("files//Input.json");
				
		WorkflowService service = new WorkflowServiceRandomImpl();
		
		System.out.println("The Input provided was ::: "  + jsonObj + "\n");
		
		System.out.println("The output for the service requested ::: " + service.assignCleaners(jsonObj));
	}

}
