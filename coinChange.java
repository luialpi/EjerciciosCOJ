import java.util.Scanner;

public class coinChange {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		while(sc.hasNext()){
			int numero=sc.nextInt();
			System.out.println(cChange(numero,0,0));
		}
	}
	
	public static int cChange(int m,int i,int contador){
		int[] monedas={50,25,10,5,1};
		
		if(m==0){
			return 1;
		}
		if(m<0){
			return 0;
		}
		if(i==-1){
			return 0;
		}
		if(i<=3){
			contador+=cChange(m-monedas[i],i,contador)+cChange(m,i+1,contador);
			
		}
		return contador;
		
		
	}
}
