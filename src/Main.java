import Exceptions.StackIsEmpty;
import Exceptions.StackIsFull;

public class Main {

    public static void main(String[] args){
        Stack stack = new Stack(10);

        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.pop();
            System.out.println("The size of the stack is: " + stack.size());
            System.out.println("The element on the top is: " + stack.peek());
            System.out.println(stack);
        }
        catch (StackIsEmpty | StackIsFull e){
            System.out.println(e);
        }



    }
}
