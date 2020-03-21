package yarchuk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        TestClass testClass = new TestClass("asdasd", 123, true);
        TestClass testClass1 = new TestClass("ljkljk", 125, false);
        TestClass testClass2 = new TestClass("gfdgfd", 124, false);
        TestClass testClass3 = new TestClass("ljkljk", 125, false);
        TestClass testClass4 = new TestClass("cvbcvd", 126, true);

        Collection<TestClass> list = new ArrayList<>();
        list.add(testClass);
        list.add(testClass1);
        list.add(testClass2);
        list.add(testClass3);
        list.add(testClass4);

        NoDuplicateCollection<TestClass> noDuplicateCollection = new NoDuplicateCollection<TestClass>();

        System.out.println(noDuplicateCollection.deleteDuplicates(list));

        QuadraticEquationRoots quadraticEquationRoots = new QuadraticEquationRoots();

        quadraticEquationRoots.calculateRootsWithVieta( -5, 6);
        quadraticEquationRoots.calculateRootsWithDiscriminant(1, -6, 9);
    }
}
