package e1;

public class ShowAverage {
	public static void main(String[] args) {
		String[] subjects =  { "English", "Mathematics", "Science" };
		double[][] scores = { { 53, 68, 88 }, { 73, 81, 70 }, { 91, 90, 62 } };
		
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
