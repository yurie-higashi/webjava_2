package restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import calclation.BarCalc;
import dish.DishBase;
import dish.Drink;

public class Bar extends Restaurant {

  public Bar() {
    super(new BarCalc());
    System.out.println("素敵なバーへようこそ！！");
    System.out.println("ご注文はいかがなさいますか？\n");
  }

  public void makeDish() {
    List<DishBase> barList = new ArrayList<DishBase>();
    Drink wine = new Drink("ワイン",800);
    Drink beer = new Drink("ビール",700);
    Drink cocktail = new Drink("カクテル",900);

    Collections.addAll(barList,wine,beer,cocktail);
    this.dishList = barList;
    addDishNameList();

  }

}
