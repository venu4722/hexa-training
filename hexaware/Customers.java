package com.hexaware;

public class Customers {
	private int customerID;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	
	
	public Customers() {
		super();
	}
	
	
	public Customers(int customerID, String firstName, String lastName, String email, String phone, String address) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}


	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customers [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone + ", Address=" + address + "]";
	}
	
	public int calculateTotalOrders() {
		int total=0;
		return total;
	}
	
		public void getCustomerDetails() {
		    // Display customer details
		    System.out.println("Customer ID: " + customerID);
		    System.out.println("First Name: " + firstName);
		    System.out.println("Last Name: " + lastName);
		    System.out.println("Email: " + email);
		    System.out.println("Phone: " + phone);
		    System.out.println("Address: " + address);
		}
		public void UpdateCustomerInfo(String email,String phone,String address) {
			if(!isValidEmail(email))
				throw new IllegalArgumentException("Invalid Email Address..");
			
			this.email=email;
			this.phone=phone;
			this.address=address;
		}

		private boolean isValidEmail(String email) {
			return email!=null && email.contains("@") && email.contains(".");
		}
	
	
	
}
