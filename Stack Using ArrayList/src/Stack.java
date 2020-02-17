//interface is a blueprint of methods that ur gonna use in your actual class
//extends (is like polymorphism) it bring the methods for its daddy class
//implements is for an interface, which means the class will use it from the interface
public interface Stack<E> extends Iterable<E> {
    public E pop();
    public void push(E data);
}
