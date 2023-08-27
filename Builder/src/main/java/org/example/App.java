package org.example;

import org.example.builder.Builder;
import org.example.builder.FactoryBuilder;
import org.example.builder.FactoryBuilderImpl;
import org.example.model.Car;
import org.example.model.Tree;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) throws Exception {
    FactoryBuilder factoryBuilder = new FactoryBuilderImpl();
    Builder<Car> carBuilder = factoryBuilder.getBuilder(Car.class);

    carBuilder.setProperty("places", 10);
    carBuilder.setProperty("isRightHandDrive", Boolean.TRUE);

    Car car = carBuilder.build();

    System.out.println(car.toString());

    Builder<Tree> treeBuilder = factoryBuilder.getBuilder(Tree.class);
    treeBuilder = treeBuilder.setProperty("name", "oak");
    Tree oak = treeBuilder.build();
    System.out.println(oak.toString());

    treeBuilder = factoryBuilder.getBuilder(Tree.class);
    treeBuilder = treeBuilder.setProperty("name", "birch");
    Tree birch = treeBuilder.build();
    System.out.println(birch.toString());

  }
}
