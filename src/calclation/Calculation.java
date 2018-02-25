package calclation;
import dish.Dish;

public abstract class Calculation {

  int finalTotalPrice = 0;
  int totalPrice = 0;
  double taxPrice = 0;
  private double tax = 1.08;

  public void addPrice(Dish dish) {
      totalPrice = totalPrice + dish.getPrice();
  }

  public double getTaxPrice() {
    taxPrice = (double)totalPrice * tax;
    return taxPrice;
  }

  public abstract void setFinalTotalPrice();

  // 合計金額
  public void getFinalTotalPrice() {
    setFinalTotalPrice();
    System.out.println("\n***************************************************\n");
    System.out.println("ご注文ありがとうございました。");
    System.out.println("  合計 " + finalTotalPrice + " 円でございます。");
    System.out.println("  またのお越しをお待ちしております\n");
    System.out.println("***************************************************\n");
  };

}
