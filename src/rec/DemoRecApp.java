package rec;

import java.util.HashSet;
import java.util.Set;

public class DemoRecApp {
    public static void main(String[] args) {

        Ort graz = new Ort("graz");
        Ort wien = new Ort("wien");
        Ort marburg = new Ort("marburg");
        Ort linz = new Ort("linz");

        graz.addNachbar(marburg);
        graz.addNachbar(wien);

        wien.addNachbar(linz);
        wien.addNachbar(graz);

        linz.addNachbar(graz);
        linz.addNachbar(wien);

        marburg.addNachbar(graz);

        System.out.println("Has Circle from Graz: " + hasCircle(graz));
        System.out.println("Hops Graz -> Linz: " + countHops(graz, linz));
    }

    private static boolean hasCircle(Ort start) {
        Set<Ort> visited = new HashSet<>();
        return hasCircleRecursive(start, visited);
    }

    private static boolean hasCircleRecursive(Ort current, Set<Ort> visited) {

        if (visited.contains(current)) {
            return true; // Kreis gefunden
        }

        visited.add(current);

        for (Ort nachbar : current.getNachbarn()) {
            if (hasCircleRecursive(nachbar, visited)) {
                return true;
            }
        }

        return false;
    }

    private static int countHops(Ort start, Ort ziel) {
        Set<Ort> visited = new HashSet<>();
        return countHopsRecursive(start, ziel, visited);
    }

    private static int countHopsRecursive(Ort current,
                                          Ort ziel,
                                          Set<Ort> visited) {

        if (current.equals(ziel)) {
            return 0;
        }

        visited.add(current);

        for (Ort nachbar : current.getNachbarn()) {
            if (!visited.contains(nachbar)) {
                int hops = countHopsRecursive(nachbar, ziel, visited);
                if (hops != -1) {
                    return hops + 1; // schrittweise zählen
                }
            }
        }

        return -1; // kein Weg gefunden
    }
}
