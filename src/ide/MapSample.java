package ide;

import java.util.HashMap;
import java.util.Set;

public class MapSample {

	public static void main(String args[]){
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("name", "ankit");
		map.put("lname", "mittal");
		System.out.println(map);
		System.out.println(map.get("name"));
		Set keys=map.keySet();
		System.out.println(keys);
		System.out.println(map.values());
		System.out.println(map.containsKey("address"));
		System.out.println(map.containsValue("mittal"));
	}
}
