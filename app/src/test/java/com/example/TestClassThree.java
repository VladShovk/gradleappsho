package com.example;

import org.testng.annotations.Test;

public class TestClassThree {
  @Test(priority = 3)
  public void first() {
    System.out.println("First but last in output");
  }

  @Test(priority = 1)
  public void second() {
    System.out.println("Second but first in output");
  }

  @Test(priority = 2)
  public void last() {
    System.out.println("Last but second in output");
  }
}
