import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> textEditor = new Stack<>();

        textEditor.push("Hello");
        textEditor.push("Hello World");
        textEditor.push("Hello World!");

        System.out.println("Current Text States:");
        System.out.println(textEditor);

        System.out.println("\nUndo Operation:");

        String lastState = textEditor.pop();

        System.out.println("Removed State : " + lastState);

        System.out.println("\nCurrent Text:");

        System.out.println(textEditor.peek());

        System.out.println("\nAll Available States:");

        System.out.println(textEditor);

    }

}