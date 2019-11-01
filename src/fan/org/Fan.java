package fan.org;

public class Fan {
    private final int SLOW =1, MEDIUM =2, FAST = 3;
    private int speed = SLOW;
    private boolean On = false;
    private  double radius = 5.0;
    private String color = "Blue";

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this. radius = radius;
        this.color = color;
        this.On = on;
    }
    public final int getSLOW() {
        return SLOW;
    }
    public final int getMEDIUM() {
        return MEDIUM;
    }
    public final int getFAST() {
        return FAST;
    }
    private int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public void setOn(boolean newStaus) {
        this.On = newStaus;
    }

    public boolean isOn() {
        return On;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    @Override
    public String toString() {
        if(On) {
            return "Fan is on " + "speed is: " + getSpeed() + "radius is: " + getRadius() + "clolor is: " + getColor();
        } else {
            return "Fan is off " + "color is:" + getColor()+ "radius is: "+ getRadius();
        }
    }
}
