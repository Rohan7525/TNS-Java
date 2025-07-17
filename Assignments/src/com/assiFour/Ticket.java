package com.assiFour;
public class Ticket {
	
	private String StageEvent;
	private String Customer;
	private int NoOfSeats;
	private int Price;
	
	public Ticket(String stageEvent, String customer, int noOfSeats,int price) {
		
		StageEvent = stageEvent;
		Customer = customer;
		NoOfSeats = noOfSeats;
		Price=price;
	}

	public String getStageEvent() {
		return StageEvent;
	}

	public void setStageEvent(String stageEvent) {
		StageEvent = stageEvent;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public int getNoOfSeats() {
		return NoOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		NoOfSeats = noOfSeats;
	}
		
	public void Payment() {
		System.out.println("Amount "+(Price+0.0)+" paid in cash");
			
	}
	
	public void Payment(String walletNumber) {
		System.out.println("Amount "+(Price+0.0)+" paid using wallet number "+walletNumber);
		
	}

	public void Payment(String cardName,String CVV,String cardHolder) {
		System.out.println("Holder name : "+cardHolder);
		System.out.println("Amount "+(Price+0.0)+" paid using "+ cardName+" card");
		System.out.println("CVV : "+CVV);
	
	}
	
	public void GeneralInfo() {
		System.out.println("Stage Event : "+StageEvent);
		System.out.println("Customer : "+Customer);
		System.out.println("Number of Seat : "+NoOfSeats);
			
	}
}