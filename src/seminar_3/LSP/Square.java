package seminar_3.LSP;

public class Square extends QuadRangle {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int area() {
        return this.length * this.length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
