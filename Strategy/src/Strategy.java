
public class Strategy {

    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new SubtractOperation());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new MultiplyOperation());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context = new Context(new DivideOperation());
        try{
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero Exception");
        }
    }

}
