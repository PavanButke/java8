package com.java8.CoreFunctionalInterface;

import java.util.function.Predicate;

public interface myPredicate {
	
	Predicate<String> nonEmptyString= (String s)-> !s.isEmpty();
	
	List<String> nonEmpty= filter(listOfString , nonEmptyString);
}
