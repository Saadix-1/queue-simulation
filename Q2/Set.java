

public class Set {

    private static final String str = System.getProperty("line.separator");

    // Tableau de caissiers
    private Cashier[] set;

    // Constructeur
    public Set(int nbr) {
        if (nbr < 1) {
            throw new IllegalArgumentException(Integer.toString(nbr));
        }

        set = new Cashier[nbr]; // Alloue le tableau

        // Initialise chaque caissier dans le tableau
        for (int i = 0; i < nbr; i++) {
            set[i] = new Cashier();
        }
    }

    // Ajouter un client à la file la plus courte
    public void add(Client client) {
        int indexMin = 0;
        int tailleMin = set[0].getQueueSize();

        for (int i = 1; i < set.length; i++) {
            if (set[i].getQueueSize() < tailleMin) {
                indexMin = i;
                tailleMin = set[i].getQueueSize();
            }
        }

        set[indexMin].add(client);
    }

    // Chaque caissier traite un client à ce moment donné
    public void servedClients(int currentTime) {
        for (Cashier c : set) {
            c.servedClients(currentTime);
        }
    }

    // Affiche les statistiques de chaque file
    public String toString() {
        StringBuffer out = new StringBuffer();

        for (int i = 0; i < set.length; i++) {
            out.append("LINE " + i + " :" + str);
            out.append(set[i]);
            out.append(str);
        }

        return out.toString();
    }
}
