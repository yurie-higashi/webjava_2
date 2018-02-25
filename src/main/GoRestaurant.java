package main;
import java.util.Scanner;
import dish.Menu;
import restaurant.Bar;
import restaurant.FastFood;
import restaurant.Izakaya;
import restaurant.Restaurant;

public class GoRestaurant {

  public static void main(String[] args) {

    System.out.println("\n「いらっしゃいませ。\n  どちらのお店に入りますか？」\n");
    System.out.println("***************************************************\n");
    System.out.println(RestaurantType.BAR.getName() + "(0) , "
    + RestaurantType.IZAKAYA.getName() + "(1) , " + RestaurantType.FASTFOOD.getName() + "(2)\n");
    System.out.println("***************************************************");

    GoRestaurant restaurant =  new GoRestaurant();

    // お店に入る
    restaurant.intoRestrant();

  }

  private void intoRestrant() {
    String selectedRestaurant = getScan();

    switch(selectedRestaurant) {
      case "0":
        Bar bar = new Bar();
        getOrder(bar);
        break;

      case "1":
        Izakaya izakaya = new Izakaya();
        getOrder(izakaya);
        break;

      case "2":
        FastFood fastFood = new FastFood();
        getOrder(fastFood);
        break;

      default:
        System.out.println("（あれ、間違えたのかな…？）\nまたのお越しをお待ちしております。");
    }
  }

  private void getOrder(Restaurant res) {

    String finish = "e";
    boolean isContinue = true;
    do {
      String order = getScan();
      if (order.equals(finish)) {
        isContinue = false;
      } else if(Menu.getMenu(order) != null) {
        res.addOrder(order);
        System.out.println("他にはございますか？（以上の場合は e を入力してください。）\n");
      } else {
        System.out.println("\n申し訳ございません、もう一度お願いいたします。\n");
        isContinue = true;
      }
    } while (isContinue);
    res.getCalc();
  }

  private String getScan() {
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    return scan.next();
  }

}