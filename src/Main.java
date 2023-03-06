public class Main {
    public static void main(String[] args) {
        fan a1 =new fan();
        fan a2 =new fan();
      a1.setRadius(10);
      a1.setColor("yellow");
      a1.setSpeed(a1.MEDIUM);
      a1.setSpecifiesWhetherTheFan(true);
      a2.setRadius(5);
      a2.setSpeed(a1.FAST);
      a2.setSpecifiesWhetherTheFan(false);
      fan []fans={a1,a2};
        for (int i=0;i<fans.length;i++){
            System.out.println(fans[i].FanMode());

        }



    }

}