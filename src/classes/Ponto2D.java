package classes;

public class Ponto2D {
    private double x;
    private double y;
    public Ponto2D() {
        x = 0.0;
        y = 0.0;
    }
    public double distance (Ponto2D b) {
        return Math.sqrt( (x-b.x)*(x-b.x) + (y-b.y)*(y-b.y) );
    }

}
