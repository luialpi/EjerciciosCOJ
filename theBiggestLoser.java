import java.text.DecimalFormat;
import java.util.Scanner;

public class theBiggestLoser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat fs = new DecimalFormat("###.##");
	
		
		while(true){
			int casos=sc.nextInt();
			if(casos==0){
				System.exit(0);
			}
			
			String nombreMujer="M",nombreHombre="H";
			
			float porcentajeHombre=0,porcentajeMujer=0;
		
			while(casos!=0){
		
				String lecturaNombre=sc.next();
				String lecturaGenero=sc.next();
				
				float pesoInicial=sc.nextFloat();
				float pesoFinal=sc.nextFloat();
				
				float porcentaje=((pesoInicial-pesoFinal)*100)/pesoInicial;
				
				if(lecturaGenero.equals("M")){
					if(porcentaje>porcentajeHombre){
						porcentajeHombre=porcentaje;
						nombreHombre=lecturaNombre;
						
					}
				}
				if(lecturaGenero.equals("F")){
					if(porcentaje>porcentajeMujer){
						porcentajeMujer=porcentaje;
						nombreMujer=lecturaNombre;
						
					}
				}
				casos--;
			}
			System.out.println(nombreHombre+" "+fs.format(porcentajeHombre)+"% "+nombreMujer+" "+fs.format(porcentajeMujer)+"%");
		}
	}

}
