package com.epam.java8streams_and_optional;
import java.util.*; 
import java.util.stream.IntStream; 

public class average_Of_List_Of_Integers 
{
    public static void main( String[] args )
    {
    	IntStream stream = IntStream.of(2, 3, 4, 5, 6, 7, 8); 
    	OptionalDouble obj = stream.average(); 
    	System.out.println(obj.getAsDouble()); 
    	       
     } 
} 
    
