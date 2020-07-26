package com.epam.java8streams_and_optional;
import java.util.*; 
import java.util.stream.*; 
  
class Palindromic_Strings{ 
  public static List<String>find_matched(List<String> li){
	  return list
			  .stream()
			  .filter(s->ispalindrome(s))
			  .collect(Collectors.toList());
			  }
  public boolean isPalindrome(String input) {
	    String temp = input.replaceAll("\\s+", "").toLowerCase();
	    return IntStream.range(0, input.length() / 2)
	        .allMatch(i -> temp.charAt(i) == temp.charAt(temp.length() - i - 1));
	}
		   
    public static void main(String[] args) 
    { 
  		List<String> string_list = new ArrayList<String>();
  		string_list.add("abc");
  		string_list.add("abcd");
  		string_list.add("aaa");
  		string_list.add("bca");
  		string_list.add("ada");
  		List<String> s=find_matched(string_list);
  		System.out.println(s);
  		
    } 
} 