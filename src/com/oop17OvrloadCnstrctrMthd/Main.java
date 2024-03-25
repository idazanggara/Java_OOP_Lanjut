package com.oop17OvrloadCnstrctrMthd;

// Overloading adalah ketika kita ingin buat metode dengan nama yg sama tapi keluakuannya beda.

public class Main {
  public static void main(String[] args) {
    // overloading pada constructor
    Player player1 = new Player("Saitama");
    Player player2 =  new Player();
    Player player3 = new Player();
    Player player4 = new Player("Asta");

    player1.show();
    player2.show();
    player3.show();
    player4.show();

    // ---
    int a =  Mtk.tambah(1, 19);
    System.out.println(a);
    double b = Mtk.tambah(a, a);
    System.out.println(b);
  }
}
