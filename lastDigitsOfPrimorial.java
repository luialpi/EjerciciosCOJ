import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class lastDigitsOfPrimorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int casos=sc.nextInt();
		
		ArrayList<Long> memo1 =new ArrayList<>();
		ArrayList<Long> memo2 =new ArrayList<>();
		while(casos>0){
			int cantidad=sc.nextInt();
			long total=1;
		
			for (long i = 0; i < cantidad; i++) {
				if(esPrimo(i)){
					total*=i;
				}
			}
			
			
			BigInteger division=new BigInteger("10000000000");
			BigInteger total2=new BigInteger(Long.toString(total));
			
			System.out.println(total2.mod(division));
			casos--;
		}
		
	}
	public static boolean esPrimo(long n){
		int a=0;
		for(int i=1;i<(n+1);i++){
			if(n%i==0){
				a++;
			}
		}
		if(a!=2){
			return false;
		}else{
			return true;
		}
	}
	

}
