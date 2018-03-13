package dish;

public class Drink extends DishBase {

  public Drink(String name, int price) {
    super(name, price);
  }

  @Override
  public void sound() {
    System.out.println("を飲んだ。\n  ごくごくごく。\n  うん、最高！！");

  }

}
