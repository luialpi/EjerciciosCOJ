import java.util.Scanner;

public class longestRunOnASnowBoard {
	 private static int rowNbr[] = { -1, 0, 1, 0 };
	    private static int colNbr[] = { 0, -1, 0, 1 };

	    private static int fila, columna, contador, depth;

	    static boolean esSeguro(int M[][], int row, int col, boolean visitado[][],
	            int current) {
	        return (row >= 0) && (row < fila) && (col >= 0) && (col < columna)
	                && (M[row][col] < current && !visitado[row][col]);
	    }

	    public static void DFS(int M[][], int row, int col, boolean visitado[][]) {
	    	visitado[row][col] = true;

	        int current = M[row][col];
	        for (int k = 0; k < 4; ++k) {
	            if (esSeguro(M, row + rowNbr[k], col + colNbr[k], visitado, current)) {
	                depth++;
	                if (depth > contador) {
	                	contador++;
	                }
	                DFS(M, row + rowNbr[k], col + colNbr[k], visitado);
	            }
	        }
	        visitado[row][col] = false;
	        depth--;
	    }

	    public static void main(String[] args) {
	        int n;
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();

	        while (n > 0) {
	            int respuesta = -1;
	            String name = sc.next();
	            fila = sc.nextInt();
	            columna = sc.nextInt();

	            int[][] grid = new int[fila][columna];
	            boolean[][] visitado = new boolean[fila][columna];
	            for (int i = 0; i < fila; i++) {
	                for (int j = 0; j < columna; j++) {
	                    grid[i][j] = sc.nextInt();
	                    visitado[i][j] = false;
	                }
	            }
	            for (int i = 0; i < fila; i++) {
	                for (int j = 0; j < columna; j++) {
	                	contador = 0;
	                    depth = 0;
	                    visitaVacia(visitado);
	                    DFS(grid, i, j, visitado);
	                    if (contador > respuesta) {
	                        respuesta = contador;
	                    }

	                }

	            }
	            System.out.println(name + ": " + (respuesta + 1));
	            n--;
	        }
	        sc.close();

	    }

	    private static void visitaVacia(boolean[][] visitado) {
	        for (int i = 0; i < fila; i++) {
	            for (int j = 0; j < columna; j++) {
	            	visitado[i][j] = false;
	            }

	        }
	    }
}
