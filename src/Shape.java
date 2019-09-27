public class Shape {
    private String color = "white";
    private boolean isFilled = true;

    public Shape() {

    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString(){
        return "Shape: color = "+ getColor()
                + ", filled = " + (isFilled()?"filled":"not filled") ;
    }
}
