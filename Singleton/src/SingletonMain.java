public class SingletonMain {
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      SingleObject object = SingleObject.getInstance();
      object.showMessage();
      
      try{
          object = new SingleObject();
      }
      catch(Exception e){
          System.out.println("Already Connected to Database, Aborting...");
      }
   }
}