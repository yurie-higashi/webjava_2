package dish;
public class Dish extends DishBase {

  public Dish(Menu menu) {
    super(menu);
  }

  private static String finish = "e";

  public enum Menu {

    WINE("ワイン",800),
    BEER("ビール",700),
    COCKTAIL("カクテル",900),
    HIGHBALL("ハイボール",350),
    EDAMAME("枝豆",300),
    CHICKEN("唐揚げ",500),
    POTATO("ポテト",350),
    COKE("コーラ",200),
    HUMBURGER("ハンバーガー",400),
    FINISH("以上",0);

    private final int itemPrice;
    private final String itemName;

    /**
     * Menuのコンストラクタ
     * @param name
     * @param price
     */
    private Menu(final String itemName, final int itemPrice) {
      this.itemPrice = itemPrice;
      this.itemName = itemName;
    }

    /**.
     * 列挙型のID取得
     * @return ID
     */
    public int getItemPrice() {
      return itemPrice;
    }

    /**.
     * 列挙型の日本語名の取得
     */
    public String getItemName() {
      return itemName;
    }

    /**
     * 日本語名より Menu を返す
     */
    public static Menu getMenu(String itemName) {
      for (Menu menu : Menu.values()) {
        if (menu.getItemName().equals(itemName)) {
          return menu;
        } else if (itemName == finish) {
          return Menu.FINISH;
        }
      }
      return null;
    }

  }
}