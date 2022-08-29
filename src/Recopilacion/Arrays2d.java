package Recopilacion;

public class Arrays2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]num= {{23,5,6,7,8},
					{24,5,9,1,23},	
					{29,544,64,2,5},
					{24,54,21,74,24},
					{10,5,3,2,14}};
		/*for (int i =0;i<4;i++) {
			System.out.println();
			for (int j=0;j<5;j++) {
				System.out.print(num[i][j]+" ");*/
				
		for (int i[]:num) {
			System.out.println();
			for (int j: i) {
				System.out.print(j+" ");}
				
			}
			}
		}
		
	


