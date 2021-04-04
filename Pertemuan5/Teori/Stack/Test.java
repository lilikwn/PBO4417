import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        methodStack Test = new methodStack();
        Test.output();
    }
}

class MainStack {
    static Stack<Integer> myStack = new Stack<>();

    static void StackPush() {
        for (int i = 1; i < 5; i++) {
            myStack.push(i);
            System.out.println("Push: " + i);
        }
        System.out.println("stack: " + myStack);
    }
}

class methodStack extends MainStack {
    // HAPUS ELEMENTS DARI BELAKANG
    static void StackPop() {
        Integer elements = (Integer) myStack.pop();
        System.out.println("Pop: " + elements);
        System.out.println("Stack: " + myStack);
    }

    static void StackSet() {
        Integer SetElements = (Integer) myStack.set(1, 5);
        System.out.println("modify index of elements: " + SetElements);
        System.out.println("Stack: " + myStack);
    }

    void output() {
        super.StackPush();
        StackPop();
        StackPop();
        StackSet();
    }
}
