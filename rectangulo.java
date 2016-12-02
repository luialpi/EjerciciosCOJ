import java.util.Scanner;

public class rectangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		n1^=sc.nextInt();
		n2^=sc.nextInt();
		
	
		n1^=sc.nextInt();
		n2^=sc.nextInt();
		System.out.print(n1+" "+n2);
		sc.close();
	}

}
