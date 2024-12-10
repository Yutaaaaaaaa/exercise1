package e2;

public class SubjectScore {
	private String studentName;
	private int num;
	private String[] subject;
	private int[] point;
	static int MaxNum = 10;
	
	SubjectScore(String s,int i){
		studentName = s;
		num = i;
		if (0 > i || i > MaxNum) {
			System.out.println("Error");
		}
		else {
			subject = new String[i];
			point = new int[i];
		}
	}
	
	SubjectScore(int i) {
		studentName = "unknown";
		num = i;
	}
	
	SubjectScore(String s){
		this(s,5);
	}
	
	SubjectScore(){
		this("unknown",5);
	}
	
	int getNum() {
		return num;
	}
	
	String getStudentName() {
		return studentName;
	}
	
	void setStudentName(String s) {
		studentName = s;
	}
	
	String getSubject(int i) {
		return subject[i];
	}
	
	int getScore(int i) {
		return point[i];
	}
	
	void setSubject(int i,String s) {
		subject[i] = s;
	}
	
	void setSubject(int i) {
		subject[i] = "unknown";
	}
	
	void setScore(int i,int j) {
		point[i] = j;
	}
	
	void setScore(int i) {
		point[i] = 60;
	}
	
	double calAverage() {
		int sum = 0;
		for(int i = 0; i < point.length; i++) {
			sum += point[i];
		}
		double avg = (double)sum / ((double)point.length-1);
		return avg;
	}
	
	int getMaxScore() {
		int maxScore = 0;
		for(int i = 0; i < point.length; i++) {
			if(maxScore < point[i]) {
				maxScore = point[i];
			}
		}
		return maxScore;
	}
	
	int getMinScore() {
		int minScore = 100;
		for(int i = 0; i < point.length; i++) {
			if(minScore > point[i] && point[i] > 0) {
				minScore = point[i];
			}
		}
		return minScore;
	}
	
	String getMaxSubject() {
		int maxScore = 0;
		String maxSubject = "unknown";
		for(int i = 0; i < point.length; i++) {
			if(maxScore < point[i]) {
				maxScore = point[i];
				maxSubject = subject[i];
			}
		}
		return maxSubject;
	}
	
	String getMinSubject() {
		int minScore = 100;
		String minSubject = "unknown";
		for(int i = 0; i < point.length; i++) {
			if(minScore > point[i] && point[i] > 0) {
				minScore = point[i];
				minSubject = subject[i];
			}
		}
		return minSubject;
	}

	public static void main(String[] args) {
		
	}

}
