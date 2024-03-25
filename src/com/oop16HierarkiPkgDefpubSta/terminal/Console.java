package com.oop16HierarkiPkgDefpubSta.terminal;

// visibilitas public, disini bisa di akses untuk semuanya
public class Console {
  public static void log(String message) {
    System.out.println(message);
  }
}

// kita tidak bisa buat 2 class public di dalam satu file
// public class Terminal {

// }
// tapi kalau class default kita bisa buat lebih dari 1, tapi ingat ini hanya bisa di akses di dalam package yg sama atau tidak bisa di import
class Terminal {

}