package dish;
public class Dish extends DishBase {

  public Dish(String name,int price) {
    super(name,price);
  }

  @Override
  public void sound() {
    System.out.println("を食べた。\n  もぐもぐもぐ。\n  うん、美味しい！！");
  }
}