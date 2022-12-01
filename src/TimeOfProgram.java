public class TimeOfProgram {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis(); //获取开始时间

        //要测的程序或方法

        long endTime=System.currentTimeMillis(); //获取结束时间

        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
// 放在main里面
    }
}
