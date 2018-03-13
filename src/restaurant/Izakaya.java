package restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import calclation.IzakayaCalc;
import dish.Dish;
import dish.DishBase;
import dish.Drink;

public class Izakaya extends Restaurant {

  public Izakaya() {
    super(new IzakayaCalc());
    System.out.println("陽気な居酒屋へようこそ！！");
    System.out.println("ご注文は何にしましょう！？\n");
    addOrder();
  }

  public void makeDish() {
    List<DishBase> izakayaList = new ArrayList<DishBase>();
    Drink highball = new Drink("ハイボール",350);
    Dish edamame = new Dish("枝豆",300);
    Dish chicken = new Dish("唐揚げ",500);

    Collections.addAll(izakayaList,highball,edamame,chicken);
    this.dishList = izakayaList;
  }

}
