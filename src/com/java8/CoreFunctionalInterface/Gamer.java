package com.java8.CoreFunctionalInterface;

public class Gamer {

	String GamerName;
	int ranking;
	String region;
	public Gamer() {
		super();
	}
	public Gamer(String gamerName, int ranking, String region) {
		super();
		GamerName = gamerName;
		this.ranking = ranking;
		this.region = region;
	}
	public String getGamerName() {
		return GamerName;
	}
	public void setGamerName(String gamerName) {
		GamerName = gamerName;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "Gamer [GamerName=" + GamerName + ", ranking=" + ranking + ", region=" + region + "]";
	}
	
	
	
	
}
