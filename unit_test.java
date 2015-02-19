import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;
import java.lang.String;


public class unit_test {
static List<ArrayList<ArrayList<Integer>>> read(String filename,int matrices_to_read) {
     
       String thisLine;
       List<ArrayList<ArrayList<Integer>>> res = new LinkedList<ArrayList<ArrayList<Integer>>>();

       try {
           BufferedReader br = new BufferedReader(new FileReader(filename));

           for(int i=0; i<matrices_to_read; i++){
          
           ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
           while ((thisLine = br.readLine()) != null) {
               if (thisLine.trim().equals("")) {
                   break;
               } else {
                   ArrayList<Integer> line = new ArrayList<Integer>();
                   String[] lineArray = thisLine.split("\t");
                   for (String number : lineArray) {
                       line.add(Integer.parseInt(number));
                   }
                   matrix.add(line);  
               }
           }
           res.add(matrix);
           
           }
           
           br.close();
           
       } catch (IOException e) {
           System.err.println("Error: " + e);
       }
       return res;
}
static void printMatrix(ArrayList<ArrayList<Integer>>  matrix) {
for (ArrayList<Integer> arrayList : matrix) {
for (Integer integer : arrayList) {
System.out.print(integer + " ");
}
System.out.print("\n");
}
}

public static void main(String[] args) {
int matrices_to_read;
int matrices_to_read1;
int matrices_to_read2;
   Scanner in = new Scanner(System.in);
   
   //unit test for adding 3 matrices
   System.out.println("For adding 3 matrices");
   matrices_to_read = 3;
   
   String sample_file_name=("C:\\Users\\Administrator\\workspace\\matrix_calculator1\\sample");
   // reading the matrices from the file
   List<ArrayList<ArrayList<Integer>>> matrices = read(sample_file_name,matrices_to_read);
   
   int q= matrices.size();
   for(int i=0;i<q;i++){
   ArrayList<ArrayList<Integer>> A = matrices.get(i);
   printMatrix(A);
   }
   
   matrix manipulation = new matrix();
   int[][] add_result=manipulation.add(matrices);
   
   
   //unit test for multiplying 2 matrices
   System.out.println("\n");
   System.out.println("For multiplying 2 matrices");
   matrices_to_read1 = 2;

   String sample_file_name1=("C:\\Users\\Administrator\\workspace\\matrix_calculator1\\sample");
   // reading the matrices from the file
   List<ArrayList<ArrayList<Integer>>> matrices1 = read(sample_file_name1,matrices_to_read1);
   
   int r= matrices1.size();
   for(int i=0;i<r;i++){
   ArrayList<ArrayList<Integer>> A = matrices1.get(i);
   printMatrix(A);
   }
   
   matrix manipulation1 = new matrix();
   int[][] multiply_res=manipulation1.multiply(matrices1);
   
   //unit test for multiplying 2 matrices and adding a third matrix
   System.out.println("\n");
   System.out.println("For multiplying 2 matrices andadding a third matrix");
   matrices_to_read2 = 2;

   String sample_file_name2=("C:\\Users\\Administrator\\workspace\\matrix_calculator1\\sample");
   // reading the matrices from the file
   List<ArrayList<ArrayList<Integer>>> matrices2 = read(sample_file_name2,matrices_to_read2);
   
   int s= matrices2.size();	//getting the number of matrices
   for(int i=0;i<s;i++){
   ArrayList<ArrayList<Integer>> A = matrices2.get(i);
   printMatrix(A);	//printing the matrices
   }
   
   matrix manipulation2 = new matrix();
   int[][] multiply_res1=manipulation2.multiply(matrices2);
   List<ArrayList<ArrayList<Integer>>> result_list = new LinkedList<ArrayList<ArrayList<Integer>>>();
   ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
   for (int i = 0; i < multiply_res1.length; i++)
        {
            ArrayList<Integer> tempArray = new ArrayList<Integer>();
            for (int j = 0; j < multiply_res1[i].length; j++)
            {
                tempArray.add(Integer.valueOf(multiply_res1[i][j]));
            }
            list.add(tempArray);
        }
   result_list.add(list);
   
   int matrices_to_read3;
   matrices_to_read3 = 2;

   String sample_file_name3=("C:\\Users\\Administrator\\workspace\\matrix_calculator1\\sample");
   // reading the matrices from the file
   List<ArrayList<ArrayList<Integer>>> matrices3 = read(sample_file_name3,matrices_to_read3);
   
   int t= matrices3.size();	//getting the number of matrices
   for(int i=0;i<t;i++){
   ArrayList<ArrayList<Integer>> A = matrices3.get(i);
   printMatrix(A);	//printing the matrices
   result_list.add(A);
   }
   int[][] add_res1=manipulation2.add(result_list);
  
}
}
