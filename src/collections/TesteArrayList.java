package collections;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TesteArrayList {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		long init = Calendar.getInstance().getTimeInMillis();
		for(int i=0; i <= 10000000; i++) {
			al.add(i);
		}
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.println(end-init);
		init = Calendar.getInstance().getTimeInMillis();
		if (al.contains(10000000)) {
			System.out.println("Achou");
		}
		

		
		end = Calendar.getInstance().getTimeInMillis();
		System.out.println(end-init);
	}
}
