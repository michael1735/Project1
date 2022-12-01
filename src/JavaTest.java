public class JavaTest {
    public static void main(String[] args) {
        int index = 0;
        int timeOfExecution = 0;
        do {
            index++;
            timeOfExecution++;
        } while (index < 10);

        System.out.println("The loop has been executed for " + timeOfExecution + " times.");
        System.out.println("index: " + index);
    }
}
