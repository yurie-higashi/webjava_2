package calclation;
import java.util.ArrayList;
import java.util.List;
import dish.Dish;

public abstract class Calculation {

  int finalTotalPrice = 0;
  int totalPrice = 0;
  double taxPrice = 0;
  private double tax = 1.08;
  private List<Dish> orderList = new ArrayList<Dish>();

  public void addPrice(Dish dish) {
      totalPrice = totalPrice + dish.getPrice();
      orderList.add(dish);
  }

  public double getTaxPrice() {
    taxPrice = (double)totalPrice * tax;
    return taxPrice;
  }

  public abstract void setFinalTotalPrice();

  public abstract void addExplain();

  // 合計金額
  public void getFinalTotalPrice(Calculation calc) {
    setFinalTotalPrice();
    System.out.println("\n******************************************************\n");
    System.out.println("  ご注文ありがとうございました。");
    calc.addExplain();
    System.out.println("合計 " + finalTotalPrice + " 円でございます。");
    System.out.println("  またのお越しをお待ちしております。\n");
    System.out.println("******************************************************\n");
  };

}
