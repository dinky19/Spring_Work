package com.example.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int alienid;
	private String alienName;
	private String alienFood;
	@Autowired
	private Ipl ipl;

	public int getAlienid() {
		return alienid;
	}

	public void setAlienid(int alienid) {
		this.alienid = alienid;
	}

	public String getAlienName() {
		return alienName;
	}

	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}

	public String getAlienFood() {
		return alienFood;
	}

	public void setAlienFood(String alienFood) {
		this.alienFood = alienFood;
	}


	public Ipl getIpl() {
		return ipl;
	}

	public void setIpl(Ipl ipl) {
		this.ipl = ipl;
	}

	public void show()
	{
		System.out.println(1998);
		ipl.play();
	}
	
}
