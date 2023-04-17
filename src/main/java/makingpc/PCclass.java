package makingpc;

public class PCclass  {
    private Case theCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PCclass(Case theCase, MotherBoard motherBoard, Monitor monitor) {
        this.theCase = theCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    private void drawLogo(){
        monitor.drawPixel(10,10,"Brown");
    }

    public void description(){
        System.out.println("Welcome to worst but below is the " +
                "description of the pc on sale today\n" +
        monitor.toString() + "\n" +
                theCase.toString() + "\n" +
                motherBoard.toString());
    }

    public void powerUp(){
    theCase.pressPowerButton(); drawLogo();
    motherBoard.loadProgram("PhotoShop");
    }

    @Override
    public String toString() {
        return "PCclass{" +
                "theCase=" + theCase +
                ", motherBoard=" + motherBoard +
                ", monitor=" + monitor +
                '}';
    }
}
