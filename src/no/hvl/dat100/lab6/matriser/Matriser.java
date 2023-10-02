package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;
import java.util.ArrayList;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		ArrayList<Integer> elements = new ArrayList<Integer>();
		
		for (int[] each : matrise) {
			for (int every : each) {
				elements.add(every);
			}
		}
		for (int each : elements) {
			System.out.print(each);
			System.out.print(" ");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String x = "";
		for (int i = 0;i<matrise.length;i++) {
			for (int j = 0;j<matrise[i].length;j++) {
				x = x + matrise[i][j] + " ";	
			}
			x = x + "\n";
		}
		return x;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] skalert = new int[matrise.length][];
		
		for (int i = 0;i<matrise.length;i++) {
			int[] tempList = new int[matrise[i].length]; 
			for (int j = 0;j<matrise[i].length;j++) {
				int x = tall*matrise[i][j];
				tempList[j] = x;
			}
			skalert[i] = tempList;
		}

		return skalert;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length) {
			return false;
		}
		for (int i = 0;i<a.length;i++) {
			if ( a[i].length != b[i].length) {
				return false;
			}
			for (int j = 0;j<a[i].length;j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][]matriseNew = new int[matrise.length][];
		for (int i = 0;i<matrise.length;i++) {
			matriseNew[i] = matrise[i].clone();
		}
		
		for (int i = 0;i<matrise.length;i++) {
			for (int j = 0;j<matrise[i].length;j++) {
				matriseNew[j][i] = matrise[i][j];
			}
			System.out.println(Arrays.toString(matriseNew[i]));
			System.out.println(Arrays.toString(matrise[i]));

		}
		return matriseNew;
		
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		if(a.length != b[0].length) {
			int[][] arr = {{}};
			return arr;
			
		}
		int[][] newArray = new int[a[0].length][b.length];
		int x = 0;
		for (int i = 0;i<a.length;i++) {
			for (int j = 0;j<b.length;j++) {
				for (int k = 0;k<a[0].length;k++) {
					x = x + a[i][k] * b[k][j];
				}
				newArray[i][j] = x;
				x = 0;
			}
		}
		return newArray;
	}
}
