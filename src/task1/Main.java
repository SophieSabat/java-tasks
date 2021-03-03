package task1;

public class Main {
    public static void main(String[] args) {

        Kytopodíbni dolphin = new Kytopodíbni("dolphin", "Ssavtsi", "blue", "ocean", "fish");

        Khyzhi cat = new Khyzhi("cat", "Ssavtsi", "black", "house", "meat");

        Lelekopodíbní stork = new Lelekopodíbní("stork", "Birds", true, "swamp", "white");

        Papuhopodibni cockatoo = new Papuhopodibni("cockatoo", "Birds", true, "jungle", "blue");

        Ssavtsi wolf = new Ssavtsi("wolf", "ssavtsi", "grey", "forest");

        Birds parrot = new Birds("parrot", "bird", true, "junjle");


        Animal[] animals = new Animal[] {
                dolphin,
                cat,
                stork,
                cockatoo,
                wolf,
                parrot,
        };

        Ssavtsi[] ssavtsi = new Ssavtsi[]{
                dolphin,
                cat
        };


        Birds[] birds = new Birds[] {
                stork,
                cockatoo
        };

    }
}
