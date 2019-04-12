public class AdapterMain {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        SquarePeg squarePeg = new SquarePeg(2);
        RoundPeg roundPeg = new SquarePegAdapter(squarePeg);
        System.out.println(roundHole.fits(roundPeg));
    }
}
