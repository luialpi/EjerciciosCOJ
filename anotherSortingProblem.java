import java.util.Scanner;

public class anotherSortingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int casos=sc.nextInt();
		for(int i=casos;i>0;i--){
			int digitos=sc.nextInt();
			int contador=0;
			for(int j=1;j<=digitos;j++){
				int numero=sc.nextInt();
				if (numero!=j){
					contador++;
				}
			}
			System.out.println(contador);
		}
		sc.close();
	}

}
