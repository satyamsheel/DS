package satyamPractise;

public class bellNo {
	
	int bell(int i) {
		int bellarr[][]=new int[i+1][i+1];
		bellarr[0][0]=1;
		
		for(int j=1;j<=i;j++) {
			bellarr[j][0]=bellarr[j-1][j-1];
			
			for(int k=1;k<=j;k++) {
				bellarr[j][k]=bellarr[j-1][k-1]+bellarr[j][k-1];
			}
		}
		return bellarr[i][0];
	}

	public static void main(String[] args) {
		bellNo bn =new bellNo();
		for(int i=1;i<10;i++) {	
			System.out.println(bn.bell(i));
		}

	}

}
