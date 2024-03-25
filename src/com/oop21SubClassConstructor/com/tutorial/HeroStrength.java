package com.oop21SubClassConstructor.com.tutorial;

class HeroStrength extends Hero {
  String attribute = "Strength";

  // subclass juga harus buat contructor dan harus
  // implement superclass dengan keyword super
  HeroStrength(String name, double defence, double attack) {
    super(name, defence, attack);
    // this.name = "-----"; // bisa sepert ini tapi ini tembak langsung
  }

  HeroStrength(String name) {
    super(name);
  }

  void display() {
    System.out.println("\nHero " + this.attribute);
    super.display();
  }
}
