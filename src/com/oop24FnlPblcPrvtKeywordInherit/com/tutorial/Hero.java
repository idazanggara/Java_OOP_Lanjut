package com.oop24FnlPblcPrvtKeywordInherit.com.tutorial;

public class Hero {
  public String name;
  private double health;

  Hero(String name, double health) {
    this.name = name;
    this.health = health;
  }

  // getter
  public double getHealth() {
    return this.health;
  }

  public void display() {
    System.out.println(this.name + " mempunyai  " + this.health);
  }

  // setter
  final void setHealth(double newHealth) {
    this.health = newHealth;
  }

  // kita coba overload
  // dan bisa di overload, baik gunakan final dan tanpa final
  void setHealth(String mode) {
    if (mode.equals("reset")) {
      this.health = 100;
    }
  }

}
