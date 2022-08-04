package com.example;

import org.testng.annotations.Test;

public class TestClassOne {
  @Test(groups = "toInclude")
  public void setUp() {
    String name = new Object() {
    }.getClass().getEnclosingMethod().getName();
    System.out.println(name);
  }

  @Test(groups = "toExclude")
  public void tearDown() {
    String name = new Object() {
    }.getClass().getEnclosingMethod().getName();
    System.out.println(name);
  }

  @Test(groups = "toInclude")
  public void test() {
    System.out.println("Test passed");
  }
}
