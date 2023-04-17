package makingpc;

import jdk.jfr.Description;

public class MainClass {
    public static void main(String[] args) {


        PCclass pc1 = new PCclass (new Case("Windows xp",
                "Microsoft","HP2",
                new Dimension(200,200,100)),
                new MotherBoard("Sony23","Sony",
                        2,4,"sony-bios"),
                new Monitor(50,50,24,"HP"));

        pc1.description();
        pc1.powerUp();










    }
}
