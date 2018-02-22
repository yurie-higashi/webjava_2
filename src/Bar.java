import java.util.ArrayList;
import java.util.List;

public class Bar extends Restaurant {

  String wine = "ワイン";
  String beer = "ビール";
  String cocktail = "カクテル";

  Dish wineDish = new Dish(wine, 800);
  Dish beerDish = new Dish(beer, 700);
  Dish cocktailDish = new Dish(cocktail, 900);

  @Override
  public List<String> getMenu() {

    List<String> menu = new ArrayList<String>();
    menu.add(wine);
    menu.add(beer);
    menu.add(cocktail);

    return menu;
  }

  @Override
  public void addOrder(String order) {
    if (order.equals(wine)) {
      orderList.add(wineDish);
      System.out.println(wine + " ですね。");
    } else if (order.equals(beer)) {
      orderList.add(beerDish);
      System.out.println(beer + " ですね。");
    } else {
      orderList.add(cocktailDish);
      System.out.println(cocktail + " ですね。");
    }
  }

}
