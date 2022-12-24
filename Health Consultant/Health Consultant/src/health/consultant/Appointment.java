package health.consultant;

import java.util.Scanner;

public class Appointment {
	private String[] phone_no = new String[100];
	private int ccachoice;
	private int n = 50000;

	public Appointment() {
	}

	public void take_appointment() {
		while (true) {
			System.out.println();
			System.out.println("Choose from the list below to take appointment: ");
			System.out.println("a. Covid 19.");
			System.out.println("b. HIV.");
			System.out.println("c. Cancer.");
			System.out.println("d. Dengue.");
			System.out.println("e. Diarrhoea.");
			System.out.println("f. Diabetes");
			System.out.println("g. Typhoid");
			System.out.println("h. Jaundice");
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
			Scanner Achoice = new Scanner(System.in);
			char achoice = Achoice.next().charAt(0);
			if (achoice == 'a' || achoice == 'A') {
				System.out.println();
				String[] nphone_no = new String[n];
				for (int i = 0; i < 1; i++) {
					while(true) {
						Scanner sc = new Scanner(System.in);
						System.out.print("Enter your phone number: ");
						nphone_no[i] = sc.nextLine();
						if(nphone_no[i].charAt(0) == '0' && nphone_no[i].charAt(1) == '1' && nphone_no[i].length() == 11) {
							break;
						}
						else
							System.out.println("Invalid phone number. Please enter a valid phone number.");
					}
				}
				System.out.println();
				System.out.println("Take appointment with: ");
				System.out.println("1. Dr. X, Time: 10am - 2pm, Date: Sun/Tue/Thu");
				System.out.println("2. Dr. Y, Time: 2pm - 6pm, Date: Sat/Mon/Wed");
				System.out.println("3. Dr. Z, Time: 6pm - 10pm, Date: Thu/Fri/Sat");
				System.out.println();
				while (true) {
					System.out.print("Choice: ");
					Scanner cachoice = new Scanner(System.in);
					ccachoice = cachoice.nextInt();
					System.out.println();
					if (ccachoice == 1) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 800Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1000Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 2) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 1200Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1500Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 3) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 960Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1200Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					}
				}
			} 
			else if (achoice == 'b' || achoice == 'B') {
				System.out.println();
				String[] nphone_no = new String[n];
				for (int i = 0; i < 1; i++) {
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter your phone number: ");
					nphone_no[i] = sc.nextLine();
				}
				System.out.println();
				System.out.println("Take appointment with: ");
				System.out.println("1. Dr. X, Time: 10am - 2pm, Date: Sun/Tue/Thu");
				System.out.println("2. Dr. Y, Time: 2pm - 6pm, Date: Sat/Mon/Wed");
				System.out.println("3. Dr. Z, Time: 6pm - 10pm, Date: Thu/Fri/Sat");
				System.out.println();
				while (true) {
					System.out.print("Choice: ");
					Scanner cachoice = new Scanner(System.in);
					ccachoice = cachoice.nextInt();
					System.out.println();
					if (ccachoice == 1) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 800Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1000Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 2) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 1200Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1500Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 3) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 960Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1200Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					}
				}
			}
			else if (achoice == 'c' || achoice == 'C') {
				System.out.println();
				String[] nphone_no = new String[n];
				for (int i = 0; i < 1; i++) {
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter your phone number: ");
					nphone_no[i] = sc.nextLine();
				}
				System.out.println();
				System.out.println("Take appointment with: ");
				System.out.println("1. Dr. X, Time: 10am - 2pm, Date: Sun/Tue/Thu");
				System.out.println("2. Dr. Y, Time: 2pm - 6pm, Date: Sat/Mon/Wed");
				System.out.println("3. Dr. Z, Time: 6pm - 10pm, Date: Thu/Fri/Sat");
				System.out.println();
				while (true) {
					System.out.print("Choice: ");
					Scanner cachoice = new Scanner(System.in);
					ccachoice = cachoice.nextInt();
					System.out.println();
					if (ccachoice == 1) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 800Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1000Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 2) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 1200Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1500Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 3) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 960Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1200Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					}
				}
			}
			else if (achoice == 'd' || achoice == 'D') {
				System.out.println();
				String[] nphone_no = new String[n];
				for (int i = 0; i < 1; i++) {
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter your phone number: ");
					nphone_no[i] = sc.nextLine();
				}
				System.out.println();
				System.out.println("Take appointment with: ");
				System.out.println("1. Dr. X, Time: 10am - 2pm, Date: Sun/Tue/Thu");
				System.out.println("2. Dr. Y, Time: 2pm - 6pm, Date: Sat/Mon/Wed");
				System.out.println("3. Dr. Z, Time: 6pm - 10pm, Date: Thu/Fri/Sat");
				System.out.println();
				while (true) {
					System.out.print("Choice: ");
					Scanner cachoice = new Scanner(System.in);
					ccachoice = cachoice.nextInt();
					System.out.println();
					if (ccachoice == 1) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 800Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1000Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 2) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 1200Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1500Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 3) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 960Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1200Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					}
				}
			}
			else if (achoice == 'e' || achoice == 'E') {
				System.out.println();
				String[] nphone_no = new String[n];
				for (int i = 0; i < 1; i++) {
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter your phone number: ");
					nphone_no[i] = sc.nextLine();
				}
				System.out.println();
				System.out.println("Take appointment with: ");
				System.out.println("1. Dr. X, Time: 10am - 2pm, Date: Sun/Tue/Thu");
				System.out.println("2. Dr. Y, Time: 2pm - 6pm, Date: Sat/Mon/Wed");
				System.out.println("3. Dr. Z, Time: 6pm - 10pm, Date: Thu/Fri/Sat");
				System.out.println();
				while (true) {
					System.out.print("Choice: ");
					Scanner cachoice = new Scanner(System.in);
					ccachoice = cachoice.nextInt();
					System.out.println();
					if (ccachoice == 1) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 800Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1000Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 2) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 1200Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1500Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 3) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 960Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1200Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					}
				}
			}
			else if (achoice == 'f' || achoice == 'F') {
				System.out.println();
				String[] nphone_no = new String[n];
				for (int i = 0; i < 1; i++) {
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter your phone number: ");
					nphone_no[i] = sc.nextLine();
				}
				System.out.println();
				System.out.println("Take appointment with: ");
				System.out.println("1. Dr. X, Time: 10am - 2pm, Date: Sun/Tue/Thu");
				System.out.println("2. Dr. Y, Time: 2pm - 6pm, Date: Sat/Mon/Wed");
				System.out.println("3. Dr. Z, Time: 6pm - 10pm, Date: Thu/Fri/Sat");
				System.out.println();
				while (true) {
					System.out.print("Choice: ");
					Scanner cachoice = new Scanner(System.in);
					ccachoice = cachoice.nextInt();
					System.out.println();
					if (ccachoice == 1) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 800Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1000Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 2) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 1200Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1500Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 3) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 960Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1200Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					}
				}
			}
			else if (achoice == 'g' || achoice == 'G') {
				System.out.println();
				String[] nphone_no = new String[n];
				for (int i = 0; i < 1; i++) {
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter your phone number: ");
					nphone_no[i] = sc.nextLine();
				}
				System.out.println();
				System.out.println("Take appointment with: ");
				System.out.println("1. Dr. X, Time: 10am - 2pm, Date: Sun/Tue/Thu");
				System.out.println("2. Dr. Y, Time: 2pm - 6pm, Date: Sat/Mon/Wed");
				System.out.println("3. Dr. Z, Time: 6pm - 10pm, Date: Thu/Fri/Sat");
				System.out.println();
				while (true) {
					System.out.print("Choice: ");
					Scanner cachoice = new Scanner(System.in);
					ccachoice = cachoice.nextInt();
					System.out.println();
					if (ccachoice == 1) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 800Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1000Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 2) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 1200Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1500Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 3) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 960Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1200Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					}
				}
			}
			else if (achoice == 'h' || achoice == 'H') {
				System.out.println();
				String[] nphone_no = new String[n];
				for (int i = 0; i < 1; i++) {
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter your phone number: ");
					nphone_no[i] = sc.nextLine();
				}
				System.out.println();
				System.out.println("Take appointment with: ");
				System.out.println("1. Dr. X, Time: 10am - 2pm, Date: Sun/Tue/Thu");
				System.out.println("2. Dr. Y, Time: 2pm - 6pm, Date: Sat/Mon/Wed");
				System.out.println("3. Dr. Z, Time: 6pm - 10pm, Date: Thu/Fri/Sat");
				System.out.println();
				while (true) {
					System.out.print("Choice: ");
					Scanner cachoice = new Scanner(System.in);
					ccachoice = cachoice.nextInt();
					System.out.println();
					if (ccachoice == 1) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 800Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1000Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 2) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 1200Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1500Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					} else if (ccachoice == 3) {
						System.out.println("Your appointment with Dr. X. confirmed.");
						for (int i = 0; i < nphone_no.length; i++) {
							if (nphone_no[i].equals(phone_no[i])) {
								System.out.println("Its look like you are old patient.");
								System.out.println("So, you getting 20% off!!");
								System.out.println();
								System.out.println("Visit fee: 960Tk ");
								break;
							} else if (nphone_no[i] != phone_no[i]) {
								System.out.println("Visit fee: 1200Tk ");
								phone_no[i] = nphone_no[i];
								break;
							}
						}
						System.out.println();
						System.out.println("Pay with 1.Bkash/2.Nogod/3.Rocket.");

						while (true) {
							System.out.print("Enter choice: ");
							Scanner feeSc = new Scanner(System.in);
							int fee = feeSc.nextInt();
							System.out.println();
							if (fee == 1) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 2) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else if (fee == 3) {
								System.out.println("Send money to: 01XXX-XXXXXX");
								break;
							} else
								System.out.println("Wrong input.Try again.");
						}
						break;
					}
				}
			}
			else if(achoice == '0') {
				break;
			}
			else
				System.out.println("Wrong input.");
		}
	}
}