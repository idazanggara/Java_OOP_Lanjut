package com.oop24FnlPblcPrvtKeywordInherit.com.tutorial;

// public ini akan terbuka untuk semuanya
public class InterlHero extends Hero {

  // mungkin kalau mau kita buat health private juga disini, tapi ini tidak
  // efesien
  // private double health;

  InterlHero(String name, double health) {
    super(name, health);
    // System.out.println(this.health); // tidak bisa diakses karena private
  }

  // kita mau override getHealth(); kita harus kasih public juga karena di
  // parentnya getHealth(); sudah public
  // karena di superclass method public, maka di subclass harus public juga
  // public double getHealth() {
  // return this.health; // ini tidak mau karena private
  // }

  // visibility harus sama dengan Parentclass
  public void display() {
    System.out.println(this.name + " mempunyai banyak  " + getHealth());
  }

  // kita coba override final setter
  // final, enggak bisa di override
  // void setHealth(double newHealth) {
  // System.out.println("Mencoba memasukkan health = " + newHealth);
  // }

  // ini bisa di override karena method overloading di pareng enggak di final
  void setHealth(String mode) {
    System.out.println("Mencoba memasukkan health = " + mode);
  }

}
