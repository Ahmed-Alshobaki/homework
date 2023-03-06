public class fan {
   final int SLOW =1;
   final int MEDIUM=2;
  final   int FAST =3;
    private int speed =SLOW;



    private boolean  specifiesWhetherTheFan=false;
    private double radius =5;
    private String color ="blue";



    public String FanMode() {
        if (specifiesWhetherTheFan==true){
       return "fan{" +
                "speed=" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' +", fan is='"+specifiesWhetherTheFan+
                '}';}else{return"fan{" +

                " radius=" + radius +
                ", color='" + color + '\''+ ", fan is='"+specifiesWhetherTheFan+
                '}'; }

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSpecifiesWhetherTheFan() {
        return specifiesWhetherTheFan;
    }

    public void setSpecifiesWhetherTheFan(boolean specifiesWhetherTheFan) {
        this.specifiesWhetherTheFan = specifiesWhetherTheFan;
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
