package chapter1;

import java.util.Scanner;

public class EggExample {
	public static void main(String[] args) {

		int eggs; // Number of eggs, input by user.
		int gross; // How many gross in that number of eggs?
		int aboveGross; // How many eggs are left over, above an
						// integral number of gross? This number
						// can be computed as eggs % 144, and is
						// in the range 0 to 143. This number will
						// be divided into dozens and extras.
		int dozens; // How many dozens in aboveGross?
		int extras; // How many eggs are left over, above integral
					// numbers of gross and dozens?

		System.out.print("How many eggs do you have?  ");
		eggs = new Scanner(System.in).nextInt();
		
		gross = eggs / 144;
		aboveGross = eggs%144;
		
		dozens = aboveGross/12;
		extras = aboveGross%12;
		
		System.out.print("You have totally ");
		System.out.print(gross + " gross, ");
		System.out.print(dozens + " dozens, ");
		System.out.println("and " + extras + " eggs");
	}
}
