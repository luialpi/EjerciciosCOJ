#include <stdio.h>


int solucion(int inicio, int fin){
	if (inicio>fin){
		int temporal=inicio;
		inicio=fin;
		fin=temporal;
	}
	
	int contador=0,validador=0;
	
	int contador2=0;
	int i;
	for(i=inicio;i<=fin;i++){
		int n=i;
		
		while(validador==0){
			if (n==1){
				contador++;
				validador=1;
	
			}
			
			else if(n%2==1){
				n=(n*3)+1;
				contador++;
						}
			else{
				n=n/2;
				
				contador++;
				
				
			}
		}
		validador=0;
		if (contador2<=contador){
			contador2=contador;
		}
		
		contador=0;
		
	}
	
	return contador2;
}

int main() {
    int a, b; //input vars
    
    while (scanf("%d %d", &a, &b) != EOF) {
        printf("%d %d %d\n", a, b, solucion(a, b));
    }
    return 0;
}
