public class Context {
   private OperationStrategy opStrategy;

   public Context(OperationStrategy opStrategy){
      this.opStrategy = opStrategy;
   }

   public int executeStrategy(int a, int b){
      return opStrategy.doOperation(a, b);
   }
}