
import java.util.Scanner;

//create class to test methods/classes
public class TestIt {

	// main method
	public static void main(String[] args) {

		// create variable
		String goAgain = "yes";
		// create a scanner object called input
		Scanner input = new Scanner(System.in);

		// put it all in a loop
		do {
			// create new ShoutBox
			ShoutBox myMessage = new ShoutBox();
			// call shoutOutCannedMessage method
			String userMessage = myMessage.shoutOutCannedMessage();
			// display selected canned message to user
			System.out.println("\nYour selected message is: " + userMessage + " ");

			// call the shoutOutRandomMessage()
			String randomMessage = myMessage.shoutOutRandomMessage();
			System.out.print('\n');
 
			//display random message to user
			System.out.println("Your random message is:  " + randomMessage + ".");
			System.out.print('\n');

			// ask user if they want to go again
			System.out.print("Wanna try again? Type 'yes' or 'no': ");

			goAgain = input.next(); // store input
			System.out.print('\n');

		}
		// if not close up loop
		while (!goAgain.equals("no"));
		input.close();

	}
}
