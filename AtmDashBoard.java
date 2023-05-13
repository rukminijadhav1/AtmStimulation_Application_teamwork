package atmStimulationTeamWork;

import java.util.Scanner;

public class AtmDashBoard {
	public static void main(String[] args) {

		AtmInterface iatmService = new AtmServiceImp();

		int choisefastCash;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome Alpha Coder ATM STIMULATIONS.");

		int ch;

		do {
			String visa = "Visa Card";
			String master = "Master Card";

			System.out.println("Select Your Card Type");

			System.out.println("1)" + " " + visa);
			System.out.println("2)" + " " + master);

			int selectCardN = scanner.nextInt();

			switch (selectCardN) {

			
			case 1:

				System.out.println("Enter your 16 digit Visa card number");
				String visaDigtNumber = scanner.next();

				boolean result =AtmValidation.visaCardNumberPattern(visaDigtNumber);
				if (!result) {
					System.out.println("Enter your 16 digit  Visa card number is invalied ");
					break;
				}

				System.out.println("Enter Your 4 digit pin");
				String visaPin = scanner.next();
				int backMenu;
				if (visaPin.length() == 4) {
					do {
						System.out.println("Select the Category");
						System.out.println("1) View Balance");
						System.out.println("2) Cash Deposite");
						System.out.println("3) Cash Withdrawal");
						System.out.println("4) Mini Statement");
						System.out.println("5) Fast cash Withdraw");
						int choosecategory = scanner.nextInt();
						switch (choosecategory) {
						case 1:
							iatmService.ViewBalance();
							break;
						case 2:
							System.out.println("Enter Deposite amount");
							double depositeAmount = scanner.nextDouble();
							iatmService.depositeAmount(depositeAmount);
							break;
						case 3:
							System.out.println("Enter Amount to be withdrawn");
							double withdrawaamount = scanner.nextDouble();
							iatmService.withdrawAmount(withdrawaamount);
							break;
						case 4:
							System.out.println("Check Mini Statement");
							iatmService.miniStatement();

							break;

						case 5:

							System.out.println("Select Fast Cash");

							double f1 = 1000;
							double f2 = 2000;
							double f3 = 4000;
							double f4 = 5000;
							double f5 = 10000;

							System.out.println("Select Your Amount");
							System.out.println("1) 1000");
							System.out.println("2) 2000");
							System.out.println("3) 4000");
							System.out.println("4) 5000");
							System.out.println("5) 10000");

							choisefastCash = scanner.nextInt();

							switch (choisefastCash) {

							case 1:
								iatmService.fastCashWithdraw(f1);
								break;

							case 2:
								iatmService.fastCashWithdraw(f2);
								break;
							case 3:
								iatmService.fastCashWithdraw(f3);
								break;
							case 4:
								iatmService.fastCashWithdraw(f4);
								break;
							case 5:
								iatmService.fastCashWithdraw(f5);
								break;
							}
							break;
						default:
							break;
						}
						System.out.println("You want to back start again press...6");
						backMenu = scanner.nextInt();

					} while (backMenu == 6);

				} else {
					System.out.println("You Enter Wrong pin Please try agian");

				}
				break;

			case 2:

				System.out.println("Enter your 16 digit Master card number");
				String masterDigtNumber = scanner.next();

				boolean resultm = AtmValidation.visaCardNumberPattern(masterDigtNumber);
				if (!resultm) {
					System.out.println("Enter your 16 digit  Master card number is invalied ");
					break;
				}

				System.out.println("Enter Your 4 digit pin");
				String masterPin = scanner.next();
				int backMenuMaster;
				if (masterPin.length() == 4) {
					do {
						System.out.println("Select the Category");
						System.out.println("1) View Balance");
						System.out.println("2) Cash Deposite");
						System.out.println("3) Cash Withdrawal");
						System.out.println("4) Mini Statement");
						System.out.println("5) Fast cash Withdraw");
						int choosecategory = scanner.nextInt();
						switch (choosecategory) {
						case 1:
							iatmService.ViewBalance();
							break;
						case 2:
							System.out.println("Enter Deposite amount");
							double depositeAmount = scanner.nextDouble();
							iatmService.depositeAmount(depositeAmount);
							break;
						case 3:
							System.out.println("Enter Amount to be withdrawn");
							double withdrawaamount = scanner.nextDouble();
							iatmService.withdrawAmount(withdrawaamount);
							break;
						case 4:
							System.out.println("Check Mini Statement");
							iatmService.miniStatement();

							break;

						case 5:

							System.out.println("Select Fast Cash");

							double f1 = 1000;
							double f2 = 2000;
							double f3 = 4000;
							double f4 = 5000;
							double f5 = 10000;

							System.out.println("Select Your Amount");
							System.out.println("1) 1000");
							System.out.println("2) 2000");
							System.out.println("3) 4000");
							System.out.println("4) 5000");
							System.out.println("5) 10000");

							choisefastCash = scanner.nextInt();

							switch (choisefastCash) {

							case 1:
								iatmService.fastCashWithdraw(f1);
								break;

							case 2:
								iatmService.fastCashWithdraw(f2);
								break;
							case 3:
								iatmService.fastCashWithdraw(f3);
								break;
							case 4:
								iatmService.fastCashWithdraw(f4);
								break;
							case 5:
								iatmService.fastCashWithdraw(f5);
								break;
							}
							break;
						default:

						}
						System.out.println("You want to back start again press...6");
						backMenu = scanner.nextInt();

					} while (backMenu == 6);

				} else {
					System.out.println("You Enter Wrong Pin Please try agian");

				}

			default:
				break;
			}

			System.out.println("You want to Continue.....press 1");
			ch = scanner.nextInt();

		} while (ch == 1);

	}
}


