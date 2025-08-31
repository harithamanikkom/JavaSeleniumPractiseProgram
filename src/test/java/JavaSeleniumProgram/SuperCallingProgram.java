package JavaSeleniumProgram;

class Student {

	Student() {
		System.out.println("Parent Constructor");
	}
}

class SuperCallingProgram extends Student {

	SuperCallingProgram() {
		super();
		System.out.println("Subclass Constructor");
	}

	public static void main(String[] args) {

		SuperCallingProgram s1 = new SuperCallingProgram();

	}

}