package org.globallogic.bootcamp.patron.delegation.clases;

public class ElectricalAppliance {

	private Integer power = 500;
	
	public Integer getPower() {
		return power;
	}
	
	public void setPower(Integer power) {
		this.power = power;
	}

	public void turnOn() {
		
		this.power -= 50;
	}
	
	

}
