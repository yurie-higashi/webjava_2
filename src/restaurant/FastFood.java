package restaurant;

import calclation.FastFoodCalc;
import dish.Dish.Menu;

public class FastFood extends Restaurant {

  public FastFood() {
    super(new FastFoodCalc());
    System.out.println("愉快なファーストフード店へようこそ！！");
    System.out.println("ご注文お伺いしまーす！\n");
  }

  @Override
  public void showMenu() {
    System.out.println("=========================================================");
    System.out.println(Menu.POTATO.getItemName());
    System.out.println(Menu.COKE.getItemName());
    System.out.println(Menu.HUMBURGER.getItemName());
    System.out.println("=========================================================");
    System.out.print("【ご注文】：");
  }
}
