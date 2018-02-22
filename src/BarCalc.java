public class BarCalc extends Calculation {

  private double service = 1.1;

  @Override
  // サービス料込み
  public int getFinalTotalPrice() {
    return (int) (getTaxPrice() * service);
  }

}
