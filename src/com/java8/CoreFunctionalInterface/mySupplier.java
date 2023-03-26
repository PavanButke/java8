package com.java8.CoreFunctionalInterface;

import java.util.function.Supplier;

public class mySupplier {

	public static void main(String []args)
	{
		Gamer obj1= factory(Gamer::new);
		System.out.println(obj1);
		
		Gamer obj2 = factory(() -> new Gamer("Pavan", 1, "abc"));
		System.out.println(obj2);
	}



	public static Gamer factory(Supplier<? extends Gamer>s) {
		Gamer gamer= s.get();
		
		if(gamer.getGamerName()==null || "".equals(gamer.getGamerName()))
		{
			gamer.setGamerName("default");
		}
		
		gamer.setRanking(1001);
		gamer.setRegion("MUMBAI");
		
		return null;
	}
}
