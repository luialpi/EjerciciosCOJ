import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class cocoBitsAndTheWell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		sc.useLocale( new Locale("es", "MX"));
		int casos=sc.nextInt();
		DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
		simbolos.setDecimalSeparator('.');
		DecimalFormat formato=new DecimalFormat("0.00",simbolos);
		for(int i=casos;i>0;i--){
			double numero=sc.nextDouble();
			double radio=numero/2;
			double areaCirculo=Math.PI*radio*radio;
			double areaCuadro=numero*numero;
			System.out.println(formato.format(areaCuadro-areaCirculo));
		}
		sc.close();
	}
	

}
