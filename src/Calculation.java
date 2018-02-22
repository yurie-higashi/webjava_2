import java.util.List;

public abstract class Calculation {

  int totalPrice = 0;
  double taxPrice;
  private double tax = 1.08;
  int index = 0;

  public void addPrice(List<Dish> order) {
    for (Dish dish : order) {
      totalPrice = totalPrice + dish.getPrice();
    }
  }

  public double getTaxPrice() {
    taxPrice = (double)totalPrice * tax;
    return taxPrice;
  }

  // 合計金額
  public abstract int getFinalTotalPrice();

}
