package restaurant;

import java.util.List;
import Factory.DishFactory;
import Factory.Factory;
import calclation.Calculation;
import dish.Dish;
import dish.Menu;

public abstract class Restaurant {

  private Calculation calculation;

  public Restaurant(Calculation calc) {
    calculation = calc;
    System.out.println("\nカラン♪\nいらっしゃいませ。\n");
  }

  public abstract List<String> getMenu();

  public  void addOrder(String order) {

    Menu orderMenu = Menu.getMenu(order);

    Factory factory = new DishFactory();
    Dish dish = factory.create(orderMenu.getName(),orderMenu.getPrice());

    calculation.addPrice(dish);
    System.out.println("\n" + dish.getName() + " ですね。\n");
  };

  public  void getCalc() {
    calculation.getFinalTotalPrice();
  }

}
