package restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import calclation.Calculation;
import dish.DishBase;

public abstract class Restaurant {

  private Calculation calculation;
  public List<DishBase> dishList = new ArrayList<DishBase>();
  public List<String> dishNameList = new ArrayList<String>();
  private static final String finish = "以上";

  public Restaurant(Calculation calc) {
    calculation = calc;
    System.out.println("\n♪♪カラン♪♪\nいらっしゃいませ。\n");
    // Dishの生成
    makeDish();
  }

  public void addOrder() {
    boolean isContinue = true;
    while (isContinue) {
      // オーダーを受ける
      isContinue = order();
    }
  };

  // Dish を生成する
  public abstract void makeDish();

  // メニューを表示する
  public void showMenu()  {
    System.out.println("=========================================================");
    for (DishBase dish : dishList) {
      System.out.println(dish.getName() + " : " + dish.getPrice() + "円");
    }
    System.out.println("=========================================================");
    System.out.print("【ご注文】：");
  };

  // オーダーを受ける
  public boolean order() {
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    String order = scan.next();
    if (order == null || !dishNameList.contains(order)) {
      System.out.println("\n申し訳ございません、もう一度お願いいたします。\n");
    } else if (order.equals(finish)) {
      // 注文終わり
      return false;
    } else {
      for (DishBase dish : dishList) {
        if (order.equals(dish.getName())) {
          System.out.println("\n" + dish.getName() + " ですね。\n\n他にご注文はございますか？");
          calculation.addPrice(dish);
        }
      }
    }
    // 注文を続ける
    showMenu();
    return true;
  }

  // 食事をする
  public void eat() {
    System.out.println("\n  いただきます！！\n");
    for (DishBase eatDish : calculation.orderList) {
      System.out.print("  " + eatDish.getName());
      eatDish.sound();
    }
    System.out.println("\n  ごちそうさま！！");
  }

  // お会計を表示する
  public void getCalc() {
    calculation.getFinalTotalPrice(calculation);
  }

  public void addDishNameList() {
    for (DishBase dish : dishList) {
      dishNameList.add(dish.getName());
    }
    dishNameList.add(finish);
  }

}
