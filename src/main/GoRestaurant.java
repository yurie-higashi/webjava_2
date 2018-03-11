package main;
import java.util.Scanner;
import restaurant.Bar;
import restaurant.FastFood;
import restaurant.Izakaya;
import restaurant.Restaurant;

public class GoRestaurant {

  public static void main(String[] args) {

    System.out.println("***************************************************\n");
    System.out.println("  いらっしゃいませ！\n  どちらのお店に入りますか？\n");
    System.out.println("  " + RestaurantType.BAR.getName() + "(0) , "
    + RestaurantType.IZAKAYA.getName() + "(1) , " + RestaurantType.FASTFOOD.getName() + "(2)\n");
    System.out.println("***************************************************");
    System.out.print("【選択】：");

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
    res.addOrder();
  }

  private String getScan() {
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    return scan.next();
  }

}