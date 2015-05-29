package system;

import java.util.HashMap;
import java.util.Map;

public class GetEnv {

	public static void main(String[] args) {
		Map<String, String> map = System.getenv();
		for (String s:map.keySet()) {
			System.out.println(s);
		}

	}

}
