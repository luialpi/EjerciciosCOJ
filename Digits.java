import java.util.ArrayList;
import java.util.Scanner;

public class Digits {
	
	static public void digits(){
		Scanner sc = new Scanner(System.in);
		String lectura;
		int i=0;
		ArrayList<String> lista = new ArrayList<String>();
		while(i==0){
			
			lectura = sc.nextLine();
			
			if(lectura.equals("END")){
				i=1;
			}
			else if (lectura.equals("1")){
				lista.add("1");
			}
			else if(lectura.length()<2){
				lista.add("2");
			}
			else if(lectura.length()<10){
				lista.add("3");
				
			}
			else{
				lista.add("4");
			}
		}
		
		for(int j=0;j < lista.size();j++){
			System.out.println(lista.get(j));
		}
		sc.close();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digits();

	}

}
