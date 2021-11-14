import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Chapter2_3_map {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();
		
		map1.put(0, "ぶどう");
		map1.put(2, "もも");
		
		for (int i = 0; i <= map1.size(); i++) {
			if (map1.containsKey(i) == true) {
				System.out.println("要素" + i + "には" + map1.get(i) + "が入っています");
			} else {
				System.out.println("要素" + i + "には何も入っていません");
			}
		}
			
		System.out.println("要素0を上書きします");
		map1.put(0, "マスカット");
		
		System.out.println("要素2を削除");
		map1.remove(2, "もも");
		
		System.out.println("要素0には" + map1.get(0) + "が入っています");
		
		for (int i = 0; i <= map1.size(); i++) {
			if (map1.containsKey(i) == true) {
				System.out.println("要素" + i + "には" + map1.get(i) + "が入っています");
			} else {
				System.out.println("要素" + i + "には何も入っていません");
			}
		}
	}

}
