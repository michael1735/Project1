public class InitializeFields {
    /*
    解决需要逻辑的field initialization(for循环填充数组, error handling)
    private boolean full = true;
    这种太简单了
    instance variables: initialization可以写在构造器里
    class variables: static blocks
     */
    // static blocks
    static {
        // whatever code needed for initialization goes here
    }
    // alternative for static blocks: private static method
    public static int myVar = initializeClassVar();

    private static int initializeClassVar(){
        // initialization code goes here
        int a = 1;
        return a;
    }
    // ------------------------------------------
    /*
    initialize instance members:
    1. constructor
    2. initializer block
    3. final methods
     */

    // initializer blocks
    {
        // code for initialization...
        /*
        compiler copies initializer blocks into every constructor
        can be used to share a block of code between constructors
         */
    }


}
