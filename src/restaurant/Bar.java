package restaurant;

import java.util.ArrayList;
import java.util.List;
import calclation.BarCalc;
import dish.Menu;

public class Bar extends Restaurant {

  public Bar() {
    super(new BarCalc());
    System.out.println("素敵なバーへようこそ！！\n");
    System.out.println(getMenu() + " から１つずつご注文ください。");
    System.out.println("（以上の場合は e を入力してください。）\n");
  }

  @Override
  public List<String> getMenu() {
    List<String> menu = new ArrayList<String>();
    menu.add(Menu.WINE.getName());
    menu.add(Menu.BEER.getName());
    menu.add(Menu.COCKTAIL.getName());
    return menu;
  }
}
