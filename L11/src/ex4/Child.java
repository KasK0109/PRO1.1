package ex4;

/**
 * Write a description of class Barn here.
 */
public class Child {
	private int age;
	private boolean boy; // true if the child is a boy
	private double[] weight;

	public Child(int age, boolean boy, double[] weight) {
		this.age = age;
		this.boy = boy;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBoy() {
		return boy;
	}

	public void setBoy(boolean boy) {
		this.boy = boy;
	}

	public double getWeight(int age) {
		return weight[age];
	}

	public void setWeight(double[] weight) {
		this.weight = weight;
	}

	public double getIncrease() {
		double increase = 0;
		for (int i = 1; i < weight.length; i++)  {
			double tempInc = weight[i] - weight[i - 1];
			if (tempInc > increase) {
				increase = tempInc;
			}
		}
		return increase;
	}
}
