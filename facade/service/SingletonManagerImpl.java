package org.example.facade.service;

import org.example.facade.singletons.Singleton1;
import org.example.facade.singletons.Singleton2;
import org.example.facade.singletons.Singleton3;

public class SingletonManagerImpl implements SingletonManager {

  @Override
  public void actions() {
    Singleton1.instance.print();
    Singleton2.instance.print();
    Singleton3.instance.print();
  }
}
