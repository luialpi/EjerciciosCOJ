import java.util.ArrayList;
import java.util.Scanner;

public class problemaDeTresMasUno {
	static ArrayList<Integer> contadores=new ArrayList<>();
	static ArrayList<Integer> entradas=new ArrayList<>();
	static int cache[]=new int[1000000];
	public static void leer(){
		
		
		Scanner sc =new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int limite=1000000;
			Integer inicio=sc.nextInt();
			if (inicio>limite | inicio<=0 )break;
			Integer fin=sc.nextInt();	
		
			if (fin>limite | fin<=0)break;

			else{
				//System.out.println("inicio: "+inicio);
				//System.out.println("fin: "+fin);

				solucion(inicio,fin);
			}

		}
		sc.close();
	}
		
	
	public static void solucion(int inicio, int fin){
		int contador=0,validador=0;

		int contador2=0;
		
		for(int i=inicio;i<=fin;i++){
			int n=i;
			//System.out.println("n: "+n);
			while(validador==0){
				//System.out.println(n);
				
				if (n==1){
					//contador++;
					validador=1;
	
				}
				
				if (n < 1000000 && cache[(int)n] != 0){
			 
					n=cache[n];
					//System.out.println("entra"+cache[n]);
					contador++;
				}
				else if(n%2==1){
					cache[n]=(n*3)+1;
					n=cache[n];
					contador++;
					//System.out.println("impar"+n);

				}
				else{
					cache[n]=n/2;
					n=cache[n];
					contador++;
					//System.out.println("par:"+n);
					
				}
			}
			validador=0;
			if (contador2<=contador){
				contador2=contador;
			}
			//System.out.println(contador2);
			contador=0;
			
		}
		contadores.add(contador2);
		System.out.println(inicio+" "+fin+" "+contador2);
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leer();
	}

}
