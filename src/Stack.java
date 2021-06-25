import Exceptions.StackIsEmpty;
import Exceptions.StackIsFull;

/**
 * Static Implementation of a stack structure with integers.
 * @author Mireia Gasco Agorreta
 * @version 1.0
 */
public class Stack {

    //Attributes
    private int[] stack;  //the stack
    private int top;      //position of the element on the top

    //Constructor

    /**
     * Constructor for the stack.
     * @param maxElem maximum number of elements that will be stored in the stack.
     */
    public Stack(int maxElem){
        this.stack = new int[maxElem];
        this.top = -1;   //the stack is empty
    }

    //Methods

    /**
     * Push method.  Adds a new integer to the top of the stack.
     * @param newInt integer to be added.
     * @throws StackIsFull in case the stack is full.
     */
    public void push(int newInt) throws StackIsFull {
        if (this.top == stack.length) throw new StackIsFull();
        else{
            this.top++;
            this.stack[this.top] = newInt;
        }
    }

    /**
     * Pop method.  Returns and removes the element on the top of the stack.
     * @return the top element of the stack.
     * @throws StackIsEmpty in case the stack is empty.
     */
    public int pop() throws StackIsEmpty {
        if (empty()) throw new StackIsEmpty();
        else {
            this.top--;
            return this.stack[this.top+1];
        }
    }

    /**
     * Empty method.  Indicates if the stack is empty.
     * @return a boolean indicating if the stack is empty.
     */
    public boolean empty(){
        return this.top == -1;
    }

    /**
     * Size method.  Returns the number of elements that contains the stack
     * @return the number of elements that contains the stack
     */
    public int size(){
        return this.top + 1;
    }

    /**
     * Peek method.  Returns the element on the top without removing it.
     * @return the element on the top.
     */
    public int peek() throws StackIsEmpty{
        if (empty()) throw new StackIsEmpty();
        return this.stack[this.top];
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Stack:\n\n");

        for (int i = this.top; i >= 0; i--){
            sb.append("\t|  " + this.stack[i] + "  |\n");
            if (i == 0) sb.append("\t ͞ ͞ ͞ ");
        }
        return sb.toString();
    }
}
