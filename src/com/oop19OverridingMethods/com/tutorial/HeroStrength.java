package com.oop19OverridingMethods.com.tutorial;

// jadi sesuatu yg di wariskan dari superclassnya bisa di modifikasi oleh subclassnya

// jadi artinya, ketika si subclass menjalankan method, dia akan menjadi di classnya sependiri dulu baru ke super/parent classnya
public class HeroStrength extends Hero{
  double defencePower;

  // overriding methods
  void display(){
      System.out.println("\nHero Strength");
      System.out.println("Hero Name : " + this.name);
      System.out.println("Defence Power : " + this.defencePower);
  }
}
