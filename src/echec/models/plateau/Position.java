package echec.models.plateau;


public class Position {

    private int x;
    private int y;
    static final int min = 1;
    static final int max = 8;


    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public boolean equals(Object obj) {
        Position temp = (Position) obj;
        return x == temp.x && y == temp.y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getPosition() {
        return new int[]{getX(), getY()};
    }

    public void setPosition(int x, int y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return ("[x=" + x + " ,y=" + y + "]");
    }

    @Override
    public Position clone() {
        return new Position(this.getX(), this.getY());
    }

    public boolean inBounds() {
        return x >= min && x <= max && y >= min && y <= max;
    }
}
