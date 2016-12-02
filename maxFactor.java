import java.util.ArrayList;
import java.util.Scanner;

public class maxFactor {
	static ArrayList<Integer> factorPrimoMasAlto=new ArrayList<>();
	static ArrayList<Integer> entradas=new ArrayList<>();
	public static void main (String [ ] args) 
	{
		int k=0;
		Scanner sc = new Scanner(System.in);
		int casos=sc.nextInt();
		for(int j=0;j<casos;j++){
			factorPrimoMasAlto.add(j, 0);
		}
		for(int i=0;i<casos;i++){


			int numero = sc.nextInt();
			entradas.add(i, numero);
			factor(numero,k);
			k++;
		}
		int mayor=0;
		for(int p=0;p<factorPrimoMasAlto.size()-1;p++){

			if(mayor<factorPrimoMasAlto.get(p)){
				mayor=factorPrimoMasAlto.get(p);
			}

		}

		int posicion=factorPrimoMasAlto.indexOf(mayor);
		System.out.print(entradas.get(posicion));
		sc.close();
	}
	public static boolean esPrimo(int numero){
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}

	static void factor(int numero,int i){
		int num = 2;
		int anterior=0;

		while(!esPrimo(numero)){
			if(anterior<num){
				
				factorPrimoMasAlto.set(i, num);
				numero /= num;
			}
			else{
				factorPrimoMasAlto.set(i,anterior);
			}



		}
		if(factorPrimoMasAlto.get(i)<numero){
			factorPrimoMasAlto.set(i,numero);
		}
		


	}


}
