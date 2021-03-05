package task_3_1;

public class Pants extends Clothes implements WomensClothes, MensClothes {
    public Pants() {
    }

    public Pants(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressAMan() {
        System.out.println("The man is wearing a size " + this.getSize().euroSize + " pants");
    }

    @Override
    public void toDressAWoman() {
        System.out.println("The woman is wearing a size " + this.getSize().euroSize + " pants");
    }
}
