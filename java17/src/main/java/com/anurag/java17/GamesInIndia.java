package com.anurag.java17;


public sealed class GamesInIndia implements Games permits Cricket, Football, Hockey {

  @Override
  public void play() {

  }

  @Override
  public int noOfPlayers() {
    return 0;
  }
}
