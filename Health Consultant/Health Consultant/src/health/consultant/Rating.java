package health.consultant;

import java.util.Scanner;

public class Rating {
	public Rating() {}
	public void rating() {
		System.out.println("Rate us");
		System.out.println("1. * (Wrost Experience)");
		System.out.println("2. ** (Bad Experience");
		System.out.println("3. *** (Average Experience)");
		System.out.println("4. **** (Good Experience)");
		System.out.println("5. ***** (Best Experience)");
		System.out.println();
		while(true) {
			System.out.print("Input Rating (*): ");
			Scanner rsc = new Scanner(System.in);
			String rating = rsc.nextLine();
			if(rating.equals("*")) {
				System.out.println("Thanks for rating us. Give your feedback for improvment");
				System.out.println();
				System.out.print("Your Feedback:");
				Scanner fsc = new Scanner(System.in);
				@SuppressWarnings("unused")
				String feedback = fsc.nextLine();
				break;
			}
			else if(rating.equals("**")) {
				System.out.println("Thanks for rating us. Give your feedback for improvment");
				System.out.println();
				System.out.print("Your Feedback:");
				Scanner ffsc = new Scanner(System.in);
				@SuppressWarnings("unused")
				String ffeedback = ffsc.nextLine();
				break;
			}
			else if(rating.equals("***")) {
				System.out.println("Thanks for rating us. Give your feedback for further improvment");
				Scanner fffsc = new Scanner(System.in);
				@SuppressWarnings("unused")
				String fffeedback = fffsc.nextLine();
				break;
			}
			else if(rating.equals("****")) {
				System.out.println("Thanks for rating us.");
				break;
			}
			else if(rating.equals("*****")) {
				System.out.println("Thanks for rating us.");
				break;
			}
			else
				System.out.println("Wrong input.");
		}
	}

}
