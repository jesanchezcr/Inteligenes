import java.util.ArrayList;
import Librería.agents.*;
public class puzzle {
	public static void printMatrix(int[][] matrix){
		String string = "";
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				string += matrix[i][j];
			}
			string += "\n";
		}
		System.out.print(string);
	}
	public static int[][] beginRandom(){
		int ran=0;
		int[][] matrix = new int[3][3];
		ArrayList<Integer> arreglo = new ArrayList<>();
		for(int i=0;i<9;i++){
			arreglo.add(i);
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				ran =(int) (Math.random()*arreglo.size());
				matrix[i][j]=arreglo.get(ran);
				arreglo.remove(ran);
			}
		}
		return matrix;
	}
	public static boolean equalsMatrix(int[][] matrix1,int[][] matrix2){
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[1].length; j++) {
				if(matrix1[i][j]!=matrix2[i][j])
					return false;
			}
		}
		return true;
		
	}
	public static void randomMovement(int[][] matrix){
		int[] horizontal = {-1,1};
		int[] vertical = horizontal.clone();
		double direccion = -1;
		direccion = Math.random();
		if(direccion>0.5){
			
		}
		else{
			
		}
		
	}
	public static void randomSolution(int[][] matrix, int[][] solution){
		while(!equalsMatrix(matrix,solution)){
			
		}
		
	}
	public static void main(String [] args){
		int[][] solution = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i==2 && j==2){
						solution[i][j]=0;
						break;
					}
				solution[i][j]=i*3+j+1;
			}
		}
		printMatrix(solution);
		printMatrix(beginRandom());
		
	}
}
