public class Wallet {
    private String type;
    private String color;
    private int sum;


    public Wallet(){
    }

    public Wallet(String type, String color, int sum) {
        this.type = type;
        this.color = color;
        this.sum = sum;
    }


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    public int getSum() {
        return sum;
    }


    @Override
    public String toString() {
        return "Wallet{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", sum=" + sum +
                '}';
    }
}
