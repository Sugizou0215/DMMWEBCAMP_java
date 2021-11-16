import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Chapter2_4 {
	public static void main(String[] args) {
		List<Object> items = new ArrayList<Object>();
		
		items.add("bag");
		items.add(0);
		items.add(true);
		
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", new BigDecimal(300)));

		appleBasket.printTotalPrice(); // 「ふじの入った籠は合計300円です」と出力
		peachBasket.printTotalPrice(); // 「黄金桃の入った籠は合計400円です」と出力
	}
	
	abstract class Fruit {
		  String name;
		  BigDecimal price;

		  Fruit(String name, BigDecimal price) {
		    this.name = name;
		    this.price = price;
		  }

		  abstract protected String getName();

		  abstract protected BigDecimal getPrice();
	}
	
	class Basket<E extends Fruit> {
		  private E elem;
		  private final BigDecimal PRICE = new BigDecimal(100);

		  Basket(E e) {
		    elem = e;
		  }

		  void replace(E e) {
		    elem = e;
		  }

		  E get() {
		    return elem;
		  }

		  void printName() {
		    System.out.println("籠の中身は" + elem.getName() + "です");
		  }

		  void printTotalPrice() {
		    BigDecimal totalPrice = PRICE.add(elem.getPrice());
		    System.out.println(elem.getName() + "の入った籠は合計" + totalPrice + "円です");
		  }
		}
	
	class Apple extends Fruit {
		  Apple(String name, BigDecimal price) {
		    super(name, price);
		  }

		  @Override
		  protected String getName() {
		    return name;
		  }

		  @Override
		  protected BigDecimal getPrice() {
		    return price;
		  }
	}

	class Peach extends Fruit {
		  Peach(String name, BigDecimal price) {
		    super(name, price);
		  }

		  @Override
		  protected String getName() {
		    return name;
		  }

		  @Override
		  protected BigDecimal getPrice() {
		    return price;
		  }
	}
}
