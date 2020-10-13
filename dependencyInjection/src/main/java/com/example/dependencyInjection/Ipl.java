package com.example.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Ipl {
	private int iplId;
	private String iplCity;

	public int getIplId() {
		return iplId;
	}

	public void setIplId(int iplId) {
		this.iplId = iplId;
	}

	public String getIplCity() {
		return iplCity;
	}

	public void setIplCity(String iplCity) {
		this.iplCity = iplCity;
	}

	public void play() {
		System.out.println("Playing");
	}
}
