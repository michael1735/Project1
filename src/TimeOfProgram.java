public class TimeOfProgram {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis(); //��ȡ��ʼʱ��

        //Ҫ��ĳ���򷽷�

        long endTime=System.currentTimeMillis(); //��ȡ����ʱ��

        System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ms");
// ����main����
    }
}
