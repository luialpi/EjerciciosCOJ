import java.util.Scanner;

public class tryTilling {

	static int memoize[] = new int[16];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		while(true){
			
			numero = sc.nextInt();
					
			if(numero == -1){
				
				break;
				
			}
			
			else{
				
			
				if(numero % 2 != 0){
					
					System.out.println(0);
					
				}else{
					memoize[0] = 1;
					for(int i = 1; i < 16; i++){
						
						memoize[i] = 0;
					}
					
					System.out.println(solucion(numero));
				}
			}
		}
		sc.close();
	}
	
	public static int solucion(int numero){
		//si ya hay solucion.
		if(memoize[numero / 2] != 0){
			
			return memoize[numero / 2];
		
		}
		
		//si no hay solucion, la calcula.
		else{

			int res = 3 * solucion(numero - 2);
			int i = 4;
			while(i <= numero){
				
				res += 2 * solucion(numero - i);
				i += 2;
			}
			
			return memoize[numero / 2] = res;
		}
	}
}