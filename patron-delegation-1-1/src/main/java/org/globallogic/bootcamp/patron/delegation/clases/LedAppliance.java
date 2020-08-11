package org.globallogic.bootcamp.patron.delegation.clases;

public class LedAppliance {
	
	private ElectricalAppliance electricalAppliance;
	
	public ElectricalAppliance getElectricalAppliance() {
		return electricalAppliance;
	}

	public LedAppliance() {
		electricalAppliance = new ElectricalAppliance();
	}
	
	public void turnOn() {
		
		Integer power = electricalAppliance.getPower() - 100;
		
		electricalAppliance.setPower(power);
	}

}
