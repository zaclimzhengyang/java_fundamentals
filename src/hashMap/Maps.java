package mapAndHashMap;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> empIds = new HashMap<String, Integer>();
		empIds.put("John", 155);
		empIds.put("Jerry", 035);
		empIds.put("Calvin", 201);
		
		System.out.println(empIds);
		
		// retrieve value by calling key
		System.out.println(empIds.get("John"));
		
		// check if hashmap contains key
		System.out.println(empIds.containsKey("Calvin"));
		System.out.println(empIds.containsKey("Zac"));
		
		// check if hashmap contains value
		System.out.println(empIds.containsValue(155));
		System.out.println(empIds.containsValue(10000));
		
		// putting will replace existing key 
		empIds.put("Calvin", 321);
		System.out.println(empIds.get("Calvin"));
		 
		// won't do anything
		empIds.replace("Kramer", 000);
		
		// put only if key does not exist
		empIds.putIfAbsent("Calvin", 203);
		empIds.putIfAbsent("Steve", 592);
		
		System.out.println(empIds);
	}

}
