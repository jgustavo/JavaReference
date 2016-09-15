package collections;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class InsereNoComeco {
	public static void main(String[] args) {
		List<Integer> al = new LinkedList<Integer>();
		
		long init = Calendar.getInstance().getTimeInMillis();
		
		for(int i=1; i < 100000000; i++) {
			al.add(0, i);
		}
		long end = Calendar.getInstance().getTimeInMillis();
		
		System.out.println(end-init);
		
		init = Calendar.getInstance().getTimeInMillis();
		if (al.contains(5000000)) {
			System.out.println("Achou");
		}
		end = Calendar.getInstance().getTimeInMillis();
		System.out.println(end-init);
			
	}

}
