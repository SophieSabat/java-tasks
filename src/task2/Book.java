package task2;

public class Book extends Papyrus{
    private String title;
    private int year;
    private String color;

    public Book() {
    }

    public Book(int height, int width, String title, int year, String color) {
        super(height, width);
        this.title = title;
        this.year = year;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
