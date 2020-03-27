package service;

public  class PersonalityCalculator{
	public String findYourBrainType(String input) {
		String result = null;
		if(input!=null) {
		int[] intArray = findanswer(input);
		int a=0,b=0,x=0;
		 
		for(int j=0;j<intArray.length;j++)
		{
			if(j==3 ||j==5 ||j==6 ||j==8 ||j==12 ||j==14 ||j==15||j==16 ||j==18)
			{	
				b+=intArray[j];
				
			}
			else
			{
				a+=intArray[j];
			}
	    }
		x=66-a+b;
		System.out.println(x);
		if(x>=20 && x<=55)
		{
			result="leftbrained";
		}
		else if(x>=56 && x<=64)
		{
			result="noclearpreference";
		}
		else
		{
			result="rightbrained";
		}
		}
	return result;
}

	public int[] findanswer(String inputString) {
	     String[] stringArray = inputString.split(",");
	      int[] intArray = new int[stringArray.length];
	      for (int i = 0; i < stringArray.length; i++) {
	         String numberAsString = stringArray[i];
	         intArray[i] = Integer.parseInt(numberAsString);
	      }
		return intArray;
	      
}
}