package exercise.chapter_45;

public class Point <T, V>{

    private T x;
    private V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    public Double calculateDistance(){
        // (x^2 + y^2) ^ 1/2
        if ( ! (this.x instanceof Number) ) {
            return null;
        }
        if ( ! (this.y instanceof Number) ) {
            return null;
        }
        double num1 = ((Number) this.x).doubleValue();
        double num2 = ((Number) this.y).doubleValue();
        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
    }
}
