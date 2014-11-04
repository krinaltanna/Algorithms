
class Product {
}

interface Factory {
  Product create();
}

class SingletonFactory implements Factory {
  private Product product;

  public synchronized Product create() {
    if (this.product == null) {
      product = new Product();
    }
    return product;
  }
}

public class FactoryDemo {

  public static void main(String[] args) {
    Factory factory = new SingletonFactory();
    Product p1 = factory.create();
    for (int i = 0; i < 100; i++) {
      if (factory.create() != p1) {
        System.out.println("Factory returned another instance of Product!");
      }
    }
  }

}