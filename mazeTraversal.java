import java.awt.Robot;
import java.util.Scanner;

public class mazeTraversal {
	
	static void robot(int i,int j,String matriz[][],Scanner sc){
		
		int direccion=1;
		String lectura;
		int ciclo=0;
		while(ciclo==0){
			lectura=sc.next();
			if(lectura.equals("Q")){
				ciclo=1;
			}
			if(lectura.equals("R")){
																																			qqqqqqqqqqqqqqqqqqqqq````````````````````````````````q		`		`	1``
			}
			if(lectura.equals("L")){
				
			}
			if(lectura.equals("F")){
				
			}
			
			if(direccion>3){
				direccion=0;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int i=sc.nextInt();
		int j=sc.nextInt();
		String matriz[][]=new String[i][j];
		int z=0;
		sc.nextLine();
		for (int x=0; x<matriz.length; x++) {
			z=0;
			String lectura=sc.nextLine();
			
			for (int y=0; y <matriz[1].length; y++) {
				//System.out.println("metio en: "+x+","+y);
				
				if (z<lectura.length()){
					matriz[x][y]=lectura.substring(z,z+1);
					z++;
				}
				
			}
			
		}
		for (int x=0; x<matriz.length; x++) {
			//System.out.println(lectura);
			for (int y=0; y <matriz[1].length; y++) {
				System.out.print(matriz[x][y]);
			}
			System.out.println();
		}
		
		
		int posX=sc.nextInt();
		System.out.println(posX);
		int posY=sc.nextInt();
		System.out.println(posY);
		robot(posX,posY,matriz,sc);
		sc.close();
	}

}
