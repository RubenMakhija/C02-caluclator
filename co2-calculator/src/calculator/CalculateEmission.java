package calculator;

import java.util.HashMap;

public class CalculateEmission {
	public HashMap<String, Integer> emissionMap = new HashMap<String, Integer>();
	
	public CalculateEmission() {
		emissionMap.put("small-diesel-car", 142);
		emissionMap.put("small-petrol-car", 154);
		emissionMap.put("small-plugin-hybrid-car", 73);
		emissionMap.put("small-electric-car", 50);
		
		emissionMap.put("medium-diesel-car", 171);
		emissionMap.put("medium-petrol-car", 192);
		emissionMap.put("medium-plugin-hybrid-car", 110);
		emissionMap.put("medium-electric-car", 58);
		
		emissionMap.put("large-diesel-car", 209);
		emissionMap.put("large-petrol-car", 282);
		emissionMap.put("large-plugin-hybrid-car", 126);
		emissionMap.put("large-electric-car", 73);
		
		emissionMap.put("bus", 27);
		
		emissionMap.put("train", 6);
	}

	public Double calculate(String transportMethod, Double distance) {
		Double result = null;  
		
		if(emissionMap.containsKey(transportMethod)) 
			result =  emissionMap.get(transportMethod)*distance;	
		
		return result;
	}

}
