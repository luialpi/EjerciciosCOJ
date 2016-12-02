import java.util.Scanner;

public class mixedFractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		while(true){
			int numerador=sc.nextInt();
			int denominador=sc.nextInt();
			if(numerador==0 && denominador==0){
				break;
			}
			else{
				int n1=numerador/denominador;
				int n2=numerador%denominador;
				System.out.println(n1+" "+n2+" / "+denominador);
			}
		}
		sc.close();
	}

}
