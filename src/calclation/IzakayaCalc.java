package calclation;
public class IzakayaCalc extends Calculation {

  private double otoshi = 300;

  @Override
  // お通し込み価格
  public void setFinalTotalPrice() {
    finalTotalPrice = (int) (getTaxPrice() + otoshi);
  }
}
