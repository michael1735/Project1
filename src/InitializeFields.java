public class InitializeFields {
    /*
    �����Ҫ�߼���field initialization(forѭ���������, error handling)
    private boolean full = true;
    ����̫����
    instance variables: initialization����д�ڹ�������
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
