package ex4;

public class ChildApp {

	public static void main(String[] args) {

		double[] c1Weight = {1.2,9.3,12.4,17.5,23.2,25.3,28.6,30.4,33.9,35.1,37.3};
		Child c1 = new Child(0, true, c1Weight);// boy 4 years old

		double[] c2Weight = {1.3,9.4,12.5,17.6,23.3,25.4,28.7,30.5,34.0,35.2,37.4};
		Child c2 = new Child(2, false,c2Weight);// girl 2 years old

		System.out.println("Et barn på " + c1.getAge());

		System.out.println(c1.getIncrease());

	}

}
