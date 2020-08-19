package utility;
import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		if(checkUser(user))
			return true;
		else
			return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int marks = Integer.parseInt(points);
		if(marks > 80)
			return true;
		else
			return false;
	}

	@Override
	public
	boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		int age=user.getAge();
		int height=user.getHeight();
		int weight=user.getWeight();
		String country=user.getCountry();
		if((age>=18 && age<=35) && (height>=155 && height<=170) && (weight>=55 &&weight<=90) && country.equals("ProGrad"))
			return true;
		else
			return false;
				
	}
	
}





