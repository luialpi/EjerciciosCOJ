import java.math.BigInteger;
import java.util.Scanner;

public class tasf {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int casos=sc.nextInt();
		BigInteger numero;
		String palabra;
		
		for (int i=casos;i>0;i--){
			numero=sc.nextBigInteger();
			palabra = sc.next();
			int len=palabra.length();
			numero = numero.mod(new BigInteger(Integer.toString(len)));
			String salida[]=new String[len];
			int u=0;
			
			for (int j =new BigInteger(Integer.toString(len)).subtract(numero).intValue(); j<len; j++) {
				salida[u]=palabra.substring(j,j+1);
				u++;
			}
			numero = new BigInteger(Integer.toString(len)).subtract(numero);
			
			for (int k=0; k<numero.intValue(); k++) {
				
				salida[u]=palabra.substring(k, k+1);
				u++;
			}
			
			for(int p=0;p<salida.length;p++){
				System.out.print(salida[p]);
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}
