import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class balancedLineup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		ArrayList<Integer> lista = new ArrayList<>();
		while(n>0){
			lista.add(sc.nextInt());
			n--;
		}
		
		int a,b;
		
		while(q>0){
			a=sc.nextInt();
			b=sc.nextInt();
			
			int min=lista.get(a-1),max=lista.get(a-1);
			for (int i = a; i < b; i++) {
				
				if(min>lista.get(i)){
					min=lista.get(i);
				}
				if(max<lista.get(i)){
					max=lista.get(i);
				}
				//System.out.println("max: "+max+" min: "+min);
			}
			//System.out.println(lista.subList(a-1, b));
			System.out.println(max-min);
			
			q--;
		}
	}

}
