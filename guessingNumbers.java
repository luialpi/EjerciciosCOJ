import java.util.Scanner;

public class guessingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int numero=sc.nextInt();
		int contador=0;
		while(numero>0){
			numero/=2;
			contador++;
		}
		System.out.println(contador);
		sc.close();
	}

}
