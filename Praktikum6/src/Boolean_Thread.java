/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;

/**
 *
	@Author Zero
 */
public class Boolean_Thread extends Thread {
    int count = 1;
    int k;
    boolean bool_thread;
    
    public void Thread(boolean thread) {
        bool_thread = thread;
    }
    
     public void run() {
        for (;;) {
            try {
                if (bool_thread == true) {
                    count++;
                    this.k = count;

                    if (count % 2 == 0) {
                        System.out.print(count + ", ");
                    }
                } else if (bool_thread == false) {
                    k--;
                    
                    if (k % 2 == 1) {
                        System.out.print(k + ", ");
                    }
                }
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }
     
      public static void main(String[] args) throws IOException {
        Boolean_Thread counter = new Boolean_Thread();
        counter.Thread(true);
        counter.start();
        Boolean_Thread t = new Boolean_Thread();
        System.out.println("ini Urutan Bilangan Genap");
        System.in.read();
        counter.Thread(false);
        counter.resume();
        System.out.println("ini Urutan Bilangan Ganjil");
        System.in.read();
        counter.stop();
    }
}

