
public class FastFoodCalc extends Calculation {

  private double discount = 100;

  @Override
  // セット割引
  public int getFinalTotalPrice() {
    if (totalPrice >= 600) {
      return (int) (getTaxPrice() - discount);
    } else {
      return totalPrice;
    }
  }

}
