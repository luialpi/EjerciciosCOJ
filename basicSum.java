import java.util.ArrayList;
import java.util.Scanner;

public class basicSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> lista=new ArrayList<>();
		
		int largo=sc.nextInt();
		int sum=0;
		lista.add(sum);
		for (int i = 0; i < largo; i++) {

			
			sum+=sc.nextInt();
			lista.add(sum);
		}

		int casos=sc.nextInt(),x=0,y=0;
		
		while(casos>0){
			
			x=sc.nextInt();
			y=sc.nextInt();
			//System.out.println("primero "+lista.get(y)+" segundo "+lista.get(x-1));
			System.out.println(lista.get(y)-lista.get(x-1));
			casos--;
		}
		sc.close();

	}

}
