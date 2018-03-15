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
    String selectedRestaurant = restaurant.getScan();

    // お店に入る
    restaurant.intoRestrant(selectedRestaurant);

  }

  private void intoRestrant(String selectedRestaurant) {

    Restaurant restaurant = null;

    switch(selectedRestaurant) {
      case "0":
        restaurant = new Bar();
        break;

      case "1":
        restaurant = new Izakaya();
        break;

      case "2":
        restaurant = new FastFood();
        break;

      default:
        System.out.println("（あれ、間違えたのかな…？）\nまたのお越しをお待ちしております。");
        return;
    }

    // メニューを見る
    restaurant.showMenu();
    // 注文する
    restaurant.addOrder();
    // 食べる
    restaurant.eat();
    // お会計をする
    restaurant.getCalc();

  }

  private String getScan() {
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    return scan.next();
  }

}