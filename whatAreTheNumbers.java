import java.util.ArrayList;
import java.util.Scanner;

public class whatAreTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();

		int casos=sc.nextInt();
		for(int c=casos;c>0;c--){
			int cantNumeros=sc.nextInt();
			lista.clear();
			
			for(int x=cantNumeros;x>0;x--){
				int numero=sc.nextInt();
				if(lista.contains(numero)==true){
					System.out.println(numero);
				}
				else{
					lista.add(numero);
				}
			}
			
			if(lista.size()==cantNumeros){
				System.out.println("Not found!");
			}
		
		}
		sc.close();
		
		
	}

}
