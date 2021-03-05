package task_3_1;

public class Tie extends Clothes implements MensClothes {
    public Tie() {
    }

    public Tie(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressAMan() {
        System.out.println("The man is wearing a size " + this.getSize().euroSize + " tie");
    }
}
