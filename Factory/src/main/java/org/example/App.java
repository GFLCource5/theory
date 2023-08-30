package org.example;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) throws ClassCastException {

    Fabric<Object> fabric = new FabricImpl<>();

    Singleton clazz = (Singleton) fabric.getClazz(Fabric.class);
    System.out.println("Hash of clazz: " + clazz.hashCode());
    Singleton clazzNew = (Singleton) fabric.getClazz(Fabric.class);
    System.out.println("Hash of new instance of clazz: " + clazzNew.hashCode());

    System.out.println(
        "Hash clazz and hash clazzNew text is: " + isEquals(clazz.hashCode(), clazzNew.hashCode())
            + "\n");

    String text = clazz.text();
    System.out.println("Default call: " + text);
    Singleton clazz1 = (Singleton) fabric.getClazz(SingletonImpl.class);
    String text1 = new String(clazz1.text());
    System.out.println("SingletonImpl call: " + text1);
    System.out.println("First and second text is: " + isEquals(text, text1) + "\n");

    fabric.clear();

    Singleton clazz2 = (Singleton) fabric.getClazz(SingletonImplTwo.class);
    String text3 = clazz2.text();
    System.out.println("SingletonImplTwo call: " + text3);
    Singleton clazz4 = (Singleton) fabric.getClazz(SingletonImpl.class);
    String text4 = new String(clazz4.text());
    System.out.println("SingletonImpl call: " + text4);
    System.out.println("First and second text is: " + isEquals(text3, text4));

  }

  private static String isEquals(int hashCode, int hashCode1) {
    return String.valueOf(hashCode == hashCode1);
  }

  private static String isEquals(String text, String text1) {
    return String.valueOf(text.compareTo(text1) == 0 ? true : false);
  }


}
