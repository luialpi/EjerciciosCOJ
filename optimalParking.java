import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class optimalParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		ArrayList<Integer> tiendas = new ArrayList<>();
		int Cantidadtiendas;
	
		for(int c=casos;c>0;c--){
			Cantidadtiendas= sc.nextInt();
			tiendas.clear();
			for (int i=0;i<Cantidadtiendas;i++){
				
				tiendas.add(sc.nextInt());
				
			}
			Collections.sort(tiendas);
		
			System.out.println((tiendas.get(tiendas.size()-1)-tiendas.get(0))*2);
		}
		sc.close();
	}

}
