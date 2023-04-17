package makingpc;

public class Monitor extends Resolution{


   // private Resolution resolution;
    private int modelNumber;
    private String manufacturerName;



    public Monitor(int height, int width, int modelNumber, String manufacturerName) {
        super(height,width,modelNumber,manufacturerName);
        this.setHeight(height);
        this.setWidth(width);
        this.modelNumber = modelNumber;
        this.manufacturerName = manufacturerName;

    }

    public void drawPixel(int x, int y, String color){
        System.out.println( "Drawing pixel at" + " " + x + "," +" "+ y +" "+
                "in color" + " " + color );
    }


    @Override
    public String toString() {
        return "MonitorClass{" +
                ", model='" + modelNumber + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }



}
