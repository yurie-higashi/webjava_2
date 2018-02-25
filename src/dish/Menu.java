package dish;

/*
 * メニューをenumとして扱うクラス
 * 名称と価格を持つ。
 */
public enum Menu {

  WINE("ワイン",800),
  BEER("ビール",700),
  COCKTAIL("カクテル",900),
  HIGHBALL("ハイボール",350),
  EDAMAME("枝豆",300),
  CHICKEN("唐揚げ",500),
  POTATO("ポテト",350),
  COKE("コーラ",200),
  HUMBURGER("ハンバーガー",400);


  private final int price;
  private final String name;

  /**.
   * コンストラクタ
   * @param id ID
   */
  private Menu(final String name, final int price) {
    this.price = price;
    this.name = name;
  }

  /**.
   * 列挙型のID取得
   * @return ID
   */
  public int getPrice() {
    return price;
  }

  /**.
   * 列挙型の日本語名の取得
   */
  public String getName() {
    return name;
  }

  /**
   * 日本語名から列挙型を取得
   */
  public static Menu getMenu(String name) {
    for (Menu menu : Menu.values()) {
      if (menu.getName().equals(name)) {
        return menu;
      }
    }
    return null;
  }

}

