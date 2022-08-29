package Recopilacion;

public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numeros [][]=new int [3][2];
numeros [0][0]= 23;
numeros [0][1]= 2;


numeros [1][0]= 93;
numeros [1][1]= 8;


numeros [2][0]= 9;
numeros [2][1]= 8;

/*for (int i= 0;i<3;i++) {
	System.out.println();
		for (int j= 0;j<2;j++) {
			System.out.print(numeros [i][j]+" ");*/
			
for (int i=0;i<3;i++) {
	for (int j =0;j<2 ;j++) {
		System.out.print(numeros [i][j]);
		}
	}
	}
}
