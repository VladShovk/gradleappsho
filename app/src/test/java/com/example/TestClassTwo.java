package com.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {
  @Parameters({"brand", "model"})
  @Test
  public void carFromParameters(String brand, String model) {
    System.out.println("Brand: " + brand + "\nModel: " + model);
  }

  @DataProvider(name = "TestDataProvider")
  public Object[][] createTestData() {
    return new Object[][]{
        {"Ford", "F-150"}
    };
  }

  @Test(dataProvider = "TestDataProvider")
  public void carFromProviderTest(String brand, String model) {
    System.out.println("Brand: " + brand + "\nModel: " + model);
  }
}

