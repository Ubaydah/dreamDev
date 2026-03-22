import java.util.Scanner; 

public class Nokia {

	public static void main(String... args) {

	Scanner inputCollector = new Scanner(System.in);

	String prompt = """
	Welcome to Nokia.
	List of Menu:

	1. Phone book
	2. Messages
	3. Chat
	4. Call register 
	5. Tones
	6. Settings 
	7. Call divert
	8. Games
	9. Calculator 
	10. Reminders
	11. Clock
	12. Profiles
	13. SIM services
	""";
	
	System.out.println(prompt);
	
	int userInput = inputCollector.nextInt();

	switch(userInput){
		case 1 -> { 
			System.out.println("Phone book");
			
			prompt = """
			1. Search 
			2. Service Nos
			3. Add name
			4. Erase
			5. Edit
			6. Assign Tone 
			7. Send b' card
			8. Options 
			9. Speed dials 
			10. Voice tags
			""";
			System.out.println(prompt);
			
			userInput = inputCollector.nextInt();
			
			switch(userInput) {
				case 1 -> System.out.println("Search");
				
				case 2 -> System.out.println("Service Nos");
				
				case 3 -> System.out.println("Add name");
	
				case 4 -> System.out.println("Erase");
		
				case 5 -> System.out.println("Edit");

				case 6 -> System.out.println("Assign tone");
				
				case 7 -> System.out.println("Send b' card");
	
				case 8 -> { 
				System.out.println("Options");
				
				prompt = """
				1. Type of view
				2. Memory status

				""";
				System.out.println(prompt);
				
				userInput = inputCollector.nextInt();
				
				switch(userInput) {
					case 1 -> System.out.println("Type of view");
				
					case 2 -> System.out.println("Memory status");
				}				
				}

				case 9 -> System.out.println("Speed dials");

				case 10 -> System.out.println("Voice tags");			
			}
		}

		case 2 -> {
			System.out.println("Messages");
			
			prompt = """
			1. Write messages 
			2. Inbox
			3. Outbox 
			4. Picture messages 
			5. Templates 
			6. Smileys
			7. Message settings 
			8. Info service
			9. Voice mailbox number 
			10. Service command editor
			"""; 
			
			System.out.println(prompt);
			
			userInput = inputCollector.nextInt();
			switch(userInput) {
				case 1 -> System.out.println("Write messages");

				case 2 -> System.out.println("Inbox");
		
				case 3 -> System.out.println("Outbox");
				
				case 4 -> System.out.println("Picture messages");
			
				case 5 -> System.out.println("Templates");
	
				case 6 -> System.out.println("Smileys");
	
				case 7 -> { 
					System.out.println("Message settings");
					
					prompt = """
					1. Set 1
					2. Common
					""";

					System.out.println(prompt);
					
					userInput = inputCollector.nextInt();
					switch(userInput) {
						case 1 -> {
						System.out.println("Set 1");
						prompt = """
						1. Message centre number 
						2. Messages sent as 
						3. Message validity

						""";
						System.out.println(prompt);
						
						userInput = inputCollector.nextInt();
						switch(userInput){
							case 1 -> System.out.println("Message centre number");
		
							case 2 -> System.out.println("Messages sent as");

							case 3 -> System.out.println("Message validity");
						}
					}
				
						case 2 -> {
							System.out.println("Common");
							prompt = """
							1. Delivery reports 
							2. Reply via same centre 
							3. Character support
							""";

							System.out.println(prompt);
							
							userInput = inputCollector.nextInt();
							switch(userInput){
								case 1 -> System.out.println("Delivery reports");
								
								case 2 -> System.out.println("Reply via same centre");

								case 3 -> System.out.println("Character support");
							}
						}
					}
				}

				case 8 -> System.out.println("Info service ");

				case 9 -> System.out.println("Voice mailbox number");

				case 10 -> System.out.println("Service command editor");
			}
			
		}

		case 3 -> System.out.println("Chat");

		case 4 -> {
			System.out.println("Call register");
			prompt = """
			1. Missed calls
			2. Received calls
			3. Dialled numbers 
			4. Erase recent call lists 
			5. Show call duration 
			6. Show call costs 
			7. Call cost settings 
			8. Prepaid credit 
			""";
			System.out.println(prompt);
			
	    }

		case 5 -> { 
			System.out.println("Tones");
			prompt = """
			1. Ringing tone
			2. Ringing volume 
			3. Incoming call alert 
			4. Composer 
			5. Message alert tone
			6. Keypad tones 
			7. Warning and game tones 
			8. Vibrating alert 
			9. Screen saver
			""";
			System.out.println(prompt);
			
			userInput = inputCollector.nextInt();
			switch(userInput) {
				case 1 -> System.out.println("Ringing tone");
				
				case 2 -> System.out.println("Ringing volume");

				case 3 -> System.out.println("Incoming call alert");

				case 4 -> System.out.println("Composer");

				case 5 -> System.out.println("Message alert tone");

				case 6 -> System.out.println("Keypad tones");

				case 7 -> System.out.println("Warning and game tones");

				case 8 -> System.out.println("Vibrating alert");

				case 9 -> System.out.println("Screen saver");

			}
		}
		
		case 6 -> {
			System.out.println("Settings"); 
			prompt = """
			1. Call settings 
			2. Phone settings 
			3. Security settings 
			4. Restore factory settings
			""";
		
			System.out.println(prompt);
		}
		
		case 7 -> System.out.println("Call divert");

		case 8 -> System.out.println("Games");

		case 9 -> System.out.println("Calculator");
	
		case 10 -> System.out.println("Reminders");
		
		case 11 -> {
			System.out.println("Clock");
			prompt = """
			1. Alarm clock
			2. Clock settings
			3. Date setting
			4. Stopwatch
			5. Countdown timer 
			6. Auto update of date and tine 
			""";
			System.out.println(prompt);

			userInput = inputCollector.nextInt();
			switch(userInput) {
				case 1 -> System.out.println("Alarm clock");
				
				case 2 -> System.out.println("Clock settings");
				
				case 3 -> System.out.println("Date setting");
			
				case 4 -> System.out.println("Stopwatch");

				case 5 -> System.out.println("Countdown timer");
		
				case 6 -> System.out.println("Auto update of date and time");

		
			}
		}

		case 12 -> System.out.println("Profiles");

		case 13 -> System.out.println("SIM services");
		


}
	

}

}