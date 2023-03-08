package com.edmund.studio.tennis;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisTest {

  private final Tennis tennis = new Tennis();

  @Test
  void love_all() {
    scoreShouldBe("love all");
  }

  @Test
  void fifteen_love() {
    givenFirstPlayerScore(1);
    scoreShouldBe("fifteen love");
  }

  @Test
  void thirty_love() {
    givenFirstPlayerScore(2);
    scoreShouldBe("thirty love");
  }

  @Test
  void forty_love() {
    givenFirstPlayerScore(3);
    scoreShouldBe("forty love");
  }

  @Test
  void love_fifteen() {
    givenSecondPlayerScore(1);
    scoreShouldBe("love fifteen");
  }

  @Test
  void love_thirty() {
    givenSecondPlayerScore(2);
    scoreShouldBe("love thirty");
  }

  @Test
  void fifteen_all() {
    givenFirstPlayerScore(1);
    givenSecondPlayerScore(1);
    scoreShouldBe("fifteen all");
  }

  @Test
  void thirty_all() {
    givenFirstPlayerScore(2);
    givenSecondPlayerScore(2);
    scoreShouldBe("thirty all");
  }

  private void givenSecondPlayerScore(int times) {
    for (int i = 0; i < times; i++) {
      tennis.secondPlayerScore();
    }
  }

  private void givenFirstPlayerScore(int times) {
    for (int i = 0; i < times; i++) {
      tennis.firstPlayerScore();
    }
  }

  private void scoreShouldBe(String expected) {
    Assertions.assertThat(tennis.score()).isEqualTo(expected);
  }

}
