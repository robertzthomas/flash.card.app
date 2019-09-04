import java.util.HashMap;
import java.util.Map;

public class FlashCards {

	public static void main(String[] args) {
		Map<String, String> flashCardMap = new HashMap<String, String>();
		flashCardMap.put("Explain what inheritance is in OOP", "A class can inherit the implementation on a parent- class while also extending / changing parts of it. This allows revise of code when classes have a lot in common");
		flashCardMap.put("what is Java?", "Java is a platform independent, high- level programming language. Java is a collection of objects developed by sun microsystems, used in lots of apps, games and websites.");
		flashCardMap.put("What are the features in Java", "1. OOP concepts\r\n" + 
				"	- inheritance\r\n" + 
				"	-encapsulation\r\n" + 
				"	-polymorphism\r\n" + 
				"	-abstraction\r\n" + 
				"	2. platform independence\r\n" + 
				"	-works on all platforms and operating systems without further modification.\r\n" + 
				"	3. high performance\r\n" + 
				"	-JIT (just in time) compiler converts bytecode into machine language and JVM(java virtual machine) starts the execution\r\n" + 
				"");
		flashCardMap.put("What are the java IDE’s" , "eclipse and NetBeans");
		flashCardMap.put("What is the difference between local and instance variables", "-local- defined in method and scope. Exists within the method itself\r\n" + 
				"	-instance- defined inside class and outside the method. Scope of the variables exist throughout the class. \r\n" + 
				"");
		flashCardMap.put("What is a class? What is a Variable? What is a Method?", "Class- template or blueprint used to create objects and define data types\r\n" + 
				"	Variable- piece of memory containing data type and data value\r\n" + 
				"	Method- collection of statements grouped together to perform an operation\r\n" + 
				"");
		flashCardMap.put("What is an object in java?", "combination of data that has a state and behavior. State is stored in fields (variables) and methods (functions) control the objects behavior");
		flashCardMap.put("what is encapsulation", "maintains code and protects it from others (private)");
		flashCardMap.put("What is polymorphism?", "“many forms” single object can refer to super- class or parent- class of subclass");
		flashCardMap.put(".What are the advantages of Java", "java is a Secure, fast, reliable, platform independent programming language");
		flashCardMap.put(". what is JVM? JRE? JDK?", "-JVM- (java virtual machine) runtime environment for codes\r\n" + 
				"	-JRE- (Java Runtime Environment) file collection needed during JVM run time\r\n" + 
				"	-JDK-(Java development kit) contains JRE with necessary developer tools\r\n" + 
				"");
		flashCardMap.put("What are the uses of looping in java?", "To iterate over, or block a statement.");
		flashCardMap.put("what is WORA or WORE?", "Write once read everywhere. This lets a language be ran everywhere. Java does so by using byte code. (A midway between machine code and source code) causing it to not be platform- specific.");
		flashCardMap.put("what is the function of class loader?", "A class loader is used to load class files before running java");
		flashCardMap.put("What are static methods and static variables?" , "Static means it is shared by all objects in a class");
		flashCardMap.put("what is the difference between object- oriented vs object-based programming?", "object oriented programming languages follow all concepts of an OOP. It does not have in- built subjects, while object-based programming languages have built in subjects and do not follow all the OOP concepts");
		flashCardMap.put("how would you use “.this” keyword?", "-.this would be used to refer to current object, invoke current class, method or constructor. It can also pass as an argument in methods and constructors");
		flashCardMap.put(". what is the function of a constructor?", "it can be used to initialize the state of any object when you’re creating a new object with a new keyword, a default constructor is invoked. It must have a name similar to the class name. ");
		
	}

}
