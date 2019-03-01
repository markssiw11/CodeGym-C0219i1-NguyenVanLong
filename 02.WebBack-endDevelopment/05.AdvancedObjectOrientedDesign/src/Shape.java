public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "green";
        filled = true;

    }

    public Shape(String color, boolean filed) {
        this.color = color;
        this.filled = filed;
    }

    String getColor() {

        return this.color;
    }

    boolean isFilled() {

        return this.filled;
    }

    void setColor(String color) {

        this.color = color;
    }

    void setFiled(boolean filedled) {

        this.filled = filled;
    }

    @Override
    public String toString() {
        return "a shape with color of " + color + (isFilled() ? " filled" : " not filled");
    }

}

