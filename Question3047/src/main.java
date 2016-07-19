import java.util.Scanner;

public class main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		String[] val = inputString.split(",");
		int A = Integer.valueOf(val[0]);
		int B = Integer.valueOf(val[1]);
		int C = Integer.valueOf(val[2]);
		
		int temp;
		
		
		if (A > B) {
			temp = A;
			A = B;
			B = temp;
		}
		if (B > C) {
			temp = B;
			B = C;
			C = temp;
		}
		if (A > B) {
			temp = A;
			A = B;
			B = temp;
		}
		
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		
		
	}
}
