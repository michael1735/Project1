package NestedClassesDemo;

public class ShadowTest {
    public int x = 0;

    class FirstLevel{
        public int x = 1;

        void methodInFirstLevel(int x){
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            // this.x refers to the member variable of the enclosing type
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
            // Refer to member variables that enclose larger scopes by the class name to which they belong.
            // OuterClassName.this.x
        }
    }

    public static void main(String[] args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
