

public class CommandLineArgs {
public static void main(String[] args) {
	for(String itemString : args) {
		System.err.println(itemString);
	}
}
}
