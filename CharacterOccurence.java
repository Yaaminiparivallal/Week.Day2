package week1.day2;

public class CharacterOccurence {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char x = 'e';
		int count =0;
		
		//char[] ch = str.toCharArray();
		//int len = str.length();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==x) {
				count++;
				
			}	
			
		}
		System.out.println("The Character '"+x+"' appears "+count+" times.");	
		

	}

}