import java.util.EmptyStackException;

public class Stack {
    // Array for the foundation
    private final int[] array;
    private int pointer;
    private final int SIZE;
    
    public Stack(int size) {
        this.SIZE = size;
        this.array = new int[size];
        // Set it to a value less than 0 to indicate an empty stack
        this.pointer = -1;
    }

    public boolean isEmpty() {
        // If pointer is less than 0,
        // it is not pointing to an element in the stack
        return this.pointer < 0;
    }

    public boolean push(int element) throws StackOverflowError {
        // Check if the stack is full
        if(++pointer <= (SIZE - 1)) {
            // Add the element
            this.array[pointer] = element;
            return true;
        }
        // Throw a Stack overflow exception
        throw new StackOverflowError();
    }

    public int pop() throws EmptyStackException {
        // Check if the array is empty
        if(pointer >= 0) {
            // Return the top element
            return this.array[pointer--];
        }
        // throw a empty stack exception
        throw new EmptyStackException();
    }

    public int peek() throws EmptyStackException {
        // Check if the array is empty
        if(pointer >= 0) {
            // Return the top element
            return this.array[pointer];
        }
        // throw a empty stack exception
        throw new EmptyStackException();
    }
}