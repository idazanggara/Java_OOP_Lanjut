package com.oop14StaticMethod;

import java.util.ArrayList;

class Player {

  private static int numberOfPlayer;
  private static ArrayList<String> nameList = new ArrayList<String>();

  private String name;

  Player(String name) {
    this.name = name;
    Player.numberOfPlayer++;
    Player.nameList.add(this.name);
  }

  void show() {
    System.out.println("Player name = " + this.name);
  }

  // static method
  static void showNumberOfPlayer() {
    System.out.println(Player.numberOfPlayer);
  }

  static ArrayList<String> getName() {
    return Player.nameList;
  }

}

public class Main {
  public static void main(String[] args) {
    // Player player1 = new Player("Idaz");
    // Player player2 = new Player("Anggara");
    // Player player3 = new Player("Zeryl");

    // System.out.println(Player.numberOfPlayer);
    Player.showNumberOfPlayer();

    System.out.println("Name = " + Player.getName());
    // System.out.println("Name = "+ player1.getName());
    // System.out.println("Name = "+ player2.getName());
    // System.out.println("Name = "+ player3.getName());

  }
}
