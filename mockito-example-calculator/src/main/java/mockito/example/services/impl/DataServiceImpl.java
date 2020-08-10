package mockito.example.services.impl;

import mockito.example.services.DataService;

public class DataServiceImpl implements DataService{

	private int[] listOfNumbers;
	
	@Override
	public int[] getListOfNumbers() {
		return this.listOfNumbers;
	}
	
	public void setListOfNumbers(int[] listOfNumbers) {
		this.listOfNumbers = listOfNumbers;
	}

}
