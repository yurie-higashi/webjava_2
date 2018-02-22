public class IzakayaCalc extends Calculation {

  private double otoshi = 300;

  @Override
  // お通し込み
  public int getFinalTotalPrice() {
    return  (int) (getTaxPrice() + otoshi);
  }


}
