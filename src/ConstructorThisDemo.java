public class ConstructorThisDemo {
    // 在构造器里面, 可以用this来调用同一个类里的另一个构造器.这个叫做 explicit constructor invocation.
    // 要注意的几点是:
    // 这个只能在构造方法里使用;
    // 使用this()调用构造方法的语句必须在第一行，且只能出现一次
    // 不能在一个类的两个构造方法中使用this()互相调用
    // suppose the name of the class is Rectangle
    private int x, y;
    private int width, height;

    public ConstructorThisDemo(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public ConstructorThisDemo(){
        this(0, 0, 1, 1);
    }

    public ConstructorThisDemo(int width, int height){
        this(0, 0, width, height);
    }

    public static void main(String[] args) {
        ConstructorThisDemo Rectangle1 = new ConstructorThisDemo();
        int anArray[] = {Rectangle1.x, Rectangle1.y, Rectangle1.width, Rectangle1.height};
        for (int item : anArray){
            System.out.println(item);
        }
    }
}
