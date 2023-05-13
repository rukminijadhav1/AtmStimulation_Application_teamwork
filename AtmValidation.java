package atmStimulationTeamWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AtmValidation {
	final static String VISA_CARD_NO_PATTERN = "^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14})$";
	final static String MASTER_CARD_NO_PATTERN = "^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14})$";

	public static boolean visaCardNumberPattern(String visa) {
		Pattern p = Pattern.compile(VISA_CARD_NO_PATTERN);
		Matcher matcher = p.matcher(visa);
		return matcher.find();
	}

	public static boolean masterCardNumberPattern(String master) {
		Pattern p = Pattern.compile(MASTER_CARD_NO_PATTERN);
		Matcher matcher = p.matcher(master);
		return matcher.find();
	}

}
