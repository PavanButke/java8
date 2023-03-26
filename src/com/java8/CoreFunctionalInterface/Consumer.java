package com.java8.CoreFunctionalInterface;

@FunctionalInterface
public interface Consumer<T> {
	
	void accept(T t);
}
