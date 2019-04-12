
public class RoundHole {
    int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg){
        return roundPeg.getRadius()<=this.radius;
    }
}
