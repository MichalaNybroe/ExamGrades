package examgrades;

import java.util.Scanner;

public class Menu {

  //ATTRIBUTES
  private String menuHeader;
  private String leadText;
  private String[] menuItems;

  Scanner scanner = new Scanner(System.in);

  //CONSTRUCTOR
  public Menu(String menuHeader, String leadText, String[] menuItems) {
    this.menuHeader = menuHeader;
    this.leadText = leadText;
    this.menuItems = menuItems;
  }

  //GETTER
  public String getMenuHeader() {
    return menuHeader;
  }

  public String getLeadText() {
    return leadText;
  }

  public String[] getMenuItems() {
    return menuItems;
  }

  //METHODS
  public void printMenu() {
    System.out.println(getMenuHeader());
    for (int i = 0; i < menuItems.length; i++) {
      System.out.println(getMenuItems()[i]);
    }
    System.out.println(getLeadText());
  }

  public int readChoice() {
    while (!scanner.hasNextInt()) {
      System.out.println(getLeadText());
      scanner.next();
    }
    return scanner.nextInt();
  }
}
