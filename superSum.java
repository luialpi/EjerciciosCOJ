import java.math.BigInteger;
import java.util.Scanner;

public class superSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int casos=sc.nextInt();
		BigInteger numero=BigInteger.ZERO;
		for(int i=casos;i>0;i--){
			numero=numero.add(sc.nextBigInteger());
		}
		
		System.out.println(numero);
		sc.close();
	}

}
