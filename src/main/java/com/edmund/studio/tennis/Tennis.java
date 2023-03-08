package com.edmund.studio.tennis;

import java.util.HashMap;

public class Tennis {

  private final HashMap<Integer, String> scoreLookup = new HashMap<>() {{
    put(1, "fifteen");
    put(2, "thirty");
    put(3, "forty");
    put(0, "love");
  }};

  private int firstPlayerScoreTimes;

  private int secondPlayerScoreTimes;

  public String score() {
    if (scoreDifferent()) {
      return lookupScore();
    }
    return sameScore();
  }

  private boolean scoreDifferent() {
    return secondPlayerScoreTimes != firstPlayerScoreTimes;
  }

  private String sameScore() {
    return scoreLookup.get(firstPlayerScoreTimes) + " all";
  }

  private String lookupScore() {
    return scoreLookup.get(firstPlayerScoreTimes) + " " + scoreLookup.get(secondPlayerScoreTimes);
  }

  public void firstPlayerScore() {
    firstPlayerScoreTimes++;
  }

  public void secondPlayerScore() {
    secondPlayerScoreTimes++;
  }

}
