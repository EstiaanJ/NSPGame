package depri;

public class Voronoi {


    static double distance(int x1, int x2, int y1, int y2) {
        double d;
        d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)); // Euclidian
        //  d = Math.abs(x1 - x2) + Math.abs(y1 - y2); // Manhattan
        //  d = Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), (1 / p)); // Minkovski
        return d;
    }

    private static double distanceManhattan(int x1, int x2, int y1, int y2){
        double d;
        d = Math.abs(x1 - x2) + Math.abs(y1 - y2); // Manhattan
        return d;
    }

    /*
    private static double distanceMinkovski(int x1, int x2, int y1, int y2){
        double d;
        d = Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), (1 / p));
        return d;
    }
     */
}
