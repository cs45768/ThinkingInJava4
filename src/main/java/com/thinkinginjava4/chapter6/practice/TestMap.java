package com.thinkinginjava4.chapter6.practice;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("page_return_url", "111111111111");
		System.out.println(map.get("page_return_url"));
		map.put("page_return_url", "222222222222");
		System.out.println(map.get("page_return_url"));
	}

}
