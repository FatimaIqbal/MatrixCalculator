import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.lang.String;

public class matrix {

public static int[][] add(List<ArrayList<ArrayList<Integer>>> res) {
  int number_of_matrices = res.size();
 
  ArrayList<ArrayList<Integer>> A = res.get(0);
  int rowA = A.size();
  ArrayList<Integer> rowA1 = A.get(0);
  int columnA=rowA1.size();
  
  int[][] result_matrix = new int[rowA][columnA];
  for(int i=0;i+1<number_of_matrices;i++){
 
  ArrayList<ArrayList<Integer>> B = res.get(i+1);
  int rowB = B.size();	//for getting number of rows in a matrix??
  ArrayList<Integer> rowB1 = B.get(0);
  int columnB=rowB1.size();
  if(rowA != rowB || columnA != columnB){
  System.out.print("cannot add since the matrices are of different order");
  System.out.print("\n");
  break;
  }
   
  else{
 
  for (int k = 0; k < rowA; k++) {
  for (int j = 0; j < columnA; j++) {
  ArrayList<Integer> x = A.get(k);
    int y = x.get(j);
  ArrayList<Integer> x1 = B.get(k);
  int y1 = x1.get(j);
  result_matrix[k][j] = y + y1;
  }
  }
  System.out.print("Addition:");
    System.out.print("\n");
    for (int k = 0; k < rowA; k++) {
  for (int j = 0; j < columnA; j++){
  System.out.print(+result_matrix[k][j]);
  }
  System.out.print("\n");
  }
    System.out.print("\n");
    
  }
 
  }
  return result_matrix;
}
public static int[][] subtract(List<ArrayList<ArrayList<Integer>>> res) {
int number_of_matrices = res.size();
 
  ArrayList<ArrayList<Integer>> A = res.get(0);
  int rowA = A.size();
  ArrayList<Integer> rowA1 = A.get(0);
  int columnA=rowA1.size();
  
  int[][] result_matrix = new int[rowA][columnA];
  for(int i=0;i+1<number_of_matrices;i++){
 
  ArrayList<ArrayList<Integer>> B = res.get(i+1);
  int rowB = B.size();	//for getting number of rows in a matrix??
  ArrayList<Integer> rowB1 = B.get(0);
  int columnB=rowB1.size();
  if(rowA != rowB || columnA != columnB){
  System.out.print("cannot subtract since the matrices are of different order");
  System.out.print("\n");
  break;
  }
   
  else{
 
  for (int k = 0; k < rowA; k++) {
  for (int j = 0; j < columnA; j++) {
  ArrayList<Integer> x = A.get(k);
    int y = x.get(j);
  ArrayList<Integer> x1 = B.get(k);
  int y1 = x1.get(j);
  result_matrix[k][j] = y - y1;
  }
  }
  System.out.print("subtraction:");
    System.out.print("\n");
    for (int k = 0; k < rowA; k++) {
  for (int j = 0; j < columnA; j++){
  System.out.print(+result_matrix[k][j]);
  }
  System.out.print("\n");
  }
    System.out.print("\n");
    
  }
 
  }
  return result_matrix;
}

public static int[][] multiply(List<ArrayList<ArrayList<Integer>>> res) {
int number_of_matrices = res.size();
 
  ArrayList<ArrayList<Integer>> A = res.get(0);
  int rowA = A.size();
  ArrayList<Integer> rowA1 = A.get(0);
  int columnA=rowA1.size();
  ArrayList<ArrayList<Integer>> B = res.get(1);
  int rowB = B.size();	//for getting number of rows in a matrix??
  ArrayList<Integer> rowB1 = B.get(0);
  int columnB=rowB1.size();
  int[][] result_matrix = new int[rowA][columnB];
  for(int z=0;z<1;z++){
  if(columnA != rowB){
  System.out.print("cannot multiply because of order of matrices ");
  System.out.print("\n");
  break;
  }
  else{
 
     for (int i = 0; i < rowA; i++) { // aRow
             for (int j = 0; j < columnB; j++) { // bColumn
                 for (int k = 0; k < columnA; k++) { // aColumn
                 	ArrayList<Integer> x = A.get(i);
    int y = x.get(k);
  ArrayList<Integer> x1 = B.get(k);
  int y1 = x1.get(j);
                 	result_matrix[i][j] += y * y1;
                 }
             }
         }
  System.out.print("Multiplication:");
    System.out.print("\n");
    for (int k = 0; k < rowA; k++) {
  for (int j = 0; j < columnA; j++){
  System.out.print(+result_matrix[k][j]);
  }
  System.out.print("\n");
  }
    System.out.print("\n");
 
  }
  }
  
  for(int f=2;f<number_of_matrices;f++){
  ArrayList<ArrayList<Integer>> C = res.get(f);
  int rowC = A.size();
  ArrayList<Integer> rowC1 = A.get(f);
  int columnC=rowA1.size();
  int rowD = result_matrix.length;
  int columnD = result_matrix.length;
  if(columnD != rowC){
  System.out.print("cannot multiply because of order of matrices ");
  System.out.print("\n");
  break;
  }
  else{
  int[][] result_matrix2 = new int[rowD][columnC];
   for (int i = 0; i < rowD; i++) { // aRow
             for (int j = 0; j < columnC; j++) { // bColumn
                 for (int k = 0; k < columnD; k++) { // aColumn
                 	ArrayList<Integer> x = C.get(k);
    int y = x.get(j);
  int y3= result_matrix[i][k];
                 	result_matrix[i][j] += y3 * y;
                 }
             }
         }
  System.out.print("Multiplication:");
    System.out.print("\n");
    for (int k = 0; k < rowD; k++) {
  for (int j = 0; j < columnD; j++){
  System.out.print(+result_matrix[k][j]);
  }
  System.out.print("\n");
  }
    System.out.print("\n");
  }
  }
  
  return result_matrix;
}
}
