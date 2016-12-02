
import java.util.Scanner;

public class contestWithCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int casos=sc.nextInt();

		String nombre1,nombre2=" ";

		int [][] numeros;
		while(casos>0){

			int cantidad=sc.nextInt();

			numeros=new int [2][cantidad];

			nombre1=sc.next();
			for (int j = 0; j <= cantidad*2; j++) {

				if(j<cantidad){
					numeros[0][j]=sc.nextInt();
				}
				else if(j==cantidad){
					nombre2=sc.next();
				}
				else if(j>cantidad){
					numeros[1][j-(cantidad+1)]=sc.nextInt();
				}
			}


			int res1=0,res2=0;
			int suma1=0,suma2=0;
			
			for (int i = 0; i < numeros[0].length; i++) {
				//res1=0;
				//res2=0;
				for (int j = i; j < numeros[0].length; j++) {
	
					res1+=numeros[0][j];
					res2+=numeros[1][j];
					suma1=Math.max(res1,suma1);
					suma2=Math.max(res2,suma2);
					
				}
				res1=0;
				res2=0;
			}


			if(suma1 > suma2){
				System.out.println(nombre1+" "+suma1);
			}
			else if(suma1 == suma2){
				System.out.println("Tied "+suma1);
			}
			else{
				System.out.println(nombre2+" "+suma2);
			}

			casos--;
		}

		sc.close();
	}

}
