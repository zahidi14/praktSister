/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zero
 */
public class Array_Thread extends Thread{
   
   
   private int A,B,C;
   int[] jumlah = new int[6];
   private String Namathread;

   
   public Array_Thread(String nama){
       Namathread = nama;
   }
   
   public void Index(int a, int b, int c){
       A = a;
       B = b;
       C = c;
   }
   
   public void run(){
       int jumlah = A + B + C;
        System.out.print(Namathread+ "  \t ") ;
        System.out.println(A + " + " + B + " + " + C + " = " + jumlah);

   }
   
   public static void main(String[] args) {
       int[] Array1 = {6, 9, 1, 2, 3, 5};
       int[] Array2 = {7, 11, 6, 4, 3, 1};
       int[] Array3 = {5, 4, 3, 2, 1, 12};
       
        for (int i = 0; i < 3; i++) {
            System.out.print("Array 1  : ");
            for (i = 0; i < 6; i++) {
                System.out.print(Array1[i] + ", ");
            }
            System.out.print("\nArray 2  : ");
            for (i = 0; i < 6; i++) {
                System.out.print(Array2[i] + ", ");
            }
            System.out.print("\nArray 3  : ");
            for (i = 0; i < 6; i++) {
                System.out.print(Array3[i] + ", ");
            }
            System.out.println("");
        }

        System.out.println("\n Jumlah : ");
        for (int a = 0; a < 6; a++) {
            Array_Thread at = new Array_Thread("Thread : " + a);
            at.Index(Array1[a], Array2[a], Array3[a]);
            at.start();
            
        }
       
    }

}
