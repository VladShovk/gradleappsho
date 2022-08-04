package com.example;

import org.testng.annotations.*;

public class SimpleTest {
  @BeforeClass
  public void setUpSimpleClass() {
    String name = new Object() {}.getClass().getEnclosingMethod().getName();
    System.out.println(name);
  }

  @BeforeMethod
  public void setUpSimpleMethod() {
    String name = new Object() {}.getClass().getEnclosingMethod().getName();
    System.out.println(name);
  }

  @AfterClass
  public void tearDownSimpleClass() {
    String name = new Object() {}.getClass().getEnclosingMethod().getName();
    System.out.println(name);
  }

  @AfterMethod
  public void tearDownSimpleMethod() {
    String name = new Object() {
    }.getClass().getEnclosingMethod().getName();
    System.out.println(name);
  }

  @Test
  public void firstTest() {
    System.out.println("First test");
  }

  @Test
  public void secondTest() {
    System.out.println("Second test");
  }
}