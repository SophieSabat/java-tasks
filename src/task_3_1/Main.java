package task_3_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt(ClothingSize.M, 500, "blue");
        tshirt.toDressAWoman();


        Dress dress = new Dress(ClothingSize.XS, 700, "red");
        dress.toDressAWoman();

        Tie tie = new Tie(ClothingSize.L, 200, "grey");
        tie.toDressAMan();

        Pants pants = new Pants(ClothingSize.S, 650, "black");
        pants.toDressAMan();
        pants.toDressAWoman();


        ArrayList<Clothes> clothes = new ArrayList<>();
        clothes.add(dress);
        clothes.add(tshirt);
        clothes.add(tie);
        clothes.add(pants);

        Atelier atelier = new Atelier(clothes);
        atelier.mensChoise(clothes);
        atelier.womensChoise(clothes);
    }
}
