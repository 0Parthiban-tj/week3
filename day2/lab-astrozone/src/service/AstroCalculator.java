package service;

import model.User;

public class AstroCalculator {
	public String findSign(User user) {
			      int day = Integer.parseInt(user.getdob().split("-")[0]);
			      System.out.println(day);
			      String month = user.getdob().split("-")[1];
			      System.out.println(month);
			      String sign="";
			      if (month.equals("01")) {
			         if (day < 20)
			            sign = "Capricorn";
			         else
			            sign = "Aquarius";
			      } else if (month.equals("02")) {
			         if (day < 19)
			            sign = "Aquarius";
			         else
			            sign = "Pisces";
			      } else if(month.equals("03")) {
			         if (day < 21)
			            sign = "Pisces";
			         else
			            sign = "Aries";
			      } else if (month.equals("04")) {
			         if (day < 20)
			            sign = "Aries";
			         else
			            sign = "Taurus";
			      } else if (month.equals("05")) {
			         if (day < 21)
			            sign = "Taurus";
			         else
			            sign = "Gemini";
			      } else if(month.equals("06")) {
			         if (day < 21)
			            sign = "Gemini";
			         else
			            sign = "Cancer";
			      } else if (month.equals("07")) {
			         if (day < 23)
			            sign = "Cancer";
			         else
			            sign = "Leo";
			      } else if(month.equals("08")) {
			         if (day < 23) 
			            sign = "Leo"; 
			         else
			            sign = "Virgo";
			      } else if (month.equals("09")) {
			         if (day < 23)
			            sign = "Virgo";
			         else
			            sign = "Libra";
			      } else if (month.equals("10")) {
			         if (day < 23)
			            sign = "Libra";
			         else
			            sign = "Scorpio";
			      } else if (month.equals("11")) {
			         if (day < 22)
			            sign = "Scorpio";
			         else
			            sign = "Sagittarius";
			      } else if (month.equals("12")) {  
			         if (day < 22)
			            sign = "Sagittarius"; 
			         else
			            sign ="Capricorn";
			      }
			    //  System.out.println("The astrological sign for " + day + " " + month + " is " + sign );
			   
		return sign;
	}
}
