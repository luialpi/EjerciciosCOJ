import java.util.ArrayList;
import java.util.Scanner;

public class lazyCat {
	ArrayList<Integer> primos =new ArrayList<>();
	public static boolean esPrimo(int n){
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
	
	public static boolean esPalindromo(int num){
		int num_inv = 0;   
		int div_entera = num;
		int resto_div = 0;

		while (div_entera != 0)
		{
			resto_div = div_entera % 10;
			div_entera = div_entera / 10;

			num_inv = num_inv * 10 + resto_div;
		}

		if (num == num_inv)
		{
			return true;
		}
		else
		{
			return false;
		} 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int casos=sc.nextInt();
		
		while(casos!=0){
			int suma=0;
			int x=sc.nextInt(),y=sc.nextInt();
			for(int i=x;i<=y;i++){
				if(esPrimo(i) && esPalindromo(i)){
					suma++;
				}
				
				
			}
			System.out.println(suma);
			casos--;
		}
	}
	
	
}
