
public class Cashier {

    private static final String str = System.getProperty( "line.separator" );

    // Instance variables
    private Queue<Client> queue;
    private Client currentClient;

    private int ClientTime;
    private int ClientsServed;
    private int ItemsDone;
   
    //Constructor
    public Cashier(){
        // VOTRE CODE
            queue = new ArrayQueue<Client>(); 
            currentClient = null;             
            ClientTime = 0;
            ClientsServed = 0;
            ItemsDone = 0;
        }
   
    // Instance methods
    public void add( Client client ) {
        // VOTRE CODE
        queue.enqueue(client);

    }

    public int getQueueSize() {
        return queue.size();
    }

    public void servedClients(int currentTime) {
        // If currentClient is not null or the queue is not empty!
        // VOTRE 1er MORCEAU DU CODE

        //serve
        // VOTRE 2eme MORCEAU DU CODE


        // If current client is served
        // VOTRE 3eme MORCEAU DU CODE

        if (currentClient == null && queue.isEmpty()) {
            return;
        }

        if (currentClient == null) {
            currentClient = queue.dequeue(); 
            int attente = currentTime - currentClient.getArriveTime(); 
            ClientTime += attente; 
        }
        currentClient.serve();

        if (currentClient.getItems() == 0) {
            ClientsServed++; 
            ItemsDone += currentClient.getItemsDone(); 
            currentClient = null; 
        }
    }

    public int getClientTime() {      
        return ClientTime;      
    }    

    public int getItemsDone() {      
        return ItemsDone;
    }    

    public int getClientsServed() {
        return ClientsServed;    
    }


    public String toString() {
        StringBuffer out = new StringBuffer();

        out.append("The total number of clients served is ");
        out.append(ClientsServed);
        out.append(str);

        out.append("The average number of items per client was ");
        out.append(ClientsServed > 0 ? ItemsDone / ClientsServed : 0);
        out.append(str);

        out.append("The average time (in seconds) was ");
        out.append(ClientsServed > 0 ? ClientTime / ClientsServed : 0);
        out.append(str);

        return out.toString();
    }

}
