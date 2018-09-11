public class OutArgs {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
			System.out.printf("Argument[%d]: %s\n", i, args[i]);
	}
}

