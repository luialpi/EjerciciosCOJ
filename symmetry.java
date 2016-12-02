import java.util.Scanner;

public class symmetry {

	public static void main(String[] args) {
		// TODO Auto-generated method sub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int cantVacas=0;
		int exponente=0;
		while(n%2!=0 && m%2!=0){
			cantVacas+=Math.pow(4, exponente);
			exponente++;
			n/=2;
			m/=2;
		}
		System.out.println(cantVacas);
	}

}
