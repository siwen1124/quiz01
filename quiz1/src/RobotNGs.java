public class RobotNGs extends Robot{
    public RobotNGs(int ID) {
        super(ID);
    }

    @Override
    public void advance() {
        if (this.dir == Direction.EAST) {
            this.x += 2;
        }
        if (this.dir == Direction.WEST) {
            this.x -= 2;
        }
        if (this.dir == Direction.NORTH) {
            this.y += 2;
        }
        if (this.dir == Direction.SOUTH) {
            this.y -= 2;
        }
    }

    public static void main(String[] args) {
        var r = new RobotNGs(0);
        r.setDir(Direction.NORTH);
        r.advance();
        r.display();
        r.setDir(Direction.WEST);
        r.advance();
        r.display();
    }
}
