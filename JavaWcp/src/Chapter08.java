
public class Chapter08 {
	public static void main(String[] args) {
		int num = 1;
		while ( num <= 5) {
			System.out.println(num * num);
			num++;
		}
		for (int number = 1; number <= 4; number++) {
            System.out.println(number);
        }
		int[] array = {1, 2, 3, 4};
		for (int number2 : array) {
			if ((number2 % 2) != 1) {
                continue;
            }
			System.out.println(number2);
		}
	}

}
