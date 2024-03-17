 import java.util.Scanner;
public class ifStatments {
	public static void main(String[] args) {
		Scanner myScanObj = new Scanner(System.in);
		//Arduino is just modified java so I've done this before, just never with human inputs
		//9
		System.out.print("Enter a year. ");
		int nine = myScanObj.nextInt();
		if (nine%4 == 0) {
			if (nine%100 == 0) {
				if (nine%400 == 0) {
					System.out.println("This is a leap year.");
				} else {
					System.out.println("This is not a leap year.");
				}
			} else {
				System.out.println("This is a leap year.");
			}
		} else {
			System.out.println("This is not a leap year.");
		}
		System.out.println();
		myScanObj.nextLine();

		//8
		int eightComputer = (int)((Math.random()*5)+1);
		System.out.println("Rock, paper, scissors, lizard, Spock! ");
		String eightHuman = myScanObj.nextLine();
		if (eightHuman.equalsIgnoreCase("r") || eightHuman.equalsIgnoreCase("rock") || eightHuman.equalsIgnoreCase("1")) {
			if (eightComputer == 1) {
				System.out.println("Rock! It's a draw.");
			} else if (eightComputer == 2) {
				System.out.println("Paper! I win!");
			} else if (eightComputer == 3) {
				System.out.println("Scissors! You win...");
			} else if (eightComputer == 4) {
				System.out.println("Lizard! You win...");
			} else if (eightComputer == 5) {
				System.out.println("Spock! I win!");
			} else {
				System.out.println("Something went wrong with the computer's move, it will never be fixed.");
			}
		} else if (eightHuman.equalsIgnoreCase("p") || eightHuman.equalsIgnoreCase("paper") || eightHuman.equalsIgnoreCase("2")) {
			if (eightComputer == 1) {
				System.out.println("Rock! You win...");
			} else if (eightComputer == 2) {
				System.out.println("Paper! It's a draw.");
			} else if (eightComputer == 3) {
				System.out.println("Scissors! I win!");
			} else if (eightComputer == 4) {
				System.out.println("Lizard! I win!");
			} else if (eightComputer == 5) {
				System.out.println("Spock! You win...");
			} else {
				System.out.println("Something went wrong with the computer's move, it will never be fixed.");
			}
		} else if (eightHuman.equalsIgnoreCase("s") || eightHuman.equalsIgnoreCase("sc") || eightHuman.equalsIgnoreCase("scissor") || eightHuman.equalsIgnoreCase("scisors") || eightHuman.equalsIgnoreCase("3")) {
			if (eightComputer == 1) {
				System.out.println("Rock! I win!");
			} else if (eightComputer == 2) {
				System.out.println("Paper! You win...");
			} else if (eightComputer == 3) {
				System.out.println("Scissors! It's a draw.");
			} else if (eightComputer == 4) {
				System.out.println("Lizard! You win...");
			} else if (eightComputer == 5) {
				System.out.println("Spock! I win!");
			} else {
				System.out.println("Something went wrong with the computer's move, it will never be fixed.");
			}
		} else if (eightHuman.equalsIgnoreCase("l") || eightHuman.equalsIgnoreCase("lizard") || eightHuman.equalsIgnoreCase("4")) {
			if (eightComputer == 1) {
				System.out.println("Rock! I win!");
			} else if (eightComputer == 2) {
				System.out.println("Paper! You win...");
			} else if (eightComputer == 3) {
				System.out.println("Scissors! I win!");
			} else if (eightComputer == 4) {
				System.out.println("Lizard! It's a draw");
			} else if (eightComputer == 5) {
				System.out.println("Spock! You win...");
			} else {
				System.out.println("Something went wrong with the computer's move, it will never be fixed.");
			}
		} else if (eightHuman.equalsIgnoreCase("sp") || eightHuman.equalsIgnoreCase("spock") || eightHuman.equalsIgnoreCase("5")) {
			if (eightComputer == 1) {
				System.out.println("Rock! You win...");
			} else if (eightComputer == 2) {
				System.out.println("Paper! I win!");
			} else if (eightComputer == 3) {
				System.out.println("Scissors! You win...");
			} else if (eightComputer == 4) {
				System.out.println("Lizard! You I win!");
			} else if (eightComputer == 5) {
				System.out.println("Spock! It's a draw.");
			} else {
				System.out.println("Something went wrong with the computer's move, it will never be fixed.");
			}
		} else {
			System.out.println("Invalid input.");
		}
		System.out.println();

		//7
		System.out.print("Do you want to continue? ");
		String seven = myScanObj.nextLine();
		if (seven.equals("Y") || seven.equals("Yes") || seven.equals("OK") || seven.equals("Sure") || seven.equals("Why not")) {
			System.out.println("OK");
		} else if (seven.equals("N") || seven.equals("No")) {
			System.out.println("Terminating...");
			System.exit(0);
		} else {
			System.out.println("Bad input. ");
		}
		System.out.println();

		//6
		System.out.print("Enter a two digit integer. ");
		int sixInt = myScanObj.nextInt();
		int sixTens = sixInt/10;
		int sixOnes = sixInt%10;
		String sixTensEvenOdd;
		String sixOnesEvenOdd;
		if (sixTens%2 == 0) {
			sixTensEvenOdd = "even";
		} else {
			sixTensEvenOdd = "odd";
		}
		if (sixOnes%2 == 0) {
			sixOnesEvenOdd = "even";
		} else {
			sixOnesEvenOdd = "odd";
		}
		System.out.println("The number in the tens place is " + sixTensEvenOdd + " and the number in the ones place is " + sixOnesEvenOdd + ", making the entire number " + sixOnesEvenOdd + ".");
		System.out.println();

		//5
		System.out.print("Enter a number. ");
		double fiveOne = myScanObj.nextDouble();
		if (fiveOne%2 == 0) {
			System.out.println(fiveOne + " is even.");
		} else {
			System.out.println(fiveOne + " is odd.");
		}
		System.out.println();
		myScanObj.nextLine();

		//4
		System.out.print("Enter string to be checked. ");
		String fourOne = myScanObj.nextLine();
		System.out.print("Enter another string to be checked. ");
		String fourTwo = myScanObj.nextLine();
		if (fourOne.equals(fourTwo)) {
			System.out.println("\"" + fourOne + "\" is the same as \"" + fourTwo + "\".");
		} else {
			System.out.println("\"" + fourOne + "\" is not the same as \"" + fourTwo + "\".");
		}
		System.out.println();

		//3
		double threeLargest;
		double threeSmallest;
		System.out.print("Enter the first number. ");
		double threeOne = myScanObj.nextDouble();
		System.out.print("Enter the second number. ");
		double threeTwo = myScanObj.nextDouble();
		System.out.print("Enter the third number. ");
		double threeThree = myScanObj.nextDouble();
		if (threeOne == threeTwo || threeOne == threeThree || threeTwo == threeThree) {
			System.out.println("None of the values can be equal. Try again next time.");
		} else {
			if (threeOne > threeTwo) {
				if (threeOne > threeThree) {
					threeLargest = threeOne;
				} else {
					threeLargest = threeThree;
				}
			} else {
				if (threeTwo > threeThree) {
					threeLargest = threeTwo;
				} else {
					threeLargest = threeThree;
				}
			}
			if (threeOne < threeTwo) {
				if (threeOne < threeThree) {
					threeSmallest = threeOne;
				} else {
					threeSmallest = threeThree;
				}
			} else {
				if (threeTwo < threeThree) {
					threeSmallest = threeTwo;
				} else {
					threeSmallest = threeThree;
				}
			}
			System.out.println(threeLargest + " is the largest and " + threeSmallest + " is the smallest.");
		}
		System.out.println();

		//2
		System.out.print("Enter an integer. ");
		int two = myScanObj.nextInt();
		if (two < 0 || two > 100) {
			System.out.println("Out of range.");
		}
		System.out.println();

		//1
		System.out.print("Enter a number. ");
		double one = myScanObj.nextDouble();
		if (one < 0) {
			System.out.println("Bad input.");
		} else {
			System.out.println("Good input.");
		}
	}
}