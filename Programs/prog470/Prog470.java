import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Read a 5 X 5 two-dimensional array from an external data file.  The data is stored in rows.  Print the original array and its transpose with appropriate labels as shown.
 *Class to operate on a matrix from 
 *external file to give transpose,sum of 
 *diagonal and sum of rows,columns and total elements
 */
public class Prog470 {

	//Matrix to store elements from external file
	private static int matrix[][];

	//Default constructor to initialize matrix and read the data from external file 
	public Prog470() {

		//Initialize the array
		matrix = new int[5][5];

		int i=0;
		// Set up scanner to input file
		Scanner inFile = null;
		try {
			//Scan the file by creating File instance and Scanner class instance
			inFile = new Scanner(new File("prog464a.dat"));

		} catch (FileNotFoundException e) {//Handling exception if file not found
			e.printStackTrace();
		}

		// Process the input file, one line at a time
		while (inFile.hasNext())
		{
			// Get the row wise column values
			matrix[i][0] = inFile.nextInt();
			matrix[i][1] = inFile.nextInt();
			matrix[i][2] = inFile.nextInt();
			matrix[i][3] = inFile.nextInt();
			matrix[i][4] = inFile.nextInt();

			//Initialize value of i to increase row index by 1
			i++;
		}

	}

	/**
	 * Method to print matrix and its transpose
	 * @param matValues
	 */
	public void transposeMatrix(int [][] matValues){
		System.out.println("Original Matrix");
		//Loops to print matrix elements
		for(int i=0;i<5;i++){//Loop to iterate row values

			for(int j=0;j<5;j++){//Loop to iterate column values

				//printing values at particular row index and all columns with a tab space
				System.out.print(matValues[i][j]+"\t");
			}
			//Change the line
			System.out.println();
		}

		System.out.println("\n\nTranspose");

		//Loops to print Transpose of the matrix
		for(int i=0;i<5;i++){//Loop to iterate row values

			for(int j=0;j<5;j++){//Loop to iterate column values
				
				//On exchanging row and column index matrix transposes
				System.out.print(matValues[j][i]+"\t");
			}
			//Change the line
			System.out.println();
		}
	}

	/**
	 * Method to calculate sum of diagonals
	 * @param matValues
	 */
	public void diagonalSum(int [][] matValues){
		int sumMain = 0;
		int sumOther = 0;

		//Loop to get sum of main diagonal
		for(int p=0;p<5;p++){
			for(int q=0;q<5;q++){
				//Check if row index is equal to column index
				if(p==q){
					//Adding the old sum with current index values
					sumMain = sumMain + matValues[p][q];
				}
			}
		}

		//Print sum of main diagonal
		System.out.println("\nMain Diagonal Sum : "+sumMain);


		int s=4;//(number of columns - 1)
		for(int r=0;r<5;r++){
			//Check the value of s greater than or equal to zero 
			if(s>=0){
				//sum of current element with old value
				sumOther = sumOther + matValues[r][s];
				//Decreasing the value of 's' to reduce column index
				s--;
			}
		}
		//Printing the sum of other diagonal
		System.out.println("Other Diagonal Sum : "+sumOther);

	}

	/**
	 * Method to print sum of all rows,columns and totals sum
	 * @param matrix
	 */
	public void sumOfElements(int[][] matrix){
		int sumOfRow=0;
		int sumOfColumn=0;
		int total = 0;

		System.out.println("\nOriginal Matrix");
		//Loops to print original matrix
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){

				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("\nWith Totals");
		
		//Loops to print sum of rows
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				//sum of each row element with old values
				sumOfRow = sumOfRow + matrix[i][j];
				//printing the element
				System.out.print(matrix[i][j]+"\t");
			}
			//printing the sum of the row
			System.out.println(sumOfRow);
			//adding all row elements to get total
			total = total+sumOfRow;
			//setting sum of row to zero to take next row sum
			sumOfRow = 0;
		}

		//Loops to print sum of columns
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				//sum of each column element with old values
				sumOfColumn = sumOfColumn + matrix[j][i];

			}
			//Printing the element
			System.out.print(sumOfColumn+"\t");
			//setting sum of row to zero to take next column sum
			sumOfColumn = 0;
		}
		
		//Printing total of all elements
		System.out.println(total);


	}
	public static void main(String[] args) {
		int choice = 0;
		Prog470 prog470 = new Prog470();

		Scanner scanner = new Scanner(System.in);


		do{
			System.out.println("\n1.Transpose of Matrix" +
					"\n2.Sum of diagonal" +
					"\n3.Sum of rows and column with total" +
					"\n4.Exit");

			System.out.print("\nPlease enter your choice : ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				prog470.transposeMatrix(matrix);
				break;
			case 2:
				prog470.diagonalSum(matrix);
				break;

			case 3:
				prog470.sumOfElements(matrix);
				break ;

			case 4:
				System.out.println("Good Bye!!!");
				System.exit(0);

			default:
				System.out.println("Please enter correct choice");
				break;
			}

			System.out.println("...........................................");
		}while(true);
		
	}

}