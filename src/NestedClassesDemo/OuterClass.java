package NestedClassesDemo;

public class OuterClass {
    // a nested class is a member to its enclosing class
    // Categories:
    /* 1.Non-static nested classes(inner classes): have access to other members of the enclosing class,
        even if they are declared private. Associated with an instance of the enclosing class.
        because of this it cannot define any static members itself.

        instantiate inner class:
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

       2.Static nested classes: do not have access to other members of the enclosing class

       As with class methods and variables, a static nested class is associated with its outer class.
       like static class methods,
       a static nested class cannot refer directly to instance variables or methods defined in its enclosing class;
       it can use them only through an object reference.

       !! In effect, a static nested class is behaviorally a top-level class
       !! that has been nested in another top-level class for packaging convenience.

       ** instantiate it the same way as any other top-level classes:
       StaticNestedClass staticNestedObj = new StaticNestedClass();
     */

    // ***As a member of the OuterClass, a nested class can be declared private, public, protected,
    // or package private.(Recall that outer classes can only be declared public or package private.)

    /*
    Reasons for using nested classes:
    1. A way of logically grouping classes that are only used in one place.(¸ü¾«¼ò)
    2. It increases encapsulation.
    3. It leads to more readable and maintainable code.(place the code closer to where it's used)
     */
    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    class InnerClass{
        void accessMembers(){
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClasses {
        void accessMembers(OuterClass outer){
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner class: ");
        System.out.println("---------------");
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.accessMembers();

        System.out.println("\nStatic nested class: ");
        System.out.println("-----------------------");
        StaticNestedClasses staticNestedObj = new StaticNestedClasses();
        staticNestedObj.accessMembers(outerObj);

        System.out.println("\nTop level class: ");
        System.out.println("---------------------");
        TopLevelClass topLevelObj = new TopLevelClass();
        topLevelObj.accessMembers(outerObj);
    }
}
