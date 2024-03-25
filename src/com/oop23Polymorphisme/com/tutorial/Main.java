package com.oop23Polymorphisme.com.tutorial;

public class Main {
  public static void main(String[] args) {
    Hero hero1 = new Hero("Idaz");
    HeroStrength hero2 = new HeroStrength("Ucup");
    hero1.display();
    hero2.display();

    // Polymorphic
    Hero hero3 = new HeroAgility("Otong");// ini bisa
    hero3.display();

    // Ini tidak bisa, dia berlaku kebawan bukan keatas
    // HeroIntel hero4 = (HeroIntel) new Hero("Mahmud"); // ini enggak bisa, kita
    // harus casting manual
    // hero4.display();

    // HeroIntel hero5 = new HeroAgility("Mahmud"); // sejajar turunannya juga tidak
    // bisa

    HeroAgility hero4 = new HeroAgility("Mahmud");
    hero4.display();

    // Array list
    // jadi kita bisa nemapung semua tipe data childnya dengan menggunakan penampung
    // typedata parentnya
    Hero[] kumpulanHero = new Hero[4];
    kumpulanHero[0] = hero1;
    kumpulanHero[1] = hero2;
    kumpulanHero[2] = hero3;
    kumpulanHero[3] = hero4; // disini berlaku casting

    // System.out.println(Arrays.toString(kumpulanHero));
    // kumpulanHero[0].display();
    // kumpulanHero[1].display();

    // kumpulanHero[2].showOff(); // tidak bisa
    // hero3.showOff(); // tidak bisa
    // kumpulanHero[3].showOff(); // tidak bisa
    hero4.showOff(); // bisa
    for (Hero hero : kumpulanHero) {
      // hero.display();
      System.out.println(hero instanceof HeroAgility);
    }

  }

  // public static void main(String[] args) {
  // TestHero hero1 = new TestHero("Idaz");
  // func(hero1);
  // TestTest hero2 = new TestTest("Idaz");
  // func(hero2);
  // Integer inter = 10;
  // Double doub = 10.0;
  // Number num = 10;

  // System.out.println(""+inter + doub + num);
  // }

  // static void func(Hero hero){
  // System.out.println(hero.nama);
  // }
}

// Bisa sampai turunan ke 7 menggunakan type parentnya
// class TestHero extends HeroAgility{
// TestHero(String name){
// super(name);
// }

// }
// class TestTest extends TestHero{
// TestTest(String name){
// super(name);
// }
// }