package task_3_1;

import java.util.ArrayList;

public class Atelier {
    private ArrayList<Clothes> clothes;

    public Atelier() {
    }

    public Atelier(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public ArrayList<Clothes> getClothes() {
        return clothes;
    }

    public void setClothes(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public void mensChoise(ArrayList<Clothes> clothes) {
        for (Clothes c : clothes) {
            if (c instanceof MensClothes) {
                System.out.println("Men`s choise: " + c);
            }
        }
    }

    public void womensChoise(ArrayList<Clothes> clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomensClothes) {
                System.out.println("Wonen`s choise: " + c);
            }
        }
    }


    @Override
    public String toString() {
        return "task_3_1.Atelier{" +
                "clothes=" + clothes +
                '}';
    }
}
