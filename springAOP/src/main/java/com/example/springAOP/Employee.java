package com.example.springAOP;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int eId;
	private String eNmae;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteNmae() {
		return eNmae;
	}

	public void seteNmae(String eNmae) {
		this.eNmae = eNmae;
	}
	
	public void show()
	{
		System.out.println("Showing Id and name");
	}
}
