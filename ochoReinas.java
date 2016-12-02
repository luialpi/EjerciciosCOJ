import java.util.ArrayList;
import java.util.Scanner;


public class ochoReinas {
	public static class Reina{
		int i,j;
		public Reina(int i,int j){
			this.i =i;
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
					if(reinas.get(i).getI() == reinas.get(j).getI() || reinas.get(i).getJ() == reinas.get(j).getJ() ||
							Math.abs(reinas.get(i).getI() - reinas.get(j).getI()) == Math.abs(reinas.get(i).getJ() - reinas.get(j).getJ())){
						return false;
					}
						
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Reina> reinas = new ArrayList<>();
		char matriz[][]=new char[8][8];
		for (int k=0;k<8;k++){
			String lectura=sc.next();
			char [] reinas2 = lectura.toCharArray();
			matriz[k]=reinas2;
		}
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(matriz[i][j]=='*'){
					reinas.add(new Reina(i,j));
				}
			}
			
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
