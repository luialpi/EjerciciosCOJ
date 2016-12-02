import java.util.ArrayList;
import java.util.Scanner;

public class Combinacion {
	
	static void mezclaPalabras(ArrayList<String> lista){
		int i=1;
		int e;
		String palabra="";
		String pfinal="";
		for(e=0;e <15;e++){
			i=1;
			while (i<lista.size()){
				if (e >= lista.get(i).length()){
					i++;
				}
				else{
					palabra=lista.get(i);
					pfinal+=palabra.charAt(e);
					i++;
				}
			}
			
		}
		System.out.println(pfinal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=0;
		ArrayList<String> lista =new ArrayList<String>();
		int numero = sc.nextInt();
		while(i<=numero){
			String palabra = sc.nextLine();
			lista.add(palabra);
			i++;
		}
		
		mezclaPalabras(lista);
		
		sc.close();
	}

}
