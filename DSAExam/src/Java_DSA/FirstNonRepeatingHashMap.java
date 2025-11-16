package Java_DSA;
import java.util.*;

public class FirstNonRepeatingHashMap {
	public static char firstNonRepeatingHashMap (String str) {
		LinkedHashMap <Character, Integer> map = new LinkedHashMap <>();
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for (char ch : map.keySet()) {
			if (map.get(ch) == 1) {
				return ch;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		String str = "swiss";
		System.out.println(firstNonRepeatingHashMap(str));
	}
}
