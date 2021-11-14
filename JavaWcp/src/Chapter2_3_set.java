import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Chapter2_3_set {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		set1.add("スイカ");
		set1.add("メロン");
		
		for (String setF : set1) {
			  System.out.println(setF + "の在庫はあります"); 
		}
		
		set1.remove("スイカ");
		
		for (String setF : set1) {
			  System.out.println(setF + "の在庫はあります"); 
		}
		
		if (set1.contains("スイカ") == false) {
			System.out.println("スイカは売り切れました");
		}
		
	}
}
