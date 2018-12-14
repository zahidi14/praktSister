/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zero
 */
public class cerita {
   

    public void run() {

    }
    
    public static void main(String[] args) {
        for (int p = 0; p < 10; p++) {
            System.out.println("Pasien urutan" + (p+1) + " diperiksa Dokter");
        }

        for (int p = 0; p < 10; p++) {
            if ((p +1) % 5 == 0) {
                System.out.println("");
                System.out.println("5 pasien dirawat Suster");
                
                for (int j = (p-4); j < p+1 ; j++) {
                    System.out.println("pasien urutan " +j+ " bayar ke kasir");
                }
                System.out.println("");
            }

        }
    }
}
