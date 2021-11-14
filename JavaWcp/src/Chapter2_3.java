import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Chapter2_3 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();
	
		list1.add("りんご");
		list1.add("みかん");
		list1.add(2, "バナナ");
		System.out.println(list1.size() + "つのデータが入っています");
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
        
        if (list1.contains("バナナ") == true) {
        	list1.remove("バナナ");
        	System.out.println("バナナを削除しました");
        }
        
        System.out.println(list1.size() + "つのデータが入っています");
        for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}
}
