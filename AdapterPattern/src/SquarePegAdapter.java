
import static java.lang.Math.sqrt;

public class SquarePegAdapter extends RoundPeg{
    SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super();
        this.squarePeg = squarePeg;

    }

    public int getRadius(){
        return (int) (squarePeg.getWidth()*sqrt(2)/2);
    }
}
