
public class Client {

   // Class variables  
  private static final int MAX_ITEMS = 25;

    // Instance variables
    private int arriveTime;
    private int Items;
    private int initialItems;

    // Constructor
    public Client( int arriveTime ) {
        this.arriveTime = arriveTime;
        Items =  (int) ( ( MAX_ITEMS - 1 ) * Math.random() ) + 1;
        initialItems = Items;
    }

    // Instance methods
    public int getArriveTime() {
        return arriveTime;
    }

    public int getItems() {
        return Items;
    }

    public int getItemsDone() {
       return initialItems - Items;
    }

    public void serve() {
        Items--;
    }
}
