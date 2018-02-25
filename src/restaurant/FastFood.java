package restaurant;

import java.util.ArrayList;
import java.util.List;
import calclation.FastFoodCalc;
import dish.Menu;

public class FastFood extends Restaurant {

  public FastFood() {
    super(new FastFoodCalc());
    System.out.println("愉快なファーストフード店へようこそ！！\n");
    System.out.println(getMenu() + " から１つずつご注文ください。");
    System.out.println("（以上の場合は e を入力してください。）\n");
  }

  @Override
  public List<String> getMenu() {
    List<String> menu = new ArrayList<String>();
    menu.add(Menu.POTATO.getName());
    menu.add(Menu.COKE.getName());
    menu.add(Menu.HUMBURGER.getName());
    return menu;
  }
}
