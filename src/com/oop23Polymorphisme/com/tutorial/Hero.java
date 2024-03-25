package com.oop23Polymorphisme.com.tutorial;

public class Hero {
  String nama;

  Hero(String nama) {
    this.nama = nama;
  }

  void display() {
    System.out.println("\nName \t: " + this.nama);
  }

  // gunanya polymorphisme
  // berarti sekarang apapun bisa masuk menjadi paramter disini yg penting turunan
  // dari hero
  void attack(Hero enemy) {
    System.out.println("Menyerang");
  }
}
