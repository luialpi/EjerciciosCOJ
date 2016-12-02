import java.util.Scanner;

public class Decimal {

	
	static void convertir_decimal(String digito){
		int i=0;
		int numero=2;
		int valor=0;
		int resultado=0;
		while(i < digito.length()){
			
			valor=(int)(digito.charAt(i));
			valor-=48;
			resultado+=valor*numero;
			numero+=2;
			i++;
			
		}
		
		System.out.println(resultado);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		String digito1 = sc.nextLine();
		String digito2 = sc.nextLine();
		String digito3 = sc.nextLine();
		convertir_decimal(digito1);
		convertir_decimal(digito2);
		convertir_decimal(digito3);
			
		
		sc.close();
	}


}
