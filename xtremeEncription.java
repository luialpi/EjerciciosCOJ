import java.util.Scanner;

public class xtremeEncription {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String p1,p2;
		while(sc.hasNext()){
			p1=sc.next();
			p2=sc.next();
			
			int j=0,i=0,encontro=0;
			while(i <p1.length() && j<p2.length()) {
				char actual=p1.charAt(i);
				char cmp=p2.charAt(j);
				//System.out.println("actual: "+actual+" cmp: "+cmp);
				if(actual==cmp){
					//System.out.println("encontro");
					encontro++;
					j++;
					i++;
				}
				else{
					j++;	
				}
			}
			if(encontro==p1.length()){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}

		}
		
	}

}
