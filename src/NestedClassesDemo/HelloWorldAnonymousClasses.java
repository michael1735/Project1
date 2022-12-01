package NestedClassesDemo;

public class HelloWorldAnonymousClasses {
    /*
    ����������Ĵ�������. ����������ͬʱ������ʵ����һ����
    ���Ǻ���local classes(Ҳ���ڷ�������), ��������û����, �����ֻ��Ҫ��һ��ĳ���ֲ���Ļ�, ����Կ�����������

    һ����������һ�����ʽ����������﷨�������constructorһ��, �����ඨ����������

    ������ı��ʽ���У�
    1. new �ؼ���
    2. name of an interface to implement or a class to extend
    3. ����, �����Ǵ����������Ĳ���(ֻ��extendһ�����ʱ����, ����ǽӿھ��ǿյ�)
    4. ������(��������������)
    ��Ϊ������������һ����, ���Լ�סҪ������

    ��������Բ������:
    1.�ܵ����ⲿ��ĳ�Ա
    2.ֻ�ܵ����ϲ㷽���е�final��effectively final�ı���
    3.shadowing

    ������Ҳ�к;ֲ���һ���Ķ����Ա������:
    1.����������Ա�ӿڻ�̬��Ա
    2.���Ҫ������̬��Ա, �����Ǳ�����constant variables

    ������������������³�Ա:
    1.fields
    2.extra methods(even if they do not implement any methods of the supertype)
    3.instance initializers(ʵ����ʼ��)
    4.local classes

    ����, �����������ﲻ������������
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
