package collections;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class TesteHashSet {
	public static void main(String[] args) {
		Set<Integer> v = new HashSet<Integer>();
		long init = Calendar.getInstance().getTimeInMillis();
		for(int i=0; i <= 10000000; i++) {
			v.add(i);
		}
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.println(end-init);
		
		init = Calendar.getInstance().getTimeInMillis();
		if (v.contains(10000000)) {
			System.out.println("Achou");
		}
		end = Calendar.getInstance().getTimeInMillis();
		System.out.println(end-init);
		
	}
	

}
