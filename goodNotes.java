import java.util.Scanner;

public class goodNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			String palabra1=sc.next();
			String palabra2=sc.next();
			
			int j=0;
			for(int i=0;i<palabra2.length();i++){
				
				if(palabra2.substring(i, i+1).equals(palabra1.substring(j,j+1))){
					j++;
				}
				if(j==palabra1.length()){
					break;
				}
			}
			if(j==palabra1.length()){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
			
			
			 
		}
		sc.close();
	}

}
