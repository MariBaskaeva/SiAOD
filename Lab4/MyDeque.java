import java.io. *;
import java.util.*;
import java.lang. *;

public class MyDeque<T>{
	private LinkedList<T> deque = new LinkedList<T>();

	public void addFirst(T e){
		deque.addFirst(e);
	}

	public void addLast(T e){
		deque.addLast(e);
	}

	public T getFirst(){
		return deque.getFirst();
	}

	public T getLast(){
		return deque.getLast();
	}

	public T removeFirst(){
		return deque.removeFirst();
	}

	public T removeLast(){
		return deque.removeLast();
	}

	public int size(){
		return deque.size();
	}

	public String toString(){
		return deque.toString();
	}

	public boolean isEmpty(){
		if(deque.size() == 0)
			return true;
		return false;
	}
}