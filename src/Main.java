public class Main {
    public static void main(String[] args) {
        fan a1 =new fan();
        fan a2 =new fan();
      a1.setRadius(10);
      a1.setColor("yellow");
      a1.setSpeed(3);
      a1.setSpecifiesWhetherTheFan(true);
      a2.setRadius(5);
      a2.setSpeed(2);
      a2.setSpecifiesWhetherTheFan(false);
      fan []fans={a1,a2};
        for (int i=0;i<fans.length;i++){
            System.out.println(fans[i].FanMode());

        }



    }

}