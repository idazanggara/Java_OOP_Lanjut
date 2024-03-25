package com.oop24FnlPblcPrvtKeywordInherit.com.tutorial;

// Visibility
/*
 * 1. Public: jika method atau attribute dalam public secara explicit, maka subclass tidak boleh mengurangi visibility
 * 2. Private: jika method atau attribute dalam private secara explicit, maka subclass pun tidak dapat mengkases
 * 3. Final: method atau attrubute dengan final keyword akan diwariskan, tetapi tidak bisa dioverride. dalam class yg sama bisa dioverload
 */

public class Main {
  public static void main(String[] args) {
    Hero hero1 = new Hero("Otong", 100);
    InterlHero hero2 = new InterlHero("Ucup", 50);
    hero1.display();
    hero2.display();

    System.out.println(hero1.getHealth());
    System.out.println(hero2.getHealth());

    hero1.setHealth(120);
    hero2.setHealth(80);

    hero1.display();
    hero2.display();

    // kita coba overload final
    hero1.setHealth("reset");
    hero1.display();

    hero2.setHealth("reset");
    hero2.display();
  }

}
