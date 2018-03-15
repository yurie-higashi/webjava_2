package calclation;
import java.util.ArrayList;
import java.util.List;
import dish.DishBase;

public abstract class Calculation {

  int finalTotalPrice = 0;
  int totalPrice = 0;
  double taxPrice = 0;
  private double tax = 1.08;
  public List<DishBase> orderList = new ArrayList<DishBase>();

  public void addPrice(DishBase dish) {
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
    System.out.println("  ご注文ありがとうございました。\n");
    for (DishBase order :orderList) {
      System.out.println("  " + order.getName() + " : " + order.getPrice() + "円");
    }
    calc.addExplain();
    System.out.println("合計 " + finalTotalPrice + " 円でございます。");
    System.out.println("  またのお越しをお待ちしております。\n");
    System.out.println("******************************************************\n");
  };

}
