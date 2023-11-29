public class StackQueueDriver {

    public static void main(String[] args) {
        StackQueue<Integer> i  = new StackQueue<>();
        i.enqueue(6);
        i.enqueue(7);
        i.enqueue(8);
        System.out.println(i.peek());
        System.out.println(i.dequeue());
        System.out.println(i.size());
        System.out.println(i.isEmpty());
        i.dequeue();
        i.dequeue();
        System.out.println(i.isEmpty());

    }
}
