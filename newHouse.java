import java.util.*;

public class newHouse {

    static int mayor = 0;
    static ArrayList<Integer> resultados = new ArrayList<Integer>();
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        while(cantidad > 0){
            
            int dimension = sc.nextInt();
            int[][] matriz = new int[dimension][dimension];
            int i = 0;
            
            while(i < dimension){
                
                
                String fila = sc.next();
                char fil[] = fila.toCharArray();
                
                for (int j = 0; j < fila.length(); j++) {
                    
                    if(fil[j] == '#'){
                        matriz[i][j] = 0;
                    }
                    
                    else if(i==0 | j==0 && fil[j] == '.'){
                        matriz[i][j] = 1;
                    }
                    
                    else {
                        if(sacar_menor(i,j,matriz) > mayor){
                            mayor = sacar_menor(i, j, matriz);
                        }
                        matriz[i][j] = sacar_menor(i,j,matriz);
                    }
                }
                i++;
            }
            resultados.add(mayor);
            mayor = 0;
            cantidad--;
        }
        for (int x = 0; x < resultados.size(); x++) {
            System.out.println(resultados.get(x));
        }
        
    }
    
    public static int sacar_menor(int i,int j,int[][] matriz){
        int menor = 1000;
        if(matriz[i-1][j] < menor){
            menor = matriz[i-1][j];
        }
        if(matriz[i-1][j-1] < menor){
            menor = matriz[i-1][j-1];
        }
        if(matriz[i][j-1] < menor){
            menor = matriz[i][j-1];
        }
        menor = menor+1;
        return menor;
    }
    
    public static void imprimir(int[][] matriz,int dimension){
        for (int i = 0; i < dimension; i++) {
            System.out.println(" ");
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
    
}
