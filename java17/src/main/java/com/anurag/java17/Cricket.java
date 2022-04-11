package com.anurag.java17;

public non-sealed class Cricket extends GamesInIndia {

  @Override
  public void play() {
    System.out.println("Play on toss");
  }

  @Override
  public int noOfPlayers() {
    return 22;
  }
}
