package Carlys;

public class EventInfo {
	public final static int PRICE=35;
	public final static int LIMIT_OF_GUESTS=50;
	private String eventNumber;
	private int guestsNumber;
	private int totalPrice;
	
	public  void setEventNumber(String newEventNumber) {
		this.eventNumber = newEventNumber;
		
	}  
	public void setGuests(int newGuestsNumber) {
		this.guestsNumber = newGuestsNumber;
		totalPrice=guestsNumber*PRICE;

	}
	public String getEventNumber() {
		return eventNumber;
	}
	public int getGuestsNumber() {
		return guestsNumber;
	}
	public int getTotalPrice() {
		return totalPrice;
	}

}

