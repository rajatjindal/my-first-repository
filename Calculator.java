class Calculator {

	public static void main(String[] args) {
		System.out.println("hello world");
		int result = addTwoNumbers(10, 20);
		int result1 = subTwoNumbers(20, 10);
		int result2 = multiplyTwoNumbers(2, 8);
		int result3 = divideTwoNumbers(8, 2);
		System.out.println(result + "\n" + result1 + "\n" + result2 + "\n" + result3);
	}

	public static int addTwoNumbers(int a, int b) {
		return a + b;
	}

	public static int subTwoNumbers(int a, int b) {
		return a - b;
	}
}
