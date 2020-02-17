public class Main {
    public static void main(String[] args) {
        ALQueue<Integer> q = new ALQueue<Integer>();
        q.enqueue(4);
        q.enqueue(56);
        q.enqueue(444);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
