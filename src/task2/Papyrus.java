package task2;

public class Papyrus {
    private int height;
    private int width;

    public Papyrus() {
    }

    public Papyrus(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
