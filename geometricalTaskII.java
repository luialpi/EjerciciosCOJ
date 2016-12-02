import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class geometricalTaskII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S;
		Scanner sc=new Scanner(System.in);
		sc.useLocale( new Locale("es", "MX"));
		S=sc.next();
		DecimalFormat decimales = new DecimalFormat("0.00");
		DecimalFormatSymbols dfs = decimales.getDecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		decimales.setDecimalFormatSymbols(dfs);
		double resultado;
		double PI=3.14;
		if(S.equals("circle")){
			double r =sc.nextDouble();
			resultado=PI*r*r;
			
		}
		else {
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			resultado=(a*b)/2.0;
		}
		
		System.out.println(decimales.format(resultado));
		sc.close();
	}
	

}
