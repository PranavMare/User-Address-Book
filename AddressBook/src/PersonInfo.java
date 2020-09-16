
public class PersonInfo {
	
	/**
	*	@author PranavMare
	*	
	*	Created on:15-Sep-2020 09:58:14 pm
	*/	

	String firstName;
	String lastName;
	String address;
	String phoneNumber;
	String city;
	String state;
	String zip;
	
	//Parameterized constructor
	PersonInfo(String firstName , String lastName , String address , String phoneNumber , String city , String state , String zip){
		this.firstName=firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
	}
	
	//displays the person info
	public void print() {
		System.out.println("Firstname : " + firstName + "\nLastName : " + lastName + "\naddress : " + address + "\nPhoneNumber : " + phoneNumber + "\nCity : " + city + "\nState : " + state + "\nZip Code : " + zip );
	}
}
