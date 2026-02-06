import java.util.Scanner;
class Array2D {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int arr[][] = new int [3][3];
		int r=arr.length;
		int c=arr[0].length;
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		
		System.out.println("Original Matrix:");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		
		int transpose[][] = new int[3][3];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        transpose[j][i] = arr[i][j];
		    }
		}
		
		System.out.println("Transpose Matrix:");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(transpose[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}