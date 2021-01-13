package dao;

import java.util.HashMap;
import java.util.Map;

import ATM.Set;


public class AtmDao {
	private Map<String,Set> atmDb = new HashMap<String,Set>();
	
	public void insert(Set set) {
		atmDb.put(set.getName(), set);
	}
	
}
