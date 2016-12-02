import java.util.ArrayList;
import java.util.Scanner;

public class maximumProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int cantidad=sc.nextInt(),numero;
		for (int i = 0; i < cantidad; i++) {
			numero=sc.nextInt();
			lista.add(numero);
		}
		int largo=lista.size(),resultado=0;
		for (int i = 0; i < largo; i++) {
			for (int j = i; j < largo; j++) {
				if(resultado<lista.get(j)-lista.get(i)){
					resultado=lista.get(j)-lista.get(i);
				}
			}
		}
		System.out.println(resultado);
	}

}
