//student ID:1582210
//name: Harada Yuta


package e1;

public class ShowAverageTest {
	public static void main(String[] args) {
		String[] subjects =  { "English", "Mathematics", "Science" };
		double[][] scores = { { 53, 68, 88 }, { 73, 81, 70 }, { 91, 90, 62 } };
		
		if (args.length == 1) {
			if (args[0].equals("test1")) {
				scores = new double[][] { { 53, 68, 88 }, { 73, 81, 70 }, { 91, 90, 62 } };
			} else if (args[0].equals("test2")) {
				scores = new double[][] { { 80, 65, 90 }, { 70, 50, 75 }, { 100, 90, 80 } };
			} else if (args[0].equals("test3")) {
				scores = new double[][] { { 92, 85, 70 }, { 63, 61, 74 }, { 60, 75, 93 } };
			} else if (args[0].equals("test4")) {
				scores = new double[][] { { 100, 95, 87 }, { 90, 100, 63 }, { 85, 70, 65 } };
			} else if (args[0].equals("test5")) {
				scores = new double[][] { { 70, 60, 80 }, { 90, 85, 75 }, { 95, 85, 70 } };
			}
		}
		
		// Complete the code.
		double avg[],sum[];
		float sumSub = 0,sumStu = 0,avgSub = 0,avgStu = 0;
		
		for(int j = 0;j < scores.length;j++) {
			for(int i = 0;i < scores[j].length;i++) {
				sumStu += scores[j][i];
			}
			avgStu = sumStu / 3;
			System.out.printf("Average score over the 3 subjects for student %d: %.1f\n",j+1,avgStu);
			sumStu = 0;
			avgStu = 0;
		}
		System.out.println("");
		for(int k = 0;k < subjects.length;k++) {
			for(int n = 0;n < scores.length;n++) {
				sumSub += scores[n][k];
			}
			avgSub = sumSub / 3;
			System.out.printf("Average score over the 3 students for %s: %.1f\n",subjects[k],avgSub);
			sumSub = 0;
			avgSub = 0;
		}
	}
}



