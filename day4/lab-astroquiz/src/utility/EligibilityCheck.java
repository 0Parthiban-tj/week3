package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean basicEligibilityCheck(User user) {
		EligibilityCheck echeck=new EligibilityCheck();
		return echeck.checkUser(user);
	}

	@Override
	public boolean checkUser(User user) {
		int age=user.getAge();
		int height=user.getHeight();
		int weight=user.getWeight();
		String country=user.getCountry();
		if((age>=18) && (age<=35) &&  (height>=155)&& (height<=170)&&(weight>=55)&&(weight<=90)&&(country=="ProGrad")) {
			return true;
		}
		else 
		{
			return false;
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkQuizAnswers(String points) {	
		int point=Integer.parseInt(points);
	
		if(point>=80) {
			return true;
		}
		else
		{
		return false;
		}
	}
	
}







