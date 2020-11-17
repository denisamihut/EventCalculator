package Carlys;
import java.util.Scanner;
public class Main {

	    private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			showMotto();
	        EventInfo event = new EventInfo();
	        
	        String en =  getEventNumberFromUser();
	        event.setEventNumber(en);
	        
	        int ng = getNumberOfGuestsFromUser();
			event.setGuests(ng);
			
			showEventInfo(event);

		}
		public static void showEventInfo(EventInfo b) {
			System.out.println("Numar invitati: "+b.getGuestsNumber());
			System.out.println("Numar eveniment: "+b.getEventNumber());
			System.out.println("Pret total: "+b.getTotalPrice());
			
			if(b.getGuestsNumber()>50)
				System.out.println("Este un eveniment mare");
			else
				System.out.println("Este un eveniment mai restrans");
			
		    System.out.println("Pret pe persoana: "+EventInfo.PRICE);
			
		}

		public static String getEventNumberFromUser() {
			
			System.out.println("Introduceti numarul evenimentului:");
			String events = scanner.nextLine(); 
		
			return events ;
		}
		public static int getNumberOfGuestsFromUser() {
		
			System.out.println("Introduceti numarul de invitati:");
			
			int guests = scanner.nextInt(); 
			scanner.close();
			return guests ;
		}
		public static void showMotto() {
			
			String motto = "MOTTO:  „Carly’s makes the food that makes it a party.”.*";
			String stars1="***********************************************************";
			String stars2="***********************************************************";

			System.out.println(stars1);
			System.out.println(motto);
			System.out.println(stars2);
		}
	}
