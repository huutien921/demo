package com.example.demo;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MWGAPICallCenterMonitorController {
	public  HashMap<String, String> hashMap = new  HashMap<>();




	@RequestMapping(value = "/gw/test", method = RequestMethod.POST, consumes = "application/json", produces = "application/json; charset=utf-8")
	public  @ResponseBody Object test(@RequestBody Object request) throws Exception{
		
		ObjectMapper mapper = new ObjectMapper();

		try {
			String json = mapper.writeValueAsString(request);
			System.out.println(json);
			hashMap.put(new Date().toString(), json);
		

		} catch (JsonProcessingException e) {
			throw e;
		}

		return request;		

	}
	
	
	@RequestMapping(value = "/gw/get", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
	public  @ResponseBody  HashMap<String, String> test1() throws Exception{
	

		return hashMap;		

	}
	
	public static class ApiRequestCC{
		/**
		 * 
		 */
		private static final long serialVersionUID = 7149545290655153897L;
	
		
		
	}

}
