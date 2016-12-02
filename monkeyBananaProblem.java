import java.util.Scanner;

public class monkeyBananaProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), N, cont, numCaso = 1;
		int[][] matriz;
		boolean boleano;
		
		while(T != 0){
			
			N = sc.nextInt();
			matriz = new int[2*N - 1][N];
			cont = 0;
			boleano = false;
			
			//Esta funcion se encarga de generar la matriz que se usa para sacar el resultado.
			for(int i = 0; i < 2*N - 1; i++){
				
				if(!boleano){
					
					cont++;
					
				}else{
					
					cont--;
				}
				
				if(cont > N){
					
					boleano = true;
					cont = N - 1;
				}
				
				for(int j = 0; j < cont; j++){
					
					matriz[i][j] = sc.nextInt();
				}
				
				for(int j = cont; j < N; j++){
					
					matriz[i][j] = 0;
				}
			}
			
			
			//Estas dos funciones de abajo se encargan de sacar el camino que tenga mayor valor, el resultado va a quedar
			//en la primera posicion de la ultima fila.
			for(int i = 1; i < N; i++){
				
				for(int j = 0; j < N; j++){
										
					if(j == 0){
						
						matriz[i][j] += Math.max(matriz[i - 1][j], 0);
					
					}else{
						
						matriz[i][j] += Math.max(matriz[i - 1][j], matriz[i - 1][j - 1]);
					}
				}
			}	
			
			for(int i = N; i < (N + N - 1); i++){
				
				for(int j = 0; j < N; j++){
										
					if(j == N - 1){
						
						matriz[i][j] += Math.max(matriz[i - 1][j], 0);
					
					}else{
						
						matriz[i][j] += Math.max(matriz[i - 1][j], matriz[i - 1][j + 1]);
					}
				}
			}
			
			
			System.out.println("Case " + numCaso + ": " + matriz[N*2 -2][0] );
			numCaso++;
			T--;
		}
	}

}