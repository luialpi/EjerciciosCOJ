import java.math.BigInteger;
import java.util.Scanner;
public class sumaDePermutaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int casos=sc.nextInt();//leer el numero de casos
		
		while(casos>0){
			int n=sc.nextInt();//leer el n
			long total=0;
			for (int i = 0; i < n; i++) {
				long x=Factorial(n),y=Factorial(n-i);
				long t;
				if(x==0 && y==0){
					t=1;
				}
				else{
					t=(x/y);
				}
				
				total+=t;//calculo la sumatoria con cada factorial
			}
			System.out.println(total);//doy el resultado
			casos--;
		}
		
		sc.close();

	}
	
	public static long Factorial(int n){
		long total=1;;
		//System.out.println("n fac: "+n);
		for (int i = 1; i <=n; i++) {
			total*=i;
		}
		//System.out.println("Fac"+total);
		return total%1000003;
		
	}
	

}
