package restaurant;

import java.util.ArrayList;
import java.util.List;
import calclation.IzakayaCalc;
import dish.Menu;

public class Izakaya extends Restaurant {

  public Izakaya() {
    super(new IzakayaCalc());
    System.out.println("陽気な居酒屋へようこそ！！\n");
    System.out.println(getMenu() + " から１つずつご注文ください。");
    System.out.println("（以上の場合は e を入力してください。）\n");
  }

  @Override
  public List<String> getMenu() {
    List<String> menu = new ArrayList<String>();
    menu.add(Menu.HIGHBALL.getName());
    menu.add(Menu.EDAMAME.getName());
    menu.add(Menu.CHICKEN.getName());
    return menu;
  }
}
