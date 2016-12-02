// Algoritmo encontrado en: https://www.youtube.com/watch?v=CE2b_-XfVDk
import java.util.ArrayList;
import java.util.Scanner;

public class longestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int casos=sc.nextInt();
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		while(casos>0){
			int cantidad=sc.nextInt();
			lista.clear();
			lista2.clear();
			for (int i = 0; i < cantidad; i++) {
				lista.add(sc.nextInt());
				lista2.add(1);
			}

			for( int i = 1; i < cantidad; i++ ){
				for (int j = 0; j < i; j++ ){
					if ( lista.get(i) > lista.get(j) && lista2.get(i) < lista2.get(j) + 1){
						lista2.set(i,lista2.get(j) + 1);
					}
				}
			}
			int salida=0;
			for( int i = 0; i < cantidad; i++ ){
				if (lista2.get(i)>salida){
					salida = lista2.get(i);
				}
			}
			
			System.out.println(salida);
			casos--;
		}
	}

}
