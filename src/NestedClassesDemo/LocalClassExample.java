package NestedClassesDemo;

/*
 * Copyright (c) 2013, 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

public class LocalClassExample {
    /*
    �ܽ�:
    �ֲ�������һ��block(����)����������
    �ֲ�����Ե������ⲿ��ĳ�Ա
    �ֲ���Ҳ���Ե������ⲿ������final��Ա��effectively final��Ա(�ڵ���֮ǰ��ֵ����)
    In Java SE8 and later: �ֲ�����Ե������ϲ㷽���Ĳ���

    �ֲ�����ڲ������, ��Ϊ���Ƕ����������κεľ�̬��Ա, Ҳֻ�ܵ����ⲿ��ľ�̬��Ա
    �ֲ���Ǿ�̬��ԭ������Ϊ�����ܵ������������ʵ����Ա
    �������˲��������ӿ�; ���Ǳ������Ǿ�̬��
    �ֲ����ﲻ��������Ա�ӿڻ��߾�̬��Ա

    ����, �ھ�̬��Ա��constant variables��ʱ���ǿ�������Ϊ��̬��(constant variable��һ��primitive type/String���͵�final,
    ������һ��ֵ�����ڱ���ʱ��֪������ʽ)
     */

    /**
     * A local class has access to the members of its enclosing class.
     * In the previous example, the PhoneNumber constructor accesses the member LocalClassExample.regularExpression.
     * In addition, a local class has access to local variables. However, a local class can only access local
     * variables that are declared final.
     * When a local class accesses a local variable or parameter of the enclosing block,
     * it captures that variable or parameter. For example, the PhoneNumber constructor can
     * access the local variable numberLength because it is declared final; numberLength is a captured variable.
     */

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

        final int numberLength = 10;


        // Valid in JDK 8 and later:

        // int numberLength = 10;

        /*
         * However, starting in Java SE 8, a local class can access local variables and
         * parameters of the enclosing block that are final or effectively final.
         * A variable or parameter whose value is never changed after it is initialized is effectively final.
         * �������������
         *
         * �ֲ���û������/�����κξ�̬��Ա��(��̬������ľֲ���)Ҳֻ�ܵ����ⲿ��ľ�̬��Ա
         * (non-static because they have access to instance members of the enclosing block)
         * =>that means they cannot contain most kinds of static declarations
         */

        class PhoneNumber {

            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){
                // numberLength = 7;
                String currentNumber = phoneNumber.replaceAll(
                        regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            // Valid in JDK 8 and later:

//            public void printOriginalNumbers() {
//                System.out.println("Original numbers are " + phoneNumber1 +
//                    " and " + phoneNumber2);
//            }
// Starting in Java SE 8, if you declare the local class in a method,
// it can access the method's parameters.
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        // Valid in JDK 8 and later:

//        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());

    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}
// ע������:
// You cannot declare an interface inside a block; interfaces are inherently static.
// You cannot declare static initializers or member interfaces in a local class.
// A local class can have static members provided that they are constant variables.
// (A constant variable is a variable of primitive type or type String that is declared final
// and initialized with a compile-time constant expression. A compile-time constant expression is
// typically a string or an arithmetic expression that can be evaluated at compile time.
// See Understanding Class Members for more information.)
