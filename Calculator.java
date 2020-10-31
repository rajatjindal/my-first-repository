class Calculator {

	public static void main(String[] args) {
		System.out.println("hello world");
		int result = addTwoNumbers(10, 20);
		int result1 = subTwoNumbers(20, 10);
		int result2 = divideTwoNumbers(20, 5);
		int result3 = modulusTwoNumbers(20, 5);
		int result4 = multiplyTwoNumbers(20, 5);
		System.out.println(result + "\n" + result1 + "\n" + result2 + "\n" + result3 + "\n" + result4);
	}

	public static int addTwoNumbers(int a, int b) {
		return a + b;
	}

	public static int subTwoNumbers(int a, int b) {
		return a - b;
	}

	public static int divideTwoNumbers(int a, int b) {
		return a / b;
	}

	public static int modulusTwoNumbers(int a, int b) {
		return a % b;
	}

	public static int multiplyTwoNumbers(int a, int b) {
		return a * b;
	}
}
