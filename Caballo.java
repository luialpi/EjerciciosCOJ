
import java.util.ArrayList;

public class Caballo {


	static int tamx = 6;
	static int tamy = 6;
	static int iter = 0;
	static int arrx[]={  1, 2, 2, 1,-1,-2,-2,-1 };
	static int arry[]={ -2,-1, 1, 2, 2, 1,-1,-2 };
	static int i=2;
    
	static void carga_tablero1(int [][] tablero){
	     int j,i;
	     for (j=0; j<tamx; j++)
	     {
	         for (i=0; i<tamy; i++){
				 tablero[j][i] = 0;
			 }
	     }
	}//carga

	static void mostrar(int [][] tablero){

	     int j,i;

	     for (i=0; i<tablero.length; i++)
	     {
	         for (j=0; j<tablero[i].length; j++){
	        	 System.out.print(tablero[j][i]+" ");
	         }
	         System.out.println();
	     }

	}

	static int revisar(int [][] tablero){
	    int j,i;

	     for (i=0; i<tamx; i++)
	     {
	         for (j=0; j<tamy; j++)
	         {
	             if (tablero[j][i] == 0)
	             {
	                 return 0;//no esta listo
	             }

	         }
	     }
	     return 1;
	}
	
	static int contiene(ArrayList<Integer> listaX,ArrayList<Integer> listaY,int digito1,int digito2){
		int i;

	     for (i=0; i<listaX.size(); i++){
	    	
	    	 if (listaX.get(i)==digito1 && listaY.get(i)==digito2){
	    		 return 0;
	    	 }
	     }
	     return 1;
	
	}

	static void recursivo(int indice,ArrayList<Integer> listaX,ArrayList<Integer> listaY,int [][] tab,int numero,int x, int y,int ultimoX,int ultimoY){
	     
	     int newx = 0;
	     int newy = 0;
	     ArrayList<Integer> visitasX=new ArrayList<Integer>();
		ArrayList<Integer> visitasY=new ArrayList<Integer>();

	     if(revisar(tab) == 1){
	    	 mostrar(tab);
	     }
	     while(indice < 8 ){
	    	newx = arrx[indice] + x;
	    	newy = arry[indice] + y;
	    	
	    	if(newx >= 0 && newy >= 0 && newx< tamx && newy< tamy && (newx != ultimoX || newy != ultimoY)){ 
	    		
	    		if(contiene(listaX,listaY,newx,newy)==1){
	    		
	    			if (tab[newx][newy] == 0) {
	    				tab[newx][newy]=numero;
	    				listaX.add(newx);
	    				listaY.add(newy);
	    				//System.out.println(newx+" "+newy);
	    				mostrar(tab);
	    				System.out.println();
	    				numero++;
	    				
	    			}
	    		
			        if (numero != tamx*tamy){
			        	
			            recursivo(0,listaX,listaY,tab,numero,newx,newy,ultimoX,ultimoY);
			        }//if
	    		}
	    		
		    }//if
	    	
	    	indice+=1;
	        iter+=1;
	        
	     }
	     
	     volver(listaX,listaY,tab,numero,ultimoX,ultimoY,newx,newy);
	     if (contiene(visitasX,visitasY,newx,newy)==0){

	    	 i++;
	    	 recursivo(0,listaX,listaY,tab,numero,newx,newy,ultimoX,ultimoY);
	     }
	     else{
	    	 volver(listaX,listaY,tab,numero,ultimoX,ultimoY,newx,newy);
	     }
	       	
	}
	
	static void volver(ArrayList<Integer> listaX,ArrayList<Integer> listaY,int [][] tab,int numero,int ultimoX,int ultimoY,int newx,int newy){
		 ultimoX=listaX.get(listaX.size()-1);
	     ultimoY=listaY.get(listaY.size()-1);
	     numero--;
	     tab[ultimoX][ultimoY]=0;
	     listaX.remove(listaX.size()-1);
	     listaY.remove(listaY.size()-1);
	     newx=listaX.get(listaX.size()-1);
	     newy=listaY.get(listaY.size()-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listaX=new ArrayList<Integer>();
		ArrayList<Integer> listaY=new ArrayList<Integer>();

		//int listaX[]=new int[tamx*tamy];
		//int listaY[]= new int[tamx*tamy];
		int [][] tablero = new int[tamx][tamy]; 
	    int columna = 0;
	    int fila = 0;
	    carga_tablero1(tablero);//rellena tablero con 0
	    tablero[columna][fila]=1;//ubicacion inicial caballo
	    recursivo(0,listaX,listaY,tablero,2,columna,fila,0,0);//busqueda solucion
	    mostrar(tablero);
	   
	}

}
