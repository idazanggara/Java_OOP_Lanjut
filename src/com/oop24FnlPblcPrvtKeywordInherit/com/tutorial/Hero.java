package com.oop24FnlPblcPrvtKeywordInherit.com.tutorial;

public class Hero {
  public String name;
  private double health;

  Hero(String name, double health) {
    this.name = name;
    this.health = health;
  }

  // getter
  double getHealth() {
    return this.health;
  }

  void display() {
    System.out.println(this.name + " mempunyai  " + this.health);
  }

}
