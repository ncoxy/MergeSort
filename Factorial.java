public class Factorial{

	public static void main(String[] args) {
		// System.out.println(factIt(5));
		// System.out.println(factRec(5));
		System.out.println(fib(6));
	}

	// //USES LOOPS TO FIND FACTORIAL OF N
	// public static int factIt(int n){
	// 	int total = 1;
	// 	for (int i = n; i>0; i--) {
	// 		total =  total * i;
	// 	}

	// 	return total;
	// }

	// public static int factRec(int n){
	// 	if (n == 1){ //Base case
	// 		return 1;
	// 	}


	// 	return n * factRec(n-1);// Assumption
	// }

	public static int fib(int n){
		if (n == 1 || n == 2){
			return 1;
		}

		return fib(n-1) + fib(n-2);
	}
}