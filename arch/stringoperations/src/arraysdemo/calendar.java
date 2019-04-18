package arraysdemo;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] days = new int[6][7];
		int start = 1;
		int totalnumberofdays = 30;
		int count = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < start) {
					
				}
				else{
					if (count <= totalnumberofdays) {
						days[i][j] = count;
						count++;
					}
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(days[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
