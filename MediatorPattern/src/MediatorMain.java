
public class MediatorMain {

	public static void main(String[] args) {
		ChatMediator mediator = new ConcreteChatMediator();
		User user1 = new ConcreteUser(mediator, "A");
		User user2 = new ConcreteUser(mediator, "B");
		User user3 = new ConcreteUser(mediator, "C");
		User user4 = new ConcreteUser(mediator, "D");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hi All");
                user2.send("hello guys");

	}

}