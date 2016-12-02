import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class greedyAnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Float> lista = new ArrayList<Float>();
		sc.useLocale( new Locale("es", "MX"));
		DecimalFormat decimales = new DecimalFormat("0.00");
		DecimalFormatSymbols dfs = decimales.getDecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		decimales.setDecimalFormatSymbols(dfs);
		
		while(sc.hasNext()){
			
			int entradas= sc.nextInt();
			lista.clear();
			for(int i=entradas;i>0;i--){
				
				lista.add(sc.nextFloat());
			}
			
			Collections.sort(lista);
		
			int j=0,u=1,contador=1;
			while(j<entradas && u<entradas){
				if (Math.abs(lista.get(j)-lista.get(u))>1){
					contador++;
					j=u;
					u++;
				}
				else {
					u++;
				}
			
			}
			System.out.println(contador);
		}
		sc.close();
	}

}
