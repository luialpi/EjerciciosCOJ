
import java.util.Scanner;

public class divCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int casos =sc.nextInt();

		int i=0;
	
;
		while(i<casos){
			String numero =sc.next();
			if((Integer.parseInt(numero.substring(numero.length()-1, numero.length())) %5 ==0)){
				System.out.println("YES");
				i++;
			}
			else{
				System.out.println("NO");
				i++;
			}
		}
		sc.close();
	}

}
