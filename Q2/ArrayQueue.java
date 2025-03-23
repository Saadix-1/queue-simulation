

public class ArrayQueue<E> implements Queue<E> {
       
    // Class variables
    private static final int MAX_QUEUE_SIZE = 10000;

    // Instance variables
    private E[] elems; // elements of this queue
    private int front, rear, size;

    @SuppressWarnings( "unchecked" )

    public ArrayQueue() {
        elems = (E []) new Object[MAX_QUEUE_SIZE];
        front =  0;
        rear = -1;
        size = 0;
    }

    // Instance methods
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_QUEUE_SIZE;
    }
    
    public void enqueue( E elem ) {

        // pre-condition: 
        if ( rear == ( MAX_QUEUE_SIZE -1 ) ) {    
            int j=0;
            for ( int i=front; i<=rear; i++ ) {
                elems[ j++ ] = elems[ i ];
            }

            front = 0;
            rear = size - 1;
        }

        elems[ ++rear ] = elem;
        size++;
    }

    public E dequeue() {

        // pre-condition: 
        E save = elems[ front ];
        elems[ front ] = null; // scrubbing the memory!

        front++;
        size--;

        return save;
    }
}
