package enum_examples;

public class CalculatorTest {
	
	public enum Calculator{
		ADDITION{
			public Double execute(Double x, Double y) {
				return x + y;
			}
		},
		
		SUBTRACTION{
			public Double execute(Double x, Double y) {
				return x - y;
			}
		},
		
		MULTIPLICATION{
			public Double execute(Double x, Double y) {
				return x * y;
			}
		},
		
		DIVISION{
			public Double execute(Double x, Double y) {
				return x / y;
			}
		};
		
		public abstract Double execute(Double x, Double y);
		
	}
	
	public static void main(String[] args) {
		System.out.println(Calculator.ADDITION.execute(4.0, 2.0));
		System.out.println(Calculator.MULTIPLICATION.execute(4.0, 2.0));
	}

}
