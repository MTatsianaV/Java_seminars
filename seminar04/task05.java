package seminar04;

/* 
Реализовать стэк с помощью массива. 
Нужно реализовать методы: size(), empty(), push(), peek(), pop().
 */
public class task05 {
    public static void main(String[] args) {
        ex4();
    }

    static void ex4() {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(3);
        stack.push(4);
        stack.push(74);
        stack.push(23);
        stack.push(11);
        stack.push(54);
        stack.push(76);
        stack.push(2);
        stack.push(99);
        stack.push(17);
        stack.push(5);
        stack.push(71);
        stack.push(88);
        stack.push(16);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());        
    }
}
