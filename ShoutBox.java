

import java.util.HashMap;
import java.util.Scanner;

//new class ShoutBox
public class ShoutBox {

	// declare and initialize the arrays
	String[] subject = { "You", "I", "He", "They", "We", "He", "She", "Them", "Tina", "James" };
	String[] object = { "book", "computer", "dog", "cat", "paper", "fish", "drink", "pool", "couch", "bed" };
	String[] verbs = { "jump", "catch", "swim", "run", "applaud", "bounce", "crawl", "chew", "blink", "hide" };
	String[] adverbs = { "willfully", "abruptly", "firmly", "lightly", "truthfully", "quickly", "wildly", "silently",
			"yearly", "kindly" };
	String[] adjectives = { "bitter", "boxy", "big", "blue", "clear", "many", "faint", "bumpy", "fresh", "sweet" };

	// create some variables
	int size = 10;
	int length;
	int choice;
	int i = 1;
	String displayUserMessage = "";
	String userMessage = "";
	String wantIt;
	String randomMessage = null;
	Scanner input = new Scanner(System.in);

	// create hashmap for message
	HashMap<Integer, String> message = new HashMap<>();

	// new method shoutOutCannedMethod returning a String
	public String shoutOutCannedMessage() {

		// initialize the hashmap with canned messages, seriously when is it
		// vacation time?
		message.put(0, "I am definitely ready for a vacation!");
		message.put(1, "I'm really happy it is summertime!");
		message.put(2, "I am not a fan of the snow!");
		message.put(3, "In two days I get a new tattoo!");
		message.put(4, "Yeah, it is Friday!");
		message.put(5, "What's for dinner?");

		length = message.size();
		// use a loop to display the the canned messages
		for (; i <= length; i++) {
			System.out.println("Message " + i + " : " + message.get(i - 1));

		}

		// try catch to check for some invalid stuff
		try {
			// ask the user to choose which message they want displayed
			System.out.print("\nPlease enter the number of the message you would like displayed: ");

			userMessage = input.nextLine();
			choice = Integer.parseInt(userMessage);
		}
		// catch number format exception and advise user
		catch (NumberFormatException n) {
			System.out.print("\nInvalid Choice! Please enter the number of the message you would like displayed: ");

			userMessage = input.nextLine();
			choice = Integer.parseInt(userMessage);
		}
		// catch any other exception advise user
		catch (Exception e) {
			System.out.println("Unspecified error! Please enter the number of the message you would like displayed: ");
		}

		// check to see if the entered choice is out of range of the hashmap
		// (display an error if the user enters number greater than the length or less than or equal to zero)
		if (choice > length || choice <= 0) {
			System.err.println("Invalid choice!");
			System.exit(1);
		} else {
			displayUserMessage = message.get(choice - 1);
		}

		return displayUserMessage;

	}

	// create random message method
	public String shoutOutRandomMessage() {

		// ask user if they want to generate a random message
		System.out.print("\nDo you want to generate a random message? [Yes or No] ");
		wantIt = input.nextLine();

		// ignore the case matter
		if (!wantIt.equalsIgnoreCase("no")) {

			// Use math.random() to get random index value for each of the above
			// and store indexes
			int rndSubject = (int) (Math.random() * subject.length);
			int rndObject = (int) (Math.random() * object.length);
			int rndVerbs = (int) (Math.random() * verbs.length);
			int rndAdverbs = (int) (Math.random() * adverbs.length);
			int rndAdj = (int) (Math.random() * adjectives.length);
			randomMessage = subject[rndSubject] + " " + verbs[rndVerbs] + " " + adjectives[rndAdj] + " "
					+ object[rndObject] + " " + adverbs[rndAdverbs];
			// return the string

		} else {
			System.exit(0); // If no, exit program
		}

		return randomMessage;

	}
}
