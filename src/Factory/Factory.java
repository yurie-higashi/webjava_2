package Factory;

import dish.Dish;

public abstract class Factory {

  public final Dish create(String name,int price) {
    Dish dish = createDish(name, price);

    return dish;
  }

  protected abstract Dish createDish(String name, int price);

}
