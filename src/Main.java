package src;

import src.p1.MyClass;

public class Main {
    // java -d build src/Main.java
    // java -cp ./build/ src/Main
    public static void main(String[] args) {
        System.out.println("this is main new");
        MyClass x = new MyClass();
        x.foo();

    }
}
