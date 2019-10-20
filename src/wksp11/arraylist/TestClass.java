package wksp11.arraylist;

public class TestClass {
    public static String generateRandomString(int size) {
        char[] chars = new char[size];
        for (int i = 0; i < size; i++) {
            chars[i] = (char) ((int) (Math.random() * 25) + 'a');
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < 20; i++) {
           String item = i + ": " + generateRandomString(12);
           queue.push(item);
           stack.push(item);
        }
        System.out.println("---- print queue ----");
        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
        System.out.println("---- print stack ----");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
