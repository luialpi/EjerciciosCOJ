

import java.util.ArrayList;
import java.util.Scanner;

public class finalStandings {
	static ArrayList<Pareja> ma =new ArrayList<>();
	static public class Pareja
	{
	   int numero1;
	   int numero2;
	  

	   public Pareja(int a, int b)
	   {
	     numero1 = a; numero2= b;
	   }


	   public int getNumero1() {
		   return numero1;
	   }


	   public int getNumero2() {
		   return numero2;
	   }
	}
	

	public static void mergeSort(ArrayList<Pareja> lista, ArrayList<Pareja> listaAux, int izquierda, int derecha) {
	    if (izquierda == derecha) return; 
	    int middleIndex = (izquierda + derecha)/2;
	    mergeSort(lista, listaAux, izquierda, middleIndex);
	    mergeSort(lista, listaAux, middleIndex + 1, derecha);
	    merge(lista, listaAux, izquierda, derecha);
	  
	    for (int i = izquierda; i <= derecha; i++) {
	    	lista.set(i,listaAux.get(i));
	    }
	}    


	private static void merge(ArrayList<Pareja> lista, ArrayList<Pareja> listaAux, int izquierda, int derecha) {
	    int indiceMedio = (izquierda + derecha)/2;
	    int indiceInicial = izquierda; 
	    int indiceFinal = indiceMedio + 1;
	    int indiceAux = izquierda;
	    while (indiceInicial <= indiceMedio && indiceFinal <= derecha) {
	        if (lista.get(indiceInicial).getNumero2() >= lista.get(indiceFinal).getNumero2()) {
	        	listaAux.set(indiceAux, lista.get(indiceInicial++)) ;
	        } else {
	        	listaAux.set(indiceAux, lista.get(indiceFinal++)) ;
	            
	        }
	        indiceAux++;
	    }
	    while (indiceInicial <= indiceMedio) {
	    	listaAux.set(indiceAux, lista.get(indiceInicial++)) ;
	    	indiceAux++;
	    }
	    while (indiceFinal <= derecha) {
	    	listaAux.set(indiceAux, lista.get(indiceFinal++)) ;
	    	indiceAux++;
	    }
	}    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		int equipos=sc.nextInt();
		ArrayList<Pareja> lista = new ArrayList<>();
		ArrayList<Pareja> aux = new ArrayList<>();

		for(int j=0;j<equipos;j++){
			
			Integer id = sc.nextInt();
			Integer valor =sc.nextInt();
			Pareja n=new Pareja(id, valor);
			lista.add(n);
			

		}
		for(int j=0;j<equipos;j++){
			Pareja n=new Pareja(0, 0);
			aux.add(n);
		}
		
		mergeSort(lista, aux, 0, lista.size()-1);
		for(int j=0;j<equipos;j++){
			System.out.println(lista.get(j).getNumero1()+" "+lista.get(j).getNumero2());
		}
		
		sc.close();
		
			
	}

}
