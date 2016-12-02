import java.util.ArrayList;
import java.util.Scanner;

public class eightQueens {
	static public class Reina{
		int i,j;
		public Reina(int i,int j){
			this.i=i;
			this.j=j;
		}
		public int getI() {
			return i;
		}
		public int getJ() {
			return j;
		}

	}
	static boolean validar(ArrayList<Reina> reinas){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(i != j){
					if(reinas.get(i).getI() == reinas.get(j).getI() | reinas.get(i).getJ() == reinas.get(j).getJ() | 
							Math.abs(reinas.get(i).getI() - reinas.get(j).getI()) == Math.abs(reinas.get(i).getJ() - reinas.get(j).getJ())){
						return false;
					}
						
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		
		ArrayList<Reina> reinas=new ArrayList<>();
		int m=0,n=0;
		while(n<8){
			m=0;
			System.out.println("salio");
			while(m<8){
				
				String palabra=sc.next();
				if(palabra.equals("*")){
					reinas.add(new Reina(n,m));
				}
				m++;
			}
			n++;
			
		}
		
		
		if(validar(reinas)==true){
			System.out.println("valid");
		}
		else{
			System.out.println("invalid");
		}

		sc.close();



	}

}
