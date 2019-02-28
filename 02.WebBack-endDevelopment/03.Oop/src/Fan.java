public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speech = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speech, boolean on, double radius, String color) {
        this.speech = speech;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "speech: " + this.speech + " color: " + this.color + " radius:" + this.radius + " fan is on";
        } else {
            return "fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.SLOW, true, 10, "yellow");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(Fan.FAST, false, 10, "blue");
        System.out.println(fan2.toString());
    }


    // Getter and Setter
    public int getSpeech() {
        return speech;
    }

    public void setSpeech(int speech) {
        this.speech = speech;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
