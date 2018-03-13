package restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import calclation.FastFoodCalc;
import dish.Dish;
import dish.DishBase;
import dish.Drink;

public class FastFood extends Restaurant {

  public FastFood() {
    super(new FastFoodCalc());
    System.out.println("愉快なファーストフード店へようこそ！！");
    System.out.println("ご注文お伺いしまーす！\n");
    addOrder();
  }

  public void makeDish() {
    List<DishBase> fastFoodList = new ArrayList<DishBase>();
    Dish potato = new Dish("ポテト",350);
    Drink coke = new Drink("コーラ",200);
    Dish humburger = new Dish("ハンバーガー",400);

    Collections.addAll(fastFoodList,potato,coke,humburger);
    this.dishList = fastFoodList;
  }

}
