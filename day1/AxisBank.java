package week3.day1;


	public class AxisBank extends Bankinfo{

		@Override
		public void deposit() {
			// TODO Auto-generated method stub
			super.deposit();
			System.out.println("deposite Axis bank");
		}
		
		public static void main(String[] args) {
			
			AxisBank ob = new AxisBank();
			
			ob.deposit();
		}
		

	}

