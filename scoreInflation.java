import java.util.ArrayList;
import java.util.Scanner;

public class scoreInflation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos=sc.nextInt();
		while(casos>0){
			
			int minutos = sc.nextInt();
			int numeroP = sc.nextInt();
			
		
	
			ArrayList<Integer> listaPuntos=new ArrayList<>();
			ArrayList<Integer> listaMinutos=new ArrayList<>();
			
			for(int i = 0; i < numeroP; i++){
				
				listaPuntos.add(i,sc.nextInt());
				listaMinutos.add(i,sc.nextInt());
			}
			
			//System.out.println(listaPuntos);
			//System.out.println(listaMinutos);
			System.out.println(adaptacionMochila(minutos,numeroP,listaPuntos,listaMinutos));
			casos--;
		}
	}
	
	
	
	/*
	 * 
	 * algoritmo utilizado encontrado en https://en.wikipedia.org/wiki/Knapsack_problem
	for j from 0 to W do:
		m[0, j] := 0
	for i from 1 to n do:
		for j from 0 to W do:
			if w[i] > j then:
				m[i, j] := m[i-1, j]
			else:
				m[i, j] := max(m[i-1, j], m[i-1, j-w[i]] + v[i])
	*/
				
	public static int adaptacionMochila(int m,int n,ArrayList<Integer> listaPuntos,ArrayList<Integer> listaMinutos){
		
		int[][] matriz = new int[n + 1][m + 1];
	
		for (int i = 0; i <= n; i++)
		{
			for (int j = 0; j <= m; j++)
			{
				if (i == 0 || j == 0){
					
					matriz[i][j] = 0;
				}
					
					
				else if (listaMinutos.get(i - 1) > j){
					matriz[i][j] = matriz[i - 1][j];
				}
					
				else{
					matriz[i][j] = Math.max(listaPuntos.get(i - 1) + matriz[i - 1][j - listaMinutos.get(i - 1)], matriz[i - 1][j]);

					
				}
					
			}
		}
		
		return matriz[n][m];
	}


}
