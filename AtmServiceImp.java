package atmStimulationTeamWork;

import java.util.HashMap;
import java.util.Map;

public class AtmServiceImp implements AtmInterface {
	AtmEntity atmentity = new AtmEntity();

	Map<Double, String> ministmnt = new HashMap<>();

	public void fastCashWithdraw(double fastCashWithdraw) {
		if (fastCashWithdraw <= atmentity.getBalance()) {
			ministmnt.put(fastCashWithdraw, "amount withdrawn");
			System.out.println(fastCashWithdraw + " " + " Amount withdrawn successfully thank you");
			atmentity.setBalance(atmentity.getBalance() - fastCashWithdraw);
			ViewBalance();

		} else {
			System.out.println("Insufficent balance");
		}
		// TODO Auto-generated method stub

	}

	public void ViewBalance() {
		// TODO Auto-generated method stub
		System.out.println("your balance is:" + " " + atmentity.getBalance());

	}

	public void miniStatement() {
		// TODO Auto-generated method stub
		for (Map.Entry<Double, String> m : ministmnt.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());
		}

		ViewBalance();

	}

	public void depositeAmount(double depositeAmount) {
		// TODO Auto-generated method stub
		ministmnt.put(depositeAmount, "amount Deposited");
		System.out.println(depositeAmount + " " + "Deposited successfully");
		atmentity.setBalance(atmentity.getBalance() + depositeAmount);
		ViewBalance();
	}

	public void withdrawAmount(double withdrawaamount) {
		// TODO Auto-generated method stub
		if (withdrawaamount <= atmentity.getBalance()) {
			ministmnt.put(withdrawaamount, "amount withdrawn");
			System.out.println(withdrawaamount + " " + "Amount withdrawn  successfully thank you");
			atmentity.setBalance(atmentity.getBalance() - withdrawaamount);
			ViewBalance();

		} else {
			System.out.println("Insufficent balance");
		}

	}


}
