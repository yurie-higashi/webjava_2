package Factory;

import dish.Dish;

public class DishFactory extends Factory {

  @Override
  protected Dish createDish(String name, int price) {
    Dish dish = new Dish(name,price);
    return dish;
  }

}
