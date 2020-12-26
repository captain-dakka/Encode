package encode;

import java.util.Scanner;

public class run {
	public static void main(String[] args) throws InterruptedException {
		// Initate Variables
		String input;
		String output;
		String lang = "";
		String cipher = "";
		Character yn;
		Boolean contDo = null;
		Boolean contDo2 = null;
		final Scanner in = new Scanner(System.in);

		do {
			// Lang check
			do {
				// Ask for Language
				System.out.println("What language do you want to use? NL, EN");
				lang = in.nextLine();
				lang = lang.toUpperCase();

				Thread.sleep(300);

				if (lang.equals("NL") || lang.equals("EN")) {
					contDo = false;
				} else {
					System.out.println("That is not a language. Please try again.");
					contDo = true;
				}

				Thread.sleep(300);

			} while (contDo);

			do {
				// Check if they want to use the language they chose
				System.out.println("Are you sure you wish to use " + lang + " as your language? Y or N");
				yn = in.nextLine().charAt(0);
				yn = Character.toUpperCase(yn);

				Thread.sleep(300);

				if (yn.equals('Y')) {
					contDo = false;
					contDo2 = false;
				} else if (yn.equals('N')) {
					System.out.println("Try again.");
					contDo2 = true;
				} else {
					System.out.println("You have not entered a correct input. Try again");
					contDo = true;
				}

				Thread.sleep(300);

			} while (contDo);

		} while (contDo2);

		// Taking input
		// 1. Choose cipher to use
		System.out.println("Which cipher do you want to use?");

		in.close();
	}
}