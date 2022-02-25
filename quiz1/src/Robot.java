public class Robot {
    int ID;
    int x;
    int y;
    Direction dir;
    enum Direction {
        NORTH, EAST, SOUTH, WEST
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public Robot(int ID) {
        this.ID = ID;
        this.x = 0;
        this.y = 0;
        this.dir = Direction.EAST;
    }

    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }

    public void advance() {
        if (this.dir == Direction.EAST) {
            this.x++;
        }
        if (this.dir == Direction.WEST) {
            this.x--;
        }
        if (this.dir == Direction.NORTH) {
            this.y++;
        }
        if (this.dir == Direction.SOUTH) {
            this.y--;
        }
    }

    public void display() {
        System.out.println("ID=" + this.ID  + " " + "(x, y)=" + "(" + this.x + "," + this.y + ')' + " " + "Direction=" + this.dir);
    }

    public static void main(String[] args) {
        var r = new Robot(0);
        r.setDir(Direction.NORTH);
        r.advance();
        r.display();
        r.setDir(Direction.WEST);
        r.advance();
        r.display();
    }
}
