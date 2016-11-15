package com.tutorialspoint.collections;

import java.util.*;

public class JavaCollections {
	Map map;
	List list;
	Set set;
	Properties props;
	
	
	public Map getMap() {
		System.out.println("Map Elements :"  + map);
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public List getList() {
		System.out.println("List Elements :"  + list);
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Set getSet() {
		System.out.println("Set Elements :"  + set);
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Properties getProps() {
		System.out.println("Properties Elements :"  + props);
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	
}
