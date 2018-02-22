import java.util.ArrayList;
import java.util.List;

public class Izakaya extends Restaurant {

  String highball = "ハイボール";
  String edamame = "枝豆";
  String chicken = "唐揚げ";

  Dish highballDish = new Dish(highball, 350);
  Dish edamameDish = new Dish(edamame, 300);
  Dish chickenDish = new Dish(chicken,500);

  @Override
  public List<String> getMenu() {
    List<String> menu = new ArrayList<String>();
    menu.add(highball);
    menu.add(edamame);
    menu.add(chicken);
    return menu;
  }

  @Override
  public void addOrder(String order) {
    if (order.equals(highball)) {
      orderList.add(highballDish);
      System.out.println(highball + " ですね。");
    } else if (order.equals(edamame)) {
      orderList.add(edamameDish);
      System.out.println(edamame + " ですね。");
    } else {
      orderList.add(chickenDish);
      System.out.println(chicken + " ですね。");
    }
  }

}
