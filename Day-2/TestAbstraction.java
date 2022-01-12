package day2;


	interface Vehicle{
		void mileage();
		void wheels();
	}
	abstract class Cars implements Vehicle{
		public void wheels() {
			System.out.println("Car has 4 wheels");
		}
	}
	class Swift extends Cars{
		public void mileage() {
			System.out.println("Swift mileage is 23");
		}
		
	}
	class Ferrari extends Cars{
		public void mileage() {
			System.out.println("Ferrari mileage is 12");
		}
	}
	public class TestAbstraction {
		public static void main(String[] args) {
			Swift s=new Swift();
			Ferrari f=new Ferrari();
			ui(s);
			ui(f);
			
		}
		public static void ui(Vehicle v) {
			v.mileage();
			v.wheels();
		}

}
