package main;
/**
 * レストラン列挙型
 *
 */
public enum RestaurantType {

  BAR("バー",0),
  IZAKAYA("居酒屋",1),
  FASTFOOD("ファーストフード",2);

  private final int id;
  private final String name;

  /**.
   * コンストラクタ
   * @param id ID
   */
  private RestaurantType(final String name, final int id) {
    this.id = id;
    this.name = name;
  }

  /**.
   * 列挙型のID取得
   * @return ID
   */
  public int getId() {
    return id;
  }

  /**.
   * 列挙型の日本語名の取得
   */
  public String getName() {
    return name;
  }

}
