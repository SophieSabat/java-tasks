package task_3_1;

public enum  ClothingSize {
    XXS(38),
    XS(40),
    S(42),
    M(44),
    L(46);

    int euroSize;

    ClothingSize() {
    }

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public void getDescription() {
        System.out.println("Size: " + euroSize);
    }

    @Override
    public String toString() {
        return "task_3_1.ClothingSize{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }
}
