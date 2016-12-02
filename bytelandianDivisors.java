import java.util.ArrayList;
import java.util.Scanner;

public class bytelandianDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int casos=sc.nextInt(),numero,tamanio;
		ArrayList<Integer> lista =new ArrayList<>();
		while(casos>0){
			numero=sc.nextInt();
			tamanio=sc.nextInt();
			
			if(numero <= tamanio){
				System.out.println(1);
			}
			
			else if(tamanio == 1){
				System.out.println(numero);
			}
			
			else{
				lista.clear();
				lista.add(numero);
				boolean estado=true;
				while(true){
					int i;
					int size=lista.size();
					int contador=0;
					for (i = 0; i < size; i++) {
						int n=lista.get(i);
						if(n<=tamanio){
							contador++;
						}
						else if((n%2)==1 && n>tamanio){//impar
							estado=true;
							lista.remove(i);
							
							lista.add(n / 2);
							lista.add(n / 2+1);
							//System.out.println(lista);
						}
						else if((n%2)==0 && n>tamanio){
							estado=true;
							lista.remove(i);
							
							lista.add(n / 2);
							lista.add((n / 2));
							//System.out.println(lista);
							
						}

					}
					if(contador==lista.size()){
						System.out.println(contador);
						break;
					}

				}
				
			}
			casos--;
		}

	}
	

}
