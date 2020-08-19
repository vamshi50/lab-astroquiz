package utility;
import model.User;

interface EligibilityInterface{
	boolean checkUser (User user);
	boolean checkQuizAnswer (String points);
	boolean basicEligibilityCheck(User user);
}

