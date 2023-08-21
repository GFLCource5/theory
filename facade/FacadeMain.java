package org.example.facade;

import org.example.facade.service.SingletonManager;
import org.example.facade.service.SingletonManagerImpl;

public class FacadeMain {

  public static void main(String[] args) {
    SingletonManager singletonManager = new SingletonManagerImpl();
    singletonManager.actions();
  }

}
