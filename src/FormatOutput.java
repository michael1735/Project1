public class FormatOutput {
    public static void main(String[] args) {
        double d = 3.1415926;
        System.out.printf("%.2f\n", d); // 显示两位小数3.14
        System.out.printf("%.4f\n", d); // 显示4位小数3.1416
        // "%f", floating point --> decimal
        String str = "My String!";
        System.out.format("%s", str); // any --> string

        int a = 15;
        System.out.println();
        System.out.format("%x", a); // int --> hex

        System.out.println();
        System.out.printf("%d", a); // integer --> decimal

        System.out.printf("%n"); // 换行, 后面不需要跟参数
        System.out.println("FFFFF");

        System.out.println();
        // System.out.printf("%tB", a); int --> locale-specific month name  过时了，换java.time吧

        // 更精确的占位符表示
        /*
        %: begin format specifier
        1$: argument index
        +0: flags(数据前面加+号还是-号)
        20: width
        .10: precision
        f: conversion
         */
        double doub = 3.15;
        System.out.format("%f, %1$+020.10f %n", Math.PI);
        System.out.format("%2$+010.5f, %1$+03.2f %n", d, doub);
        System.out.printf("%s %n", d);
        System.out.printf("%d %n", a);
        System.out.printf("%o", a);
    }
}
