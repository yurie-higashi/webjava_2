import java.util.Scanner;

public class GoRestaurant {

  public static void main(String[] args) {


    System.out.println("「いらっしゃいませ。\n  どちらのお店に入りますか？」");
    System.out.println(RestaurantType.BAR.getName() + "(0) , "
    + RestaurantType.IZAKAYA.getName() + "(1) , " + RestaurantType.FASTFOOD.getName() + "(2)");

    GoRestaurant restaurant =  new GoRestaurant();
    String selectedRestaurant = restaurant.getScan();

    // お店に入る
    switch(selectedRestaurant) {
      case "0":
        Bar bar = new Bar();
        restaurant.getOrder(bar);
        BarCalc barCalc = new BarCalc();
        barCalc.addPrice(bar.getOrder());
        restaurant.calc(barCalc);
        break;

      case "1":
        Izakaya izakaya = new Izakaya();
        restaurant.getOrder(izakaya);
        IzakayaCalc izakayaCalc = new IzakayaCalc();
        izakayaCalc.addPrice(izakaya.getOrder());
        restaurant.calc(izakayaCalc);
        break;

      case "2":
        FastFood fastFood = new FastFood();
        restaurant.getOrder(fastFood);
        FastFoodCalc fastFoodCalc = new FastFoodCalc();
        fastFoodCalc.addPrice(fastFood.getOrder());
        restaurant.calc(fastFoodCalc);
        break;

      default:
        System.out.println("「ありがとうございました。」");
    }

  }

  private void getOrder(Restaurant res) {

    System.out.println("「 " + res.getMenu() + " から１つずつご注文ください。」");
    System.out.println("「以上の場合は e を入力してください。」");
    String finish = "e";
    boolean isContinue = true;
    do {
      GoRestaurant restaurant =  new GoRestaurant();
      String order = restaurant.getScan();
      if (order.equals(finish)) {
        isContinue = false;
      } else {
        res.addOrder(order);
        System.out.println("「他にはございますか？」");
        System.out.println("「以上の場合は e を入力してください。」");
      }
    } while (isContinue);
  }

  private void calc(Calculation calc) {
    System.out.println("「ご注文ありがとうございました。」");
    System.out.println("「合計 " + calc.getFinalTotalPrice() + " 円でございます。」");
  }

  private String getScan() {
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    return scan.next();
  }

}