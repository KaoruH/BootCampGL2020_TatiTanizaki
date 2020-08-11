package org.globallogic.bootcamp.patron.delegation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.globallogic.bootcamp.patron.delegation.clases.ElectricalAppliance;
import org.globallogic.bootcamp.patron.delegation.clases.ElectricalOven;
import org.globallogic.bootcamp.patron.delegation.clases.LedAppliance;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

	ElectricalAppliance electricalAppliance = new ElectricalAppliance();
	
	ElectricalOven electricalOven = new ElectricalOven();
	
	LedAppliance ledAppliance = new LedAppliance();
	

//	@Test
//	@DisplayName("Electrical Appliance 1")
//	void electricalApplianceGetPowerTest() {
//
//		assertEquals(500, electricalAppliance.getPower());
//
//	}

	@Test
	@DisplayName("Electrical Appliance 2")
	void electricalApplianceTurnOnTest() {

		electricalAppliance.turnOn();

		assertEquals(450, electricalAppliance.getPower());
	}
	
//	@Test
//	@DisplayName("Electrical Appliance 3")
//	void electricalApplianceSetPowerTest() {
//		
//		electricalAppliance.setPower(200);
//		
//		assertEquals(200, electricalAppliance.getPower());
//	}
	
	@Test
	@DisplayName("Electrical Oven 1")
	void electricalOvenTurnOn() {
		
		electricalOven.turnOn();
		
		assertEquals(425,electricalOven.getPower());
		
		
	}
	
	@Test
	@DisplayName("Electrical Oven 2")
	void electricalOvenTurnLed() {
		
		electricalOven.turnLed();
		
		assertEquals(400,electricalOven.getPower());
		
		
	}
	
	@Test
	@DisplayName("Led Appliance")
	void ledApplianceTurnOn() {
		
		ledAppliance.turnOn();
		
		assertEquals(400, ledAppliance.getElectricalAppliance().getPower());
	}
	
	
	
}