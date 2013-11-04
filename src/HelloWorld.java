
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		
		//Using Classes and Objects
		Welcomer welcomer = new Welcomer();
		welcomer.sayHello();
		
		String welcome = "Hello!";
		//Long HandVersion
		//String welcome = new String("Hello!");
		
		char[] chars = {'H','e','l','l','o','!'};
		String s = new String(chars);
		System.out.println(s);  //Hello!
		
		Numbers number = new Numbers();
		number.printPayment();
		

	}
	

}
