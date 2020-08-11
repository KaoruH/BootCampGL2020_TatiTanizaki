package org.globallogic.bootcamp.patron.delegation.clases;

public class ElectricalOven extends ElectricalAppliance{
	
	private LedAppliance ledAppliance;
	

	public ElectricalOven() {
		ledAppliance = new LedAppliance();
	}
	
	@Override
	public void turnOn() {
		Integer power = this.getPower() - 75;
		this.setPower(power);
	}
	
	public void turnLed() {
		
		Integer power = this.getPower() - 100;

		this.setPower(power);

	}

}
