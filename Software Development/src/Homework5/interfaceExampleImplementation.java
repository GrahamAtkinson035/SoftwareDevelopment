package Homework5;

public class interfaceExampleImplementation implements interfaceExample{

	public int sum() {
		return firstnum + secondnum + thirdnum;
	}

	public int average() {
		return (sum()/3);
	}

}
