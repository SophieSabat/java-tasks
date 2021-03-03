package task2;

public class Comics extends Book {
    private int countOfPages;

    public Comics() {
    }

    public Comics(int height, int width, String title, int year, String color, int countOfPages) {
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
        return "Comics{" +
                "countOfPages=" + countOfPages +
                "} " + super.toString();
    }
}
