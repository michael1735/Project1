package NestedClassesDemo;

public class HelloWorldAnonymousClasses {
    /*
    匿名类让你的代码更简洁. 它们允许你同时声明和实例化一个类
    它们很像local classes(也是在方法体内), 但是它们没名字, 如果你只需要用一次某个局部类的话, 你可以考虑用匿名类

    一个匿名类是一个表达式。匿名类的语法就像调用constructor一样, 但是类定义在语句块里

    匿名类的表达式含有：
    1. new 关键字
    2. name of an interface to implement or a class to extend
    3. 括号, 里面是传给构造器的参数(只在extend一个类的时候用, 如果是接口就是空的)
    4. 类主体(仅允许声明方法)
    因为匿名类是语句的一部分, 所以记住要加引号

    匿名类可以捕获变量:
    1.能调用外部类的成员
    2.只能调用上层方法中的final或effectively final的变量
    3.shadowing

    匿名类也有和局部类一样的对其成员的限制:
    1.不能声明成员接口或静态成员
    2.如果要声明静态成员, 则它们必须是constant variables

    匿名类里可以声明如下成员:
    1.fields
    2.extra methods(even if they do not implement any methods of the supertype)
    3.instance initializers(实例初始化)
    4.local classes

    但是, 你在匿名类里不能声明构造器
     */

    /*
    While local classes are class declarations, anonymous classes are expressions,
    which means that you define the class in another expression.
     */

    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("hello" + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {

            String name = "tout le monde";
            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
