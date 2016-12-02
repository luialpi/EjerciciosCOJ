import java.util.ArrayList;
import java.util.Scanner;

public class countingTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int casos=sc.nextInt();
		ArrayList<String> lista = new ArrayList<>();
		for(int i=0;i<=casos;i++){
			String palabra=sc.nextLine();
			lista.clear();
			for(int j=0;j<=palabra.length()-1;j++){
				if (lista.contains(palabra.substring(j, j+1))==false ){
					lista.add(palabra.substring(j, j+1));
				}
				
				
				
				
			}
			if(lista.size()!=0){
				System.out.println(lista.size());
			}
			
		}
		sc.close();
		
		
	}

}
