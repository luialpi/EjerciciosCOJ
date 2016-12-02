import java.math.BigInteger;
import java.util.Scanner;

public class grandesPotencias {
	
	public static void main(String[] args) {
		
		int ciclo=1;
		int contador=0;
		Scanner sc=new Scanner(System.in);
		while(ciclo==1 | contador==100000){
			
			contador++;
			BigInteger  m=sc.nextBigInteger();
			BigInteger  n=sc.nextBigInteger();
			if(m.intValue() ==0 & n.intValue()==0) {
				System.out.println("==0");
				ciclo=0;
				break;
			}
			if (n.compareTo(BigInteger.valueOf((int)Math.pow(10,101)))==1){
				//System.out.println("entro");
				//m=sc.nextBigInteger();
				//n=sc.nextBigInteger();
			}
			
		
			else{
				BigInteger resultado=m.pow(n.intValue());
				
				System.out.println(resultado.mod(BigInteger.valueOf(10)));
			}
		}
		sc.close();
	}

}
