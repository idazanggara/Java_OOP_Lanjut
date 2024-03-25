package com.oop16HierarkiPkgDefpubSta.tutorial;

import com.oop15MultiFileDgnPackage.terminal.Console;

// visibility default kalau tanpa di ketik apapun, kira bisa kasih public jika kita ingin gunakan class di luar dari package kita
class Player {
  private String name;

  Player(String name){
    this.name = name;
  }

  String getName(){
    return this.name;
}


  void show() {
    // System.out.println("Player name : " + this.name);

    // kita juga bisa gunakan console disini asal kita import diatas
    Console.log("Menggunakan console");
    Console.log("Player name : " + this.name);
  }

}
