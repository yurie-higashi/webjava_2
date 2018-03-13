package calclation;
public class IzakayaCalc extends Calculation {

  private double otoshi = 300;

  @Override
  // お通し込み価格
  public void setFinalTotalPrice() {
    finalTotalPrice = (int) (getTaxPrice() + otoshi);
  }

  @Override
  public void addExplain() {
    System.out.print("  お通し代300円を追加しまして、");
  }


}
