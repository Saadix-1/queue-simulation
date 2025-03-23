
public interface Queue<E> {
     void enqueue( E obj );
     E dequeue();
     boolean isEmpty();
     int size();
}
