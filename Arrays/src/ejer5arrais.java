public class ejer5arrais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diagonal[][] = new int[5][5];
		for (int i = 0; i < diagonal.length; i++) {
			for (int j = 0; j < diagonal[i].length; j++) {
				if (i==j) {
					diagonal[i][j]=1;	
				}else {
					diagonal[i][j]=0;
				}
			}
		}
		for (int i = 0; i < diagonal.length; i++) {
			for (int j = 0; j < diagonal[i].length; j++) {
				System.out.print(diagonal[i][j]+" ");
			}
			System.out.println();
		}
	}

}
