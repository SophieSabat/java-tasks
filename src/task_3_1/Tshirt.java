package task_3_1;

public class Tshirt extends Clothes implements WomensClothes, MensClothes {
    public Tshirt() {
    }

    public Tshirt(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressAMan() {
        System.out.println("The man is wearing a size " + this.getSize().euroSize + " t-shirt");
    }

    @Override
    public void toDressAWoman() {
        System.out.println("The woman is wearing a size " + this.getSize().euroSize + " t-shirt");
    }
}
