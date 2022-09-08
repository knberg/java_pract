public class Shape {

    private String type;
    private String color;
    private int id;
    static int count = 0;

    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
        this.id = ++count;
    }

    public Shape(String type) {
        this.type = type;
        this.color = "none";
        this.id = ++count;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "id: " + id + ", type: " + type + ", color: " + color;
    }

}
