package com.pratian.utility.serialization;

import java.io.Serializable;

public class Game implements Serializable{
	private int points;
	private double timeLapsed;
	private int level;
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public double getTimeLapsed() {
		return timeLapsed;
	}
	public void setTimeLapsed(double timeLapsed) {
		this.timeLapsed = timeLapsed;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Game(int points, double timeLapsed, int level) {
		super();
		this.points = points;
		this.timeLapsed = timeLapsed;
		this.level = level;
	}
	@Override
	public String toString() {
		return "Game [points=" + points + ", timeLapsed=" + timeLapsed + ", level=" + level + "]";
	}
	
	
}
