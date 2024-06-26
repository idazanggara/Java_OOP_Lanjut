package com.oop23Polymorphisme.com.tutorial;

public class HeroAgility extends Hero {
  String type = "Agility";

  HeroAgility(String nama) {
    super(nama);
  }

  @Override
  void display() {
    super.display();
    System.out.println("Type \t: " + this.type);
  }

  void showOff() {
    System.out.println("Saya hero Agility " + this.nama);
  }
}
