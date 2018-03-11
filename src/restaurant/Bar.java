package restaurant;

import calclation.BarCalc;
import dish.Dish.Menu;

public class Bar extends Restaurant {

  public Bar() {
    super(new BarCalc());
    System.out.println("素敵なバーへようこそ！！");
    System.out.println("ご注文はいかがなさいますか？\n");
  }

  @Override
  public void showMenu() {
    System.out.println("=========================================================");
    System.out.println("  " + Menu.WINE.getItemName());
    System.out.println("  " + Menu.BEER.getItemName());
    System.out.println("  " + Menu.COCKTAIL.getItemName());
    System.out.println("=========================================================");
    System.out.print("【ご注文】：");
  }
}
