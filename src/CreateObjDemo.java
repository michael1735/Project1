public class CreateObjDemo {

    public static void main(String[] args) {
        // Declare & create 3 objects
        Point originOne = new Point(23, 94);
        /*
        Point originOne: Declaration声明
        new: Instantiation实例化
        Point(23, 94): Initialization初始化
         */
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
        /*
        type name: 如: int a;-->primitive variable
        Point originOne, 调用了构造器, reference variable
         */
        /*
        Java的奇妙用法:
        new operator returns a reference to an object.
        SO! you could use the value returned from new to access a new object's fields
        例子:
        int height = new Rectangle().height;
        计算一个Rectangle对象的默认height值
         */

        // display rectOne's width height, and area
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());
        /*
        reference to an object's field outside the class:
        类外对field的调用
        objectReference.fieldName, 如: rectOne.width
         */
        /*
        calling an object's methods:
        objectReference.methodName(argumentList);
        OR
        objectReference.methodName();

        和实例化的fields一样, 你可以用变量名, 也可以用任何返回一个对象的表达式, 比如说new
        int areaOfRectangle = new Rectangle(100, 50).getArea();
        你可以把返回值赋值给一个变量, 然后用它做判断或者控制循环
         */
        // Remember, invoking a method on a particular object is the same as sending a message to that object

        // set rectTwo's position
        rectTwo.origin = originOne;

        // display rectTwo's position
        System.out.println("X position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y position of rectTwo: " + rectTwo.origin.y);

        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y position of rectTwo: " + rectTwo.origin.y);
    }
}
