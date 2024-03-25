package com.oop25Casting.com.tutorial;

public class Main {
  public static void main(String[] args) {
    // casting
    double angka = 5.4;
    int angka_int = (int) angka;
    System.out.println(angka_int);

    // object dengan class HeroIntel
    HeroIntel hero1 = new HeroIntel("Ucup", 100);
    hero1.display();
    // lalu coba kita casting objectnya
    // up casting
    Hero heroUp = (Hero) hero1;
    heroUp.display();
    // ada field dan method yg hilang
    // System.out.println(heroUp.type);// ini enggak bisa ambil type di child,
    // karena posisi kita di parentnya yaitu di Hero
    // heroUp.castMagic(); // enggak bisa juga

    Hero heroReg = new Hero("Otong", 100);
    heroReg.display();
    // down casting dari Parentclass ke childclass, tidak bisa. tidak bisa down
    // casting
    // HeroAgility heroDown = (HeroAgility) heroReg;
    // heroDown.display(); // ENGGAK BISA, ERROR

    // kita coba dari intel ke hero biasa lalu kita balikan ke intel lagi
    // BERHASIL DI DOWN casting, dengan syarat bentuk awalnya adalah sama
    HeroIntel heroFIntlToHrToIntlAgain = (HeroIntel) heroUp;
    heroFIntlToHrToIntlAgain.display();
    System.out.println(heroFIntlToHrToIntlAgain.type);
    heroFIntlToHrToIntlAgain.castMagic();

    // kita bisa lakukan pengecekkan dengan instanceof

    System.out.println(heroUp instanceof HeroIntel); // true
  }
}
