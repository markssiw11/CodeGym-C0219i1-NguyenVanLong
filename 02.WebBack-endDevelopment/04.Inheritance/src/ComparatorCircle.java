public class ComparatorCircle extends Circle implements Comparable<ComparatorCircle>{

    public ComparatorCircle() {

    }
    public ComparatorCircle(double radius) {
        super(radius);
    }
    public ComparatorCircle(double radius, String color, boolean filled) {
        super(radius,color,filled);
    }
    @Override
    public int compareTo(ComparatorCircle o) {
        if(getRadius()> o.getRadius()) {
            return 1;
        } else if( getRadius()<o.getRadius()) {
            return -1;
        } else {
            return 1;
        }
    }
}
