package ca.ubc.ece.cpen221.mp4.operator;

public class Subtraction implements BinaryOperator{
	public double apply(double a, double b) {
		return a - b;
	}
	public String toString() {
		return "-";
	}
}
