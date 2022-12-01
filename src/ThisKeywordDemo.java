public class ThisKeywordDemo {
    // 假设这个类名叫Student
    String name = "ASCII";
    int age;
    long phone;
    String address;
    // 有参构造方法
    public ThisKeywordDemo(String name, int age, long phone, String address){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
    public String getName(){
        // 访问成员变量name
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        ThisKeywordDemo student1 = new ThisKeywordDemo("Mkl", 17, 123456, "Ex-aid");
        student1.getName();
        System.out.println(student1.name);
    }
}
// this 主要是解决shadowing fields 的问题，就是如果成员变量和局部变量同名，就会导致调用方法出现问题
