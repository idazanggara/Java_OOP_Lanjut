package com.oop21SubClassConstructor.com.tutorial;

class Hero {
  // attribute
  String name;
  double defencePower;
  double attackPower;

  // constructor
  Hero(String name, double defencePower, double attackPower) {
    this.name = name;
    this.defencePower = defencePower;
    this.attackPower = attackPower;
  }

  Hero(String name){
    this.name = name;
  }

  void display() {
    System.out.println("Name \t\t: " + this.name);
    System.out.println("Attack Power \t: " + this.attackPower);
    System.out.println("Defence Power \t: " + this.defencePower);
  }
}