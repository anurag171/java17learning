package com.anurag.java17;

import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    GamesInIndia games = new GamesInIndia();
    System.out.println(games.getClass().isSealed());
    System.out.println(Arrays.toString(games.getClass().getPermittedSubclasses()));
  }

}
