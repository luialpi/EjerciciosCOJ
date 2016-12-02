import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class howManyKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		ArrayList<String> lista=new ArrayList<>();
		ArrayList<String> visitados=new ArrayList<>();
		int casos=sc.nextInt();
		
		for(int i=casos;i>0;i--){
			String k=sc.next();
			lista.add(k);
		}
		int contador=0;
		for(int i=0;i<lista.size();i++){
			int j=0;
			
			String palabra=lista.get(i);
			for(int k=0;k<lista.size();k++){
				if(k!=i){
					visitados.clear();
					boolean estado=false;
					while(j<palabra.length()){
						//System.out.println(palabra.substring(j, j+1)+" "+lista.get(k));
						visitados.clear();
						if(lista.get(k).contains(palabra.substring(j, j+1))==true && visitados.contains(palabra.substring(j, j+1))==false ){
							j++;
							visitados.add(palabra.substring(j, j));
							estado=true;
							
						}
						else{
							//System.out.println("false");
							estado=false;
							break;
						}
					}
					if(estado==true){
						contador++;
					}
				}
			}
			
		}
		System.out.println(contador);
		sc.close();
		
	}

}
