class Calculator {

	public static void main(String[] args) {
		System.out.println("hello world");
		int result = addTwoNumbers(10, 20);
		int result1 = subTwoNumbers(20, 10);
		int product = productTwoNumbers(10,30);
		System.out.println(result + "\n" + result1 + "\n" + product);
	}

	public static int addTwoNumbers(int a, int b) {
		return a + b;
	}

	public static int subTwoNumbers(int a, int b) {
		return a - b;
	}
	public static int productTwoNumbers(int a, int b) {
		return a * b;
	}
}
