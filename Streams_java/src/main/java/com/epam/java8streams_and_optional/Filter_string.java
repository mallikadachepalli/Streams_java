package com.epam.java8streams_and_optional;

import java.util.*; 
import java.util.stream.*; 
  
class Filter_string { 
  public static List<String>find_matched(List<String>list){
  return list
  .stream()
  .filter(s->s.startsWith("a")&& s.length()==3)
  .collect(Collectors.toList());
  }
  
    public static void main(String[] args) 
    { 
  		List<String> string_list = new ArrayList<String>();
  		string_list.add("abc");
  		string_list.add("abcd");
  		string_list.add("aaa");
  		string_list.add("bca");
  		string_list.add("cda");
  		List<String> s=find_matched(string_list);
  		System.out.println(s);
  		
    } 
} 