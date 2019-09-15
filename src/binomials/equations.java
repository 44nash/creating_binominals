package binomials;

import java.util.Arrays;

public class equations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 4;
		// a to the power of b
		// System.out.println(Math.pow(a, b));

		int a2 = 2;
		int b2 = 2;
		// System.out.println(Math.pow(a2, b2));

		// System.out.println("apple" * 2);

		// System.out.println(multString('x', 3));
		// System.out.println(multString('2', 3));
		// System.out.println(factorial(4));
		// String var="hhhkk";
		// System.out.println(var.length());
		// System.out.println(firstPartBi("2x",3));
		// Both work Great
		// binomialExpansionPosX("2x+5", 4);
		// binomialExpansionNegX("2x-5", 5);
		// binomialExpansionPosY("2+5y", 4);
		// binomialExpansionNegY("2-5y", 4);
		
		//System.out.println(binomialExpansionTwoVarPos("2x+5y", 3));
		// System.out.println(find_num("125yyy"));
		// System.out.println(find_Var("125yyy"));
		//System.out.println(binomialExpansionTwoVarNeg("2x-5y", 4));
	}
	
	//Helper functions
	public static String multString(char c, int n) {
		char[] arr = new char[n];
		Arrays.fill(arr, c);
		return new String(arr);
	}

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static int powerChoosek(int powerN, int k) {

		int nfactorial = factorial(powerN);
		int nMinusk = factorial(powerN - k);
		int kfactorial = factorial(k);

		int powChoosek = nfactorial / (nMinusk * kfactorial);
		return powChoosek;
	}

	public static String firstPartBi(String leftMost, int NminusKpower) {
		String num = leftMost.substring(0, 1);
		// System.out.println(num+"yhvhkvbkjvk");

		int numInt = Integer.parseInt(num);
		int numIntTotal = (int) Math.pow(numInt, NminusKpower);
		String totalnum = Integer.toString(numIntTotal);

		char letterVar = leftMost.charAt(1);
		String totalVars = multString(letterVar, NminusKpower);

		return totalnum + totalVars;
	}

	
	//Main Functions
	
	//Only X
	public static String binomialExpansionPosX(String binomial, int power) {
		// String split[]
		String num = binomial.substring(0, 2);
		String numR = binomial.substring(3);
		int numRR = Integer.parseInt(numR);

		System.out.println(num);
		System.out.println(numR);
		System.out.println("----------");
		// num is now a string
		String str = "";
		for (int k = 0; k <= power; k++) {
			int combin = powerChoosek(power, k);
			String leftBi = firstPartBi(num, (power - k));
			String leftBiNum = find_num(leftBi);
			int numRight = (int) Math.pow(numRR, k);
			// System.out.println(combin +" "+leftBi +" "+numRight);
			if(k ==power){
			//int firstVarX = find_Var(leftBi);
			int intNumRight = Integer.parseInt(leftBiNum);
			int total = combin * numRight * intNumRight;
			String varPartofBi = "";
			String totalS = Integer.toString(total);
			System.out.println(totalS + varPartofBi);
			System.out.println("------------------------");

			if (k == power) {
				str = str + totalS + varPartofBi;
				break;
			}
			str = str + totalS + varPartofBi + " + ";
			
			}else{
				int firstVarX = find_Var(leftBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int total = combin * numRight * intNumRight;
				String varPartofBi = leftBi.substring(firstVarX);
				String totalS = Integer.toString(total);
				System.out.println(totalS + varPartofBi);
				System.out.println("------------------------");

				if (k == power) {
					str = str + totalS + varPartofBi;
					break;
				}
				str = str + totalS + varPartofBi + " + ";
			}
			
			
			
			
		}
		System.out.println(str);

		return str;
	}

	public static String binomialExpansionNegX(String binomial, int power) {
		// String split[]
				String num = binomial.substring(0, 2);
				String numR = binomial.substring(3);
				int numRR = Integer.parseInt(numR);

				System.out.println(num);
				System.out.println(numR);
				System.out.println("----------");
				// num is now a string
				String str = "";
				for (int k = 0; k <= power; k++) {
					int combin = powerChoosek(power, k);
					String leftBi = firstPartBi(num, (power - k));
					String leftBiNum = find_num(leftBi);
					int numRight = (int) Math.pow(numRR, k);
					// System.out.println(combin +" "+leftBi +" "+numRight);
					if(k ==power){
					//int firstVarX = find_Var(leftBi);
					int intNumRight = Integer.parseInt(leftBiNum);
					int total = combin * numRight * intNumRight;
					String varPartofBi = "";
					String totalS = Integer.toString(total);
					System.out.println(totalS + varPartofBi);
					System.out.println("------------------------");

					if (k == power) {
					str = str + totalS + varPartofBi;
					break;
				}
				if (k % 2 == 0) {
					str = str + totalS + varPartofBi + " -";
				} else {
			
					str = str + totalS + varPartofBi + " + ";
				}
					
					}else{
						int firstVarX = find_Var(leftBi);
						int intNumRight = Integer.parseInt(leftBiNum);
						int total = combin * numRight * intNumRight;
						String varPartofBi = leftBi.substring(firstVarX);
						String totalS = Integer.toString(total);
						System.out.println(totalS + varPartofBi);
						System.out.println("------------------------");

						if (k == power) {
						str = str + totalS + varPartofBi;
						break;
					}
					if (k % 2 == 0) {
						str = str + totalS + varPartofBi + " -";
					} else {
				
						str = str + totalS + varPartofBi + " + ";
					}
					}
					
					
					
					
				}
				System.out.println(str);

				return str;
	}

	//Only Y
	public static String binomialExpansionPosY(String binomial, int power) {
		// String split[]
		String num = binomial.substring(2);
		String numR = binomial.substring(0,1);
		int numRR = Integer.parseInt(numR);

		System.out.println(num);
		System.out.println(numR);
		System.out.println("----------");
		// num is now a string
		String str = "";
		for (int k = 0; k <= power; k++) {
			int combin = powerChoosek(power, k);
			String leftBi = firstPartBi(num, (power - k));
			String leftBiNum = find_num(leftBi);
			int numRight = (int) Math.pow(numRR, k);
			// System.out.println(combin +" "+leftBi +" "+numRight);
			if(k ==power){
			//int firstVarX = find_Var(leftBi);
			int intNumRight = Integer.parseInt(leftBiNum);
			int total = combin * numRight * intNumRight;
			String varPartofBi = "";
			String totalS = Integer.toString(total);
			System.out.println(totalS + varPartofBi);
			System.out.println("------------------------");

			if (k == power) {
				str = str + totalS + varPartofBi;
				break;
			}
			str = str + totalS + varPartofBi + " + ";
			
			}else{
				int firstVarX = find_Var(leftBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int total = combin * numRight * intNumRight;
				String varPartofBi = leftBi.substring(firstVarX);
				String totalS = Integer.toString(total);
				System.out.println(totalS + varPartofBi);
				System.out.println("------------------------");

				if (k == power) {
					str = str + totalS + varPartofBi;
					break;
				}
				str = str + totalS + varPartofBi + " + ";
			}
			
			
			
			
		}
		System.out.println(str);

		return str;
	}

	public static String binomialExpansionNegY(String binomial, int power) {
		// String split[]
				String num = binomial.substring(2);
				String numR = binomial.substring(0,1);
				int numRR = Integer.parseInt(numR);

				System.out.println(num);
				System.out.println(numR);
				System.out.println("----------");
				// num is now a string
				String str = "";
				for (int k = 0; k <= power; k++) {
					int combin = powerChoosek(power, k);
					String leftBi = firstPartBi(num, (power - k));
					String leftBiNum = find_num(leftBi);
					int numRight = (int) Math.pow(numRR, k);
					// System.out.println(combin +" "+leftBi +" "+numRight);
					if(k ==power){
					//int firstVarX = find_Var(leftBi);
					int intNumRight = Integer.parseInt(leftBiNum);
					int total = combin * numRight * intNumRight;
					String varPartofBi = "";
					String totalS = Integer.toString(total);
					System.out.println(totalS + varPartofBi);
					System.out.println("------------------------");

					if (k == power) {
					str = str + totalS + varPartofBi;
					break;
				}
				if (k % 2 == 0) {
					str = str + totalS + varPartofBi + " -";
				} else {
			
					str = str + totalS + varPartofBi + " + ";
				}
					
					}else{
						int firstVarX = find_Var(leftBi);
						int intNumRight = Integer.parseInt(leftBiNum);
						int total = combin * numRight * intNumRight;
						String varPartofBi = leftBi.substring(firstVarX);
						String totalS = Integer.toString(total);
						System.out.println(totalS + varPartofBi);
						System.out.println("------------------------");

						if (k == power) {
						str = str + totalS + varPartofBi;
						break;
					}
					if (k % 2 == 0) {
						str = str + totalS + varPartofBi + " -";
					} else {
				
						str = str + totalS + varPartofBi + " + ";
					}
					}
					
					
					
					
				}
				System.out.println(str);

				return str;
	}


	//X and Y
	
	public static String binomialExpansionTwoVarPos(String binomial, int power) {
		// String split[]
		String numLeft = binomial.substring(0, 2);
		String numRight = binomial.substring(3);

		// int numRR = Integer.parseInt(numR);

		// System.out.println(numLeft);
		// System.out.println(numRight);
		// System.out.println("----------");

		String str = "";
		for (int k = 0; k <= power; k++) {
			int combin = powerChoosek(power, k);
			String leftBi = firstPartBi(numLeft, (power - k));
			String rightBi = firstPartBi(numRight, (k));
			// System.out.println(combin);
			// System.out.println("leftBi "+leftBi);
			// System.out.println("rightBi "+rightBi);
			// System.out.println("+++++++++++");

			if (rightBi.equals("1")) {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				int firstVarX = find_Var(leftBi);
				// int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				String varPartofBiX = leftBi.substring(firstVarX);
				// String varPartofBiY = rightBi.substring(firstVarY);

				// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+"------------------------");
				str = str + combin * intNumRight * intNumLeft + varPartofBiX + " + ";
			}

			else if (leftBi.equals("1")) {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				// int firstVarX = find_Var(leftBi);
				int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				// String varPartofBiX = leftBi.substring(firstVarX);
				String varPartofBiY = rightBi.substring(firstVarY);

				// System.out.println(combin*intNumRight*intNumLeft+varPartofBiY+"------------------------");
				str = str + combin * intNumRight * intNumLeft + varPartofBiY;

			} else {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				int firstVarX = find_Var(leftBi);
				int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				String varPartofBiX = leftBi.substring(firstVarX);
				String varPartofBiY = rightBi.substring(firstVarY);

				// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+varPartofBiY+"------------------------");
				str = str + combin * intNumRight * intNumLeft + varPartofBiX + varPartofBiY + " + ";
			}

			// String varPartofBiX = leftBi.substring(firstVarX);
			// String varPartofBiY = leftBi.substring(firstVarY);

			// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+varPartofBiY);

			// System.out.println(intNumRight);
			// System.out.println(intNumLeft);
			// System.out.println("----------");

		}

		return str;
	}

	public static String binomialExpansionTwoVarNeg(String binomial, int power) {
		// String split[]
		String numLeft = binomial.substring(0, 2);
		String numRight = binomial.substring(3);

		// int numRR = Integer.parseInt(numR);

		// System.out.println(numLeft);
		// System.out.println(numRight);
		// System.out.println("----------");

		String str = "";
		for (int k = 0; k <= power; k++) {
			int combin = powerChoosek(power, k);
			String leftBi = firstPartBi(numLeft, (power - k));
			String rightBi = firstPartBi(numRight, (k));
			// System.out.println(combin);
			// System.out.println("leftBi "+leftBi);
			// System.out.println("rightBi "+rightBi);
			// System.out.println("+++++++++++");

			if (rightBi.equals("1")) {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				int firstVarX = find_Var(leftBi);
				// int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				String varPartofBiX = leftBi.substring(firstVarX);
				// String varPartofBiY = rightBi.substring(firstVarY);

				if (k % 2 == 0) {
					// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+"------------------------");
					str = str + combin * intNumRight * intNumLeft + varPartofBiX + " - ";
				}else{
				str = str + combin * intNumRight * intNumLeft + varPartofBiX + " + ";
				}
			}

			else if (leftBi.equals("1")) {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				// int firstVarX = find_Var(leftBi);
				int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				// String varPartofBiX = leftBi.substring(firstVarX);
				String varPartofBiY = rightBi.substring(firstVarY);

				// System.out.println(combin*intNumRight*intNumLeft+varPartofBiY+"------------------------");
				str = str + combin * intNumRight * intNumLeft + varPartofBiY;

			} else {
				String leftBiNum = find_num(leftBi);
				String rightBiNum = find_num(rightBi);
				int firstVarX = find_Var(leftBi);
				int firstVarY = find_Var(rightBi);
				int intNumRight = Integer.parseInt(leftBiNum);
				int intNumLeft = Integer.parseInt(rightBiNum);
				String varPartofBiX = leftBi.substring(firstVarX);
				String varPartofBiY = rightBi.substring(firstVarY);

				if (k % 2 == 0){
				// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+varPartofBiY+"------------------------");
				str = str + combin * intNumRight * intNumLeft + varPartofBiX + varPartofBiY + " - ";
				}else{
				str = str + combin * intNumRight * intNumLeft + varPartofBiX + varPartofBiY + " + ";
				}
			}

			// String varPartofBiX = leftBi.substring(firstVarX);
			// String varPartofBiY = leftBi.substring(firstVarY);

			// System.out.println(combin*intNumRight*intNumLeft+varPartofBiX+varPartofBiY);

			// System.out.println(intNumRight);
			// System.out.println(intNumLeft);
			// System.out.println("----------");

		}

		return str;
	}

	//Helper functions
	public static String find_num(String input) {
		String str = "";
		for (int k = 0; k <= input.length(); k++) {
			// System.out.println(k);
			// System.out.println(input.length());
			// System.out.println(input.substring(k,k+1));
			if (k == input.length()) {
				if (input.substring(k).equals("1") || input.substring(k).equals("2") || input.substring(k).equals("3")
						|| input.substring(k).equals("4") || input.substring(k).equals("5")
						|| input.substring(k).equals("6") || input.substring(k).equals("7")
						|| input.substring(k).equals("8") || input.substring(k).equals("9")) {
					str = str + input.substring(k);

				} else {
					break;
				}
			}

			if (input.substring(k, k + 1).equals("1") || input.substring(k, k + 1).equals("2")
					|| input.substring(k, k + 1).equals("3") || input.substring(k, k + 1).equals("4")
					|| input.substring(k, k + 1).equals("5") || input.substring(k, k + 1).equals("6")
					|| input.substring(k, k + 1).equals("7") || input.substring(k, k + 1).equals("8")
					|| input.substring(k, k + 1).equals("9")) {
				str = str + input.substring(k, k + 1);

			} else {
				break;
			}

		}
		// System.out.println(str);
		return str;
	}

	public static int find_Var(String input) {
		String str = "";
		for (int k = 0; k <= input.length(); k++) {
			// System.out.println(k);
			// System.out.println(input.length());
			// System.out.println(input.substring(k,k+1));
			if (k == input.length()) {
				if (input.substring(k).equals("a") || input.substring(k).equals("k") || input.substring(k).equals("b")
						|| input.substring(k).equals("l") || input.substring(k).equals("c")
						|| input.substring(k).equals("m") || input.substring(k).equals("d")
						|| input.substring(k).equals("n") || input.substring(k).equals("e")
						|| input.substring(k).equals("f") || input.substring(k).equals("o")
						|| input.substring(k).equals("g") || input.substring(k).equals("p")
						|| input.substring(k).equals("h") || input.substring(k).equals("q")
						|| input.substring(k).equals("i") || input.substring(k).equals("r")
						|| input.substring(k).equals("j") || input.substring(k).equals("x")
						|| input.substring(k).equals("s") || input.substring(k).equals("y")
						|| input.substring(k).equals("t") || input.substring(k).equals("z")
						|| input.substring(k).equals("u") || input.substring(k).equals("v")
						|| input.substring(k).equals("w")) {
					return k;

				}
			}

			if (input.substring(k, k + 1).equals("a") || input.substring(k, k + 1).equals("k")
					|| input.substring(k, k + 1).equals("b") || input.substring(k, k + 1).equals("l")
					|| input.substring(k, k + 1).equals("c") || input.substring(k, k + 1).equals("m")
					|| input.substring(k, k + 1).equals("d") || input.substring(k, k + 1).equals("n")
					|| input.substring(k, k + 1).equals("e") || input.substring(k, k + 1).equals("f")
					|| input.substring(k, k + 1).equals("o") || input.substring(k, k + 1).equals("g")
					|| input.substring(k, k + 1).equals("p") || input.substring(k, k + 1).equals("h")
					|| input.substring(k, k + 1).equals("q") || input.substring(k, k + 1).equals("i")
					|| input.substring(k, k + 1).equals("r") || input.substring(k, k + 1).equals("j")
					|| input.substring(k, k + 1).equals("x") || input.substring(k, k + 1).equals("s")
					|| input.substring(k, k + 1).equals("y") || input.substring(k, k + 1).equals("t")
					|| input.substring(k, k + 1).equals("z") || input.substring(k, k + 1).equals("u")
					|| input.substring(k, k + 1).equals("v") || input.substring(k, k + 1).equals("w")) {
				return k;

			}

		}
		// System.out.println(str);
		return 0;
	}

}
