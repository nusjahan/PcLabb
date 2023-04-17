package makingpc;

public class Resolution{

    private int width;
    private int height;

    public Resolution(int height, int width, int modelNumber, String manufacturerName) {
        this.height= height;
        this.width=width;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "ResolutionClass{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }



}
