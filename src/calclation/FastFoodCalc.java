package calclation;

public class FastFoodCalc extends Calculation {

  private double discount = 100;

  @Override
  public void setFinalTotalPrice() {
    if (getTaxPrice() > 600) {
      finalTotalPrice = (int) (getTaxPrice() - discount);
    }
  }

  @Override
  public void addExplain() {
    if (getTaxPrice() > 600) {
      System.out.print("  セット割引で100円引きになりまして、");
    }
  }
}
