package org.example;

public class SalesmanImpl implements Salesman{

  public void sell(int sum, String[] products) {

    System.out.println("Sum is: " + sum);
    System.out.println("List of products:");
    for(String product : products){
      System.out.println(product);
    }
    System.out.println("\n");
  }
}
