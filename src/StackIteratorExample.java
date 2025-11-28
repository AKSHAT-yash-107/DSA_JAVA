import java.util.*;

public class StackIteratorExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements into the stack
        stack.push("Java");
        stack.push("Spring");
        stack.push("Hibernate");
        stack.push("MySQL");

        // Create iterator
        Iterator<String> iterator = stack.iterator();

        // Print elements using iterator
        System.out.println("Stack elements (bottom to top):");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("top to bottom ");
        ListIterator<String> list = stack.listIterator(stack.size());
        while(list.hasPrevious()){
            System.out.println(list.previous());
        }
    }
}
