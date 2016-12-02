import java.util.Scanner;

public class diophantines {
	static int estado=0;
	static void minimoComunDivisor(int a, int b){
		if(b!=0){
			minimoComunDivisor(b,a%b);
		}
		else{
			estado=a;
		}
	
	  
	}
	static void revisar(int c,int mcd){
		if(mcd==0){
			System.out.println("0\n");
		}
		else if(c % mcd ==0)
        	System.out.print("YES\n");
        else
            System.out.print("NO\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a, b, c, mcd=0;
	    Scanner sc =new Scanner(System.in);
	    while(true)
	    {
	        a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
	        
	        if(a == 0 && b == 0 && c == 0){
	        	break;
	        }
	        
	        else if(a >= b){
	        	minimoComunDivisor(a, b);
	        	mcd = estado;
	        	revisar(c,mcd);
	        }
	            
	        else if(a<b){
	        	minimoComunDivisor(b, a);
	            mcd = estado;
	            revisar(c,mcd);
	        }
	    }
	    sc.close();
	    
	}

}
