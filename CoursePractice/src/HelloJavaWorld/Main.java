package HelloJavaWorld;

import FirstPackage.oneClass;
import SecondPackage.twoClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java World!");

        oneClass classOne = new oneClass();
        twoClass classTwo = new twoClass();

        classOne.methodOne();
        classTwo.methodTwo();
    }
}
