import java.util.Scanner;

public class main {
	static int val;
	char arr[];
	
	public static void main(String[] args) {
	
	String input;
	Scanner scan = new Scanner(System.in);
	
	input = scan.nextLine();
	
	char arr[] = new char[input.length()];
	
	
	
	for (int i = 0; i < input.length(); i++) {

		char ch = 0;
		ch = input.charAt(i);
		arr[i] = ch;
		}
	
	
	first(input ,arr);
	
	}
	
	public static int first(String str, char[] arr) {
		//val = arr[0];
		
		String digitString = arr[0] + "";
		
		int indexOfPlus = str.indexOf("+");
		int indexOfMinus = str.indexOf("-");
		int indexOf;
		
		System.out.println(indexOfMinus);
		
		if (indexOfPlus > indexOfMinus && indexOfMinus != -1 || indexOfMinus > 0 && indexOfPlus == -1) {
			for (int i = 1; i < indexOfMinus; i++) {
				digitString = digitString + arr[i];
			}
			indexOf = indexOfMinus;
		}
		else if (indexOfPlus < indexOfMinus && indexOfPlus != -1 || indexOfPlus > 0 && indexOfMinus == -1) {
			for (int i = 1; i < indexOfPlus; i++) {
				digitString = digitString + arr[i];
			}
			indexOf = indexOfPlus;
		} else {
			for (int i = 1; i < str.length(); i++) {
				digitString = digitString + arr[i];
			}
			indexOf = str.length();
			val = Integer.valueOf(digitString);
			
			return 0;
		}
		
		System.out.println(digitString);
		str = str.substring(indexOf,str.length());
		
		arr = null;
		
		arr = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {

			char ch = 0;
			ch = str.charAt(i);
			arr[i] = ch;
			}
		
		System.out.println(arr);
		val = Integer.valueOf(digitString);
		
		calculate(str, arr);
		
		return 0;
	}
	
	
	public static int calculate(String str , char[] arr) {
		
		
		char operator = arr[0];
		
		str = str.substring(1, str.length());
		
		arr = null;
		
		arr = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {

			char ch = 0;
			ch = str.charAt(i);
			arr[i] = ch;
			}
		
		String digitString = arr[0] + "";
		
		int indexOfPlus = str.indexOf("+");
		int indexOfMinus = str.indexOf("-");
		int indexOf;
		
		
		if (indexOfPlus > indexOfMinus && indexOfMinus != -1 || indexOfMinus > 0 && indexOfPlus == -1) {
			for (int i = 1; i < indexOfMinus; i++) {
				digitString = digitString + arr[i];
			}
			indexOf = indexOfMinus;
		}
		else if (indexOfPlus < indexOfMinus && indexOfPlus != -1 || indexOfPlus > 0 && indexOfMinus == -1) {
			for (int i = 1; i < indexOfPlus; i++) {
				digitString = digitString + arr[i];
			}
			indexOf = indexOfPlus;
		} else {
			for (int i = 1; i < str.length(); i++) {
				digitString = digitString + arr[i];
			}
			
			if (operator == '+') {
				val = val + Integer.valueOf(digitString);
				System.out.println(val);
				
			} else if (operator == '-'){
				val = val - Integer.valueOf(digitString);
				System.out.println(val);
				
			}
			
			
			
			return 0;
		}
		
		if (operator == '+') {
			val = val + Integer.valueOf(digitString);
			System.out.println(val);
			
		} else if (operator == '-'){
			val = val - Integer.valueOf(digitString);
			System.out.println(val);
			
		}
		
		str = str.substring(indexOf, str.length());
		
		arr = null;
		
		arr = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {

			char ch = 0;
			ch = str.charAt(i);
			arr[i] = ch;
			}
		
		calculate(str, arr);
		
		return 0;
	}
	
	
}
