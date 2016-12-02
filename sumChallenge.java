import java.util.ArrayList;
import java.util.Scanner;

public class sumChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int casos=sc.nextInt();
		ArrayList<Integer> lista=new ArrayList<>();
		while(casos!=0){
			lista.clear();
			int n=sc.nextInt();
			int suma;
			for(int i=0;i<n;i++){
				
				lista.add(i, sc.nextInt());
			}
			
			boolean boleano=false;
			for (int i = 0; i < n; i++) {
				suma=0;
				for (int j = i; j < n; j++) {
					suma+=lista.get(j);
					if(suma==0){
						boleano=true;
					}
				}

			}
			if(boleano==false){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
			
			casos--;
		}
	}

}
