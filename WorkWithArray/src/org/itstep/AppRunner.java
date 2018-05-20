package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		
		String[] compliments = new String [5];
		
		compliments[0] = "positive";
		compliments[1] = "why not?";
		compliments[2] = "relax!";
		compliments[3] = "shine!";
		compliments[4] = "beautiful";
		
//		int i = 0;
//		for( ; i<compliments.length; ) {
//			System.out.println("I am " + compliments[i]);
//			i++;
//		}
				

		
		
		for(String compliment:compliments) {
			
			if(!compliments[4].equals(compliment)) {
				System.out.println("I am " + compliment);
			}
			
		}
	}

}
