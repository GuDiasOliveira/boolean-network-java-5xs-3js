
public class BooleanNetwork {
	public boolean[][] x_f = new boolean[8][5];
	public int[][] j_f = new int[3][5];
	
	public BooleanState step(BooleanState state1) {
		BooleanState state2 = new BooleanState(5);
		for (int i = 0; i < 5; i++) {
			int l = 0;
			for (int j = 0; j < 3; j++) {
				l += state1.x[j_f[j][i] - 1] ? ((int) Math.pow(2, 2 - j)) : 0;
			}
			state2.x[i] = x_f[l][i];
		}
		return state2;
	}
	
	public String step(String state1) {
		return step(new BooleanState(state1)).toString();
	}
}