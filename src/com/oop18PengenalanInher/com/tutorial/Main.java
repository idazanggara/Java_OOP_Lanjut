package com.oop18PengenalanInher.com.tutorial;

// inheritance adalah hubungan is-a / adalah


// class Hero{
//   String name;

// }
// class HeroStrength{
//   String name;
// }
// nah kalau kita bikin 2 class sama seperti ini hero dan hs kan jadinya banyak ya. dan ngulang"
// makannya kita perlu kontrak si warisan

// sueperClass, parentClass, baseClass
// class Hero{
//   String name;

//   void display() {
//     System.out.println("Name : " + this.name);
//   }
// }
// subClass, childClass, derivedClass
// class HeroStrength extends Hero{
//   // hampa nih
// }
// class HeroIntelligent extends Hero{
//   // hampa nih
// }

// kita pindah ke file sendiri, dan diskosongin aja

public class Main {
  public static void main(String[] args) {
    Hero hero1 = new Hero();
    hero1.name = "Ucup";
    System.out.println("Herro 1 : " + hero1.name);


    HeroStrength hero2 = new HeroStrength();
    hero2.name = "Ucup";
    System.out.println("Herro 2 : " + hero2.name);

    HeroIntelligent hero3 = new HeroIntelligent();
    hero3.name = "Ucup";
    System.out.println("Herro 3 : " + hero3.name);
  }
}
