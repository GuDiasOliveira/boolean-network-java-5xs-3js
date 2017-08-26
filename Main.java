
public class Main {

	public static void main(String[] args) {
		
		BooleanNetwork nw = new BooleanNetwork();
		nw.x_f = new boolean[][] {
			new boolean[] {false,false,false,false,false},
			new boolean[] {true,true,true,false,false},
			new boolean[] {true,true,true,false,false},
			new boolean[] {true,false,false,true,false},
			new boolean[] {false,false,true,false,false},
			new boolean[] {true,true,true,true,false},
			new boolean[] {true,true,false,true,false},
			new boolean[] {true,true,true,true,true}
		};
		nw.j_f = new int[][] {
			new int[] {5,3,3,3,5},
			new int[] {2,5,1,4,4},
			new int[] {4,4,5,4,1}
		};
		
		String states[] = new String[32];
		for (int i = 0; i < 32; i++) {
			String state = Integer.toBinaryString(i);
			int zerosC = 5 - state.length();
			String zerosS = "";
			for (int j = 0; j < zerosC; j++)
				zerosS += "0";
			state = zerosS + state;
			states[i] = state;
		}
		
		System.out.println("digraph G {");
		for (String s : states) {
			System.out.println("    " + s + " -> " + nw.step(s) + ";");
		}
		System.out.println("}");
	}
}
