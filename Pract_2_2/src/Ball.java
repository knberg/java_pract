public class Ball {
    private String type;
    private String color;
    private int diameter;

    public Ball() {
        this.type = "Basic";
        this.color = "White";
        this.diameter = 20;
    }

    public Ball(String type, String color, int diameter) {
        this.type = type;
        this.color = color;
        this.diameter = diameter;
    }

    public String getType() {
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public double getVolume() {
        return (Math.pow(diameter, 3) * Math.PI) / 6.0;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String toString() {
        return "type: " + this.type + ", color: " + this.color + ", diameter: " + this.diameter;
    }
}