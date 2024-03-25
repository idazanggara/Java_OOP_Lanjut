package com.oop21SubClassConstructor.com.tutorial;

public class Main {
  public static void main(String[] args) {

    Hero hero1 = new Hero("Idaz", 10, 5);
    hero1.display();

    HeroStrength hero2 = new HeroStrength("Naruko", 50, 10);
    hero2.display();

    HeroStrength hero3 =  new HeroStrength("Otong");
    hero3.display();
  }

}
