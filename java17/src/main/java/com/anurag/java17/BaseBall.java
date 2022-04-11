package com.anurag.java17;

public class BaseBall implements Games{

  @Override
  public void play() {
    System.out.println("Play on toss");
  }

  @Override
  public int noOfPlayers() {
    return 10;
  }
}
