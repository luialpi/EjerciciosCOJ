import java.util.Scanner;

public class easyChange {
	static int monedas[]={6,5,3,1};
	
	static int buscarCambio(int n){
		
		int Ch1=0,Ch2=0,Ch3=0;
		
		
		Ch1=buscarCambio2(n%6,n/6);
		Ch2=buscarCambio2(n%5,n/5);
		Ch3=buscarCambio2(n,0);
		System.out.println(Ch1+" "+Ch2+" "+Ch3);
		if(Ch1<Ch2&&Ch1<Ch3){
			return Ch1;
		}
		else if(Ch2<Ch1&&Ch2<Ch3){
			return Ch2;
		}
		else if(Ch3<Ch1&&Ch3<Ch2){
			return Ch3;
		}
		return Ch2;



	}
			
	static int buscarCambio2(int n,int R){
		while(n>0){
			while(n>=5){
				if(n%6==0){
					R+=n/6;
					n=0;
				}
				else if(n%5==0){
					
					R+= n/5;
					n=0;
				}
				else if(n>=6){
					R++;
					n-=6;
				}
				else if(n>=5){
					R++;
					n-=5;
				}
			}
			
			if(n%3==0){
				R+=n/3;
				n=0;
			}
			else if(n>=3){
				R++;
				n-=3;
			}
			else if(n>=1){
				R++;
				n-=1;
			}
		}
		return R;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int casos=sc.nextInt();

		for(int i=1;i<=casos;i++){
			int numero=sc.nextInt();
			System.out.println("Case "+i+": "+buscarCambio(numero));
		}
		sc.close();
				
	}

}
