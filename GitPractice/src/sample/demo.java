package sample;

import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class demo {
	@Test
	public void findRepeatation() {
		String str= "java python php c# python python c# c# python c# c#";
		String st[]=str.split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String x:st) {
			if(hm.containsKey(x)) {
				hm.put(x,hm.get(x)+1);
			}
			else {
				hm.put(x,1);
			}
		}
		Set<String>hs=hm.keySet();
		for(String y:hs) {
			if(hm.get(y)==1) {
				System.out.println(y+" is the unique number ");
			}
		}
		
	}

}
