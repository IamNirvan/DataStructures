import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        try {
            System.out.println("Element added: " + stack.push(19));
            System.out.println("Element added: " + stack.push(23));
            System.out.println("Element added: " + stack.push(76));
            System.out.println("Popped item: " + stack.pop());
            System.out.println("Popped item: " + stack.pop());
        } catch(StackOverflowError stackOverflowError) {
            System.err.println("Stack is full...\n\t- " + stackOverflowError);

        } catch (EmptyStackException emptyStackException) {
            System.err.println("Stack is empty...\n\t- " + emptyStackException);
        }
    }
}
