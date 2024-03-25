package com.oop20SuperInher.com.tutorial;

// this.name akan mengakses atribut name kalau ada di kelas ini.
// jika tidak ada maka akamn mengakses attribut name dari super class.

// super.name akan selalu mengakses atribut superclass.
public class HeroStrength extends Hero {
  String name = "Class Strength"; // ini di comment, maka this.name akan ke superclassnya

  void display() {
    System.out.println("Ini adalah " + this.name);
    this.dummyMethod();
  }

  void displaySuper() {
    System.out.println("Ini adalah " + super.name);
    super.dummyMethod();
  }

  void dummyMethod() { // method ini di comment, maka this.dummyMethod() akan menjalkan method super
    System.out.println("method ini ada di subclass");
  }

}
