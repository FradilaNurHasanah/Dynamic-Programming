/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HitungFibonacci;
import java.util.Scanner;
public class Tugas02 {
    public static void main(String[] args)
    {
        System.out.println("Nama        : Fradila Nur Hasanah");
        System.out.println("Kelas       : X RPL 2");
        System.out.println("No.Absen    : 15");
        
        System.out.println("");
        int [] berat = {4, 5, 2, 3, 7};
        int [] bayaran  = {5000, 7000, 2000, 3000, 10000};
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah berat: ");
        int total = scan.nextInt();
        
        for (int i = 0; i < berat.length; i++) {
            int jumlah = total / berat[i];
            total = total - (berat[i]*jumlah);
            
            System.out.println("jumlah" + berat[i] + "=" + jumlah);
        }
    }
}






    

