import java.util.ArrayList;
import java.util.List;

abstract class Restaurant {

  List<Dish> orderList = new ArrayList<Dish>();

  public abstract List<String> getMenu();

  public abstract void addOrder(String dish);

  public List<Dish> getOrder() {
    return orderList;
  };

}
