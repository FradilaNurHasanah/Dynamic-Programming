/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HitungFibonacci;
import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args)
    {
        System.out.println("Nama        : Fradila Nur Hasanah");
        System.out.println("Kelas       : X RPL 2");
        System.out.println("No.Absen    : 15");
        
        System.out.println("");
        
        int [] nominal ={100, 500, 1000, 2000, 5000};
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang : ");
        int uang = scan.nextInt();
        
        for (int i = 0; i<5; i++) 
        {
            int jumlah = uang/nominal[i];
            uang = uang - (nominal[i]*jumlah);
            
            System.out.println("lembar" + nominal[i] + "=" + jumlah);
        }
    }
}
