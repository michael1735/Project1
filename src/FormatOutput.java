public class FormatOutput {
    public static void main(String[] args) {
        double d = 3.1415926;
        System.out.printf("%.2f\n", d); // ��ʾ��λС��3.14
        System.out.printf("%.4f\n", d); // ��ʾ4λС��3.1416
        // "%f", floating point --> decimal
        String str = "My String!";
        System.out.format("%s", str); // any --> string

        int a = 15;
        System.out.println();
        System.out.format("%x", a); // int --> hex

        System.out.println();
        System.out.printf("%d", a); // integer --> decimal

        System.out.printf("%n"); // ����, ���治��Ҫ������
        System.out.println("FFFFF");

        System.out.println();
        // System.out.printf("%tB", a); int --> locale-specific month name  ��ʱ�ˣ���java.time��

        // ����ȷ��ռλ����ʾ
        /*
        %: begin format specifier
        1$: argument index
        +0: flags(����ǰ���+�Ż���-��)
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
