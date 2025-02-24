package game;

import java.util.Comparator;

class GhostFitnessComparator implements Comparator<PacmanGame> {
    @Override
    public int compare(PacmanGame x, PacmanGame y) {
        /* compare logic goes here
           return a negative number when o1 < o2
                  a positive number when o1 > o2
                  0 when o1 == o2
        */

        double xAvg = x.getBestGhost().fitness;
        double yAvg = y.getBestGhost().fitness;

        if (xAvg < yAvg) return -1;
        else if (xAvg > yAvg) return 1;
        return 0;
    }
}
