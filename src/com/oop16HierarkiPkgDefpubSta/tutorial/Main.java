package com.oop16HierarkiPkgDefpubSta.tutorial;
// kita menggunakan class player tanpa import disini karena di satu package yg sama

// ketika kita gunakan class di luar pkg kita, kita perlu import dan class bentuknya public
import com.oop15MultiFileDgnPackage.terminal.Console;
import com.oop16HierarkiPkgDefpubSta.terminal.Terminal;

// kita juga bisa import static method dari console
import static com.oop15MultiFileDgnPackage.terminal.Console.log;


// ini tidak akan bisa, penggunaan private tidak diperkenankan
// private class Test{

// }

public class Main {
  public static void main(String[] args) {
    Player player1 = new Player("Otong");
    player1.show();

    Console.log("Console " + player1.getName());
    Terminal.log("Terminal " + player1.getName());

    log("static log " + player1.getName());
  }
}
