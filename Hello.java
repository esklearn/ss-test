class Hello {
	public static void main(String[] args){
		System.out.println("Hello " + args[0] + "!!");
		System.out.println("Hello " + args[0] + "!! - Second time");
		System.out.println("Hello " + args[0] + "!! - Third time");
		System.out.println(greeting(args[0]));
	}


	public static String greeting(String name){
			return "Welcome " + name;
		
		}
}
