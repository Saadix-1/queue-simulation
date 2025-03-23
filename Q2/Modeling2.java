

public class Modeling2 {

    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int ITER = 5;

    private static final double PROBABILITY_NEW_CLIENT = 0.125;

    private static final int FAST_MAX_ITEMS = 12;

    // Instance variables
    private Set fast;
    private Set normal;

    private int Duration;

    // Constructor
    public Modeling2( int duration ) {

        Duration = duration;

        fast = new Set( 1 );
        normal = new Set( 2 );
    }

    public void test() {
        int currentTime = 0;

        while (currentTime < Duration) {

            if (Math.random() < PROBABILITY_NEW_CLIENT) {
                Client newClient = new Client(currentTime);

                if (newClient.getItems() <= FAST_MAX_ITEMS) {
                    fast.add(newClient);
                }
                else {
                    normal.add(newClient);
                }
            }

            fast.servedClients(currentTime);
            normal.servedClients(currentTime);

            currentTime += ITER;
        }


        display();
    }

    private void display() {

        System.out.println( "The duration of modeling was " + Duration + " seconds " );

        System.out.println( "FAST LINES :" );
        System.out.println( fast );

        System.out.println( "NORMAL LINES :" );
        System.out.println( normal );
    }

    public static void main(String[] args) {

        int duration = SECONDS_PER_MINUTE * MINUTES_PER_HOUR * 8;
        Modeling2 model = new Modeling2( duration );
        model.test();
    }
}
