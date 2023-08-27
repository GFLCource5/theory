package org.example;

public class ProxySalesman implements Salesman {

  private final Salesman salesman;

  public ProxySalesman(Salesman salesman) {
    this.salesman = salesman;
  }

  public void sell(int sum, String[] products) {

    System.out.println(
        """
        Parameters is sum and array of strings.
        """
    );

    salesman.sell(sum, products);

  }
}
