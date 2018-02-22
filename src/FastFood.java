import java.util.ArrayList;
import java.util.List;

public class FastFood extends Restaurant {

  String potato = "ポテト";
  String coke = "コーラ";
  String humburger = "ハンバーガー";

  Dish potatoDish = new Dish(potato, 350);
  Dish cokeDish = new Dish(coke, 200);
  Dish humburgerDish = new Dish(humburger, 400);

  @Override
  public List<String> getMenu() {
    List<String> menu = new ArrayList<String>();
    menu.add(potato);
    menu.add(humburger);
    menu.add(coke);
    return menu;
  }

  @Override
  public void addOrder(String order) {
    if (order.equals(potato)) {
      orderList.add(potatoDish);
      System.out.println(potato + " ですね。");
    } else if (order.equals(coke)) {
      orderList.add(cokeDish);
      System.out.println(coke + " ですね。");
    } else {
      orderList.add(humburgerDish);
      System.out.println(humburger + " ですね。");
    }
  }

}
