package calclation;
public class BarCalc extends Calculation {

  private double service = 1.1;

  @Override
  // サービス料込み価格
  public void setFinalTotalPrice() {
    finalTotalPrice = (int) (getTaxPrice() * service);
  }

  @Override
  public void addExplain() {
    System.out.print("  サービス料10%を追加しまして、");
  }
}
