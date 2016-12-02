import java.util.ArrayList;
import java.util.Scanner;

public class Prince {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt(), res = 0;
		
		while(casos > 0){
		
			int n = sc.nextInt();
			int m = sc.nextInt();
			ArrayList<Integer> lista1=new ArrayList<>();
			ArrayList<Integer> lista2=new ArrayList<>();
			
			for(int i = 0; i < n; i++){
				
				lista2.add(i,sc.nextInt());
				lista1.add(i,sc.nextInt());
			}
					
			res += adaptacionMochila(m,n,lista1,lista2);
			
			casos--;
			
		}
		
		System.out.println(res);
		
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
				
	public static int adaptacionMochila(int m,int n,ArrayList<Integer> lista1,ArrayList<Integer> lista2){
		
		int[][] matriz = new int[n + 1][m + 1];
	
		for (int i = 0; i <= n; i++)
		{
			for (int j = 0; j <= m; j++)
			{
				if (i == 0 || j == 0){
					
					matriz[i][j] = 0;
				}
					
					
				else if (lista2.get(i - 1) > j){
					matriz[i][j] = matriz[i - 1][j];
				}
					
				else{
					matriz[i][j] = Math.max(lista1.get(i - 1) + matriz[i - 1][j - lista2.get(i - 1)], matriz[i - 1][j]);

					
				}
					
			}
		}
		
		return matriz[n][m];
	}

}