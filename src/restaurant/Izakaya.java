package restaurant;

import calclation.IzakayaCalc;
import dish.Dish.Menu;

public class Izakaya extends Restaurant {

  public Izakaya() {
    super(new IzakayaCalc());
    System.out.println("陽気な居酒屋へようこそ！！");
    System.out.println("ご注文は何にしましょう！？\n");
  }

  @Override
  public void showMenu() {
    System.out.println("=========================================================");
    System.out.println("  " +Menu.HIGHBALL.getItemName());
    System.out.println("  " +Menu.EDAMAME.getItemName());
    System.out.println("  " +Menu.CHICKEN.getItemName());
    System.out.println("=========================================================");
    System.out.print("【ご注文】：");
  }
}
