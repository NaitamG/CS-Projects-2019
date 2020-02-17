import java.util.ArrayList;
import java.util.Iterator;
//iterable is of those api java classes which allows you to look through each element of you linked list or stack.
//iterable allows you to do the same thing a for loop would for looking through each of an array's elements.
//so for example, let's say your linked list is called animals, you can look through it my saying animals.iter
class ALStack<E> implements Stack<E> {
    ArrayList<E> list = new ArrayList<E>();

    public void push(E data) {
        list.add(data);
    }
    public E pop() {
        if(list.size() == 0) {
            System.out.println("Stack is Empty.");
        }
        return list.remove(list.size()-1);
    }
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}
