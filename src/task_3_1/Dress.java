package task_3_1;

public class Dress extends Clothes implements WomensClothes {

    public Dress() {
    }

    public Dress(ClothingSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressAWoman() {
        System.out.println("The woman is wearing a size " + this.getSize().euroSize + " dress");
    }
}
