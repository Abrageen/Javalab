class Hello3
{
	public static void main (String args[])
	{
		int numOne=Integer.parseInt(args[0]);
		int numTwo=Integer.parseInt(args[1]);
		void add(numOne, numTwo) {
			result = numOne + numTwo;
			System.out.println("{numOne} + {numTwo} = {result}");
		}
		void subtract(numOne, numTwo){
			result = numOne - numTwo;
			System.out.println("{numOne} - {numTwo} = {result}");
		}
		void multiply(numOne, numTwo){
			result = numOne * numTwo;
			System.out.println("{numOne} * {numTwo} = {result}");
		}
		void divide(numOne, numTwo){
			result = numOne / numTwo;
			System.out.println("{numOne} / {numTwo} = {result}");
		}
	}
}