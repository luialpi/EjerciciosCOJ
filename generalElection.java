import java.util.Scanner;

public class generalElection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int casos=sc.nextInt();
		while(casos>0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int[] candidatos=new int[n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					candidatos[j]+=sc.nextInt();
				}
			}
			
			int ganador=0;
			int actual=candidatos[0];
			for (int i = 1; i < candidatos.length; i++) {
				//System.out.println("actual: "+actual+" candidato:"+candidatos[i]);
				if(actual<candidatos[i]){
					actual=candidatos[i];
					ganador=i;
				}
			}
			System.out.println((ganador+1));
			casos--;
		}

	}

}
