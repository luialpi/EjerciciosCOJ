import java.util.ArrayList;
import java.util.Scanner;

public class rangeSumQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int casos=sc.nextInt();
		ArrayList<Long>lista=new ArrayList<>();
		ArrayList<Long>lista2=new ArrayList<>();
		while(casos!=0){
			int n=sc.nextInt(),q=sc.nextInt();
			lista.clear();
			lista2.clear();
			long sum=0;
			
			
			for (int i = 0; i < n; i++) {
				long numero=sc.nextLong();
				lista.add(numero);
				sum+=numero;
				lista2.add(sum);
			}
			
			while(q>0){
			
				int i=sc.nextInt(),j=sc.nextInt();
				
				if(i==j){
					System.out.println(lista.get(i));
				}
				else if(i==0){
					System.out.println(lista2.get(j));
				}
				else{
					System.out.println(lista2.get(j)-lista2.get(i-1));
					
				}
				
				q--;
			}
			
			casos--;
			
			if(casos != 0){
				
				System.out.println();
			}
		}

	}

}
