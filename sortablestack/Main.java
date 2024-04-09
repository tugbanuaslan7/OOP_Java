public class Main {
    public static void main(String[] args) throws Exception {
        SortableStack<Integer> stack = new SortableStack<Integer>();
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(1);
        stack.push(2);
        System.out.println("Before sorting:");
        System.out.println(stack.toString());
        stack.sort();
        System.out.println("After sorting:");
        System.out.println(stack.toString());
        SortableStack<Process> stack1 = new SortableStack<Process>();
        stack1.push(new Process(123214, "GoogleChrome", 3));
        stack1.push(new Process(12324, "VSCode", 3));
        stack1.push(new Process(982, "Edge", 2));
        stack1.push(new Process(321, "Java", 1));
        stack1.push(new Process(23, "MsOffice", 4));
        System.out.println("Before sorting:");
        System.out.println(stack1.toString());
        stack1.sort();
        System.out.println("After sorting:");
        System.out.println(stack1.toString());
        }
    
}
