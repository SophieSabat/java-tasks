package task2;

public class Magazine extends Book {
    private int countOfPages;

    public Magazine() {
    }

    public Magazine(int height, int width, String title, int year, String color, int countOfPages) {
        super(height, width, title, year, color);
        this.countOfPages = countOfPages;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "countOfPages=" + countOfPages +
                "} " + super.toString();
    }
}
