package day44_custom_classes;

/**
 * App class is used as a template for App objects.
 *
 */

public class App {
  String name; // null be default
  double version; // 0.0 by default

  void open() {
      System.out.println("opening " + name +"app - version = " + version);

  }

}
