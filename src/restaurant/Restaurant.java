package restaurant;

import java.util.Scanner;
import calclation.Calculation;
import dish.Dish;
import dish.Dish.Menu;

public abstract class Restaurant {

  private Calculation calculation;

  public Restaurant(Calculation calc) {
    calculation = calc;
    System.out.println("\n♪♪カラン♪♪\nいらっしゃいませ。\n");
  }

  public abstract void showMenu();

  public void addOrder() {

    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);

    boolean isContinue = true;
    while (isContinue) {
      // メニュー一覧の表示
      showMenu();

      // 入力値よりメニューの特定
      Menu order = Menu.getMenu(scan.next());

      // 注文は以上
      if (order == null) {
      // メニュー一覧と一致なし
        System.out.println("\n申し訳ございません、もう一度お願いいたします。\n");
      } else if (order.equals(Menu.FINISH)) {
          getCalc();
          isContinue = false;
      } else {
      // メニュー一覧と一致（注文に追加）
        Dish dish = new Dish(order);
        calculation.addPrice(dish);
        System.out.println("\n" + dish.getName() + " ですね。\n\n他にご注文はございますか？");
      }
    }
  };

  public void getCalc() {
    calculation.getFinalTotalPrice(calculation);
  }

}
