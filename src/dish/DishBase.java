package dish;

import dish.Dish.Menu;

public abstract class DishBase {

  private String name;
  private int price;

  public DishBase (Menu menu) {
    this.name = menu.getItemName();
    this.price = menu.getItemPrice();
  }

  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }
}
