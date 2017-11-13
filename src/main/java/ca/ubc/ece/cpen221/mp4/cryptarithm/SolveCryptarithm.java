package ca.ubc.ece.cpen221.mp4.cryptarithm;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SolveCryptarithm {

	public static void main(String[] args) {
		//scan a line inputed by the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a cryptarithm:");
		String expression = scanner.nextLine();
		scanner.close();
		//split line into strings to pass to array
		String[] cryptos = expression.split(" ");
		try {
			//try to solve cryptarithm 
			Cryptarithm crypto = new Cryptarithm(cryptos);
			List<Map<Character,Integer>> solutions = crypto.solve();
			System.out.println("Found " + solutions.size() + " solution(s):");
			System.out.println(solutions);
		} catch (InvalidCryptarithmException e) {
			System.out.println("Invalid input");
		}catch(NoSolutionException e) {
			System.out.println("No solution for the cryptorithm");
		}
	}
	
}
