import java.util.*;

abstract class Pizza
{

    String description = "";

    String getDescription()
    {
        return description;
    }

    public abstract double cost();
}

abstract class Toppings extends Pizza
{
    public abstract String getDescription();
}


class ChickenBBQ extends Pizza
{

    public ChickenBBQ()
    {
        description = "Barbecue Chicken Pizza";
    }

    @Override
    public double cost()
    {
        return 780;
    }
}

class Hawaiian extends Pizza
{

    public Hawaiian()
    {
        description = "Hawaiian Pizza";
    }

    @Override
    public double cost()
    {
        return 800;
    }
}

class Exotica extends Pizza
{

    public Exotica()
    {
        description = "Exotica Pizza";
    }

    @Override
    public double cost()
    {
        return 620;
    }
}

class FourSeason extends Pizza
{

    public FourSeason()
    {
        description = "Four Season Pizza";
    }

    @Override
    public double cost()
    {
        return 770;
    }
}

class ExtraCheese extends Toppings
{

    Pizza pizza;

    public ExtraCheese(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", Extra cheese";
    }

    @Override
    public double cost()
    {
        return 280 + pizza.cost();
    }
}
class Sausage extends Toppings
{

    Pizza pizza;

    public Sausage(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", Sausage";
    }

    @Override
    public double cost()
    {
        return 210 + pizza.cost();
    }
}
class BabyCorn extends Toppings
{

    Pizza pizza;

    public BabyCorn(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", Baby Corn";
    }

    @Override
    public double cost()
    {
        return 180 + pizza.cost();
    }
}
class Salami extends Toppings
{

    Pizza pizza;

    public Salami(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", Salami";
    }

    @Override
    public double cost()
    {
        return 180 + pizza.cost();
    }
}
class Meatball extends Toppings
{

    Pizza pizza;

    public Meatball(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", Meatball";
    }

    @Override
    public double cost()
    {
        return 220 + pizza.cost();
    }
}
class Mushrooms extends Toppings
{

    Pizza pizza;

    public Mushrooms(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double cost()
    {
        return 120 + pizza.cost();
    }
}
class BlackOlives extends Toppings
{

    Pizza pizza;

    public BlackOlives(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", Black Olives";
    }

    @Override
    public double cost()
    {
        return 80 + pizza.cost();
    }
}
class Bacon extends Toppings
{

    Pizza pizza;

    public Bacon(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + ", Bacon";
    }

    @Override
    public double cost()
    {
        return 250 + pizza.cost();
    }
}


public class Decorator
{
    public static void main(String[] args)
    {
        System.out.println("Select Your Preferred Pizza:");
        System.out.println("1. Hawaiian");
        System.out.println("2. Exotica");
        System.out.println("3. Four Season");
        System.out.println("4. Chicken BBQ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Pizza myPizza;
        switch (choice)
        {
        case 1:
            myPizza = new Hawaiian();
            break;
        case 2:
            myPizza = new Exotica();
            break;
        case 3:
            myPizza = new FourSeason();
            break;
        default:
            myPizza = new ChickenBBQ();
            break;
        }
        System.out.println("Additional Toppings:");
        System.out.println("1. Extra Cheese.");
        System.out.println("2. Sausage.");
        System.out.println("3. Baby Corn.");
        System.out.println("4. Salami.");
        System.out.println("5. Meatball.");
        System.out.println("6. Mushrooms.");
        System.out.println("7. Black Olive.");
        System.out.println("8. Bacon.");
        System.out.println("Number of Toppings you want:");
        int choices=sc.nextInt();
        System.out.println("Enter your preferred Toppings:");
        for(int i=0; i<choices; i++)
        {
            choice=sc.nextInt();
            if(choice==1)
                myPizza=new ExtraCheese(myPizza);
            if(choice==2)
                myPizza=new Sausage(myPizza);
            if(choice==3)
                myPizza=new BabyCorn(myPizza);
            if(choice==4)
                myPizza=new Salami(myPizza);
            if(choice==5)
                myPizza=new Meatball(myPizza);
            if(choice==6)
                myPizza=new Mushrooms(myPizza);
            if(choice==7)
                myPizza=new BlackOlives(myPizza);
            if(choice==8)
                myPizza=new Bacon(myPizza);
        }
        System.out.println("Your order is: " + myPizza.getDescription()
                           + "\nAnd it costs " + myPizza.cost()  + " taka");

    }

}