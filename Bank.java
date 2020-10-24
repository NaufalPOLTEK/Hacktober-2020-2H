/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.Scanner;
/**
 *
 * @author Abdul Rohman
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama[]=new String[10];
        nama[0]="Bagas";
        int norek_arr[]=new int[9];
        int saldo[]=new int[10];
        saldo[0]=1000000;
        norek_arr[0]=1941720077;
        Scanner input=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        System.out.println("Menu ");
        System.out.println("1.Tambah Akun");
        System.out.println("2.Tarik Tunai");
        System.out.println("3.Setor Tunai");
        System.out.println("4. Transfer");
        int pilih=input.nextInt();
        if (pilih==1) {
            System.out.println("Anda ingin membuat berapa akun ");
            int jum =input.nextInt();
            for (int i = 0; i < jum; i++) {
                System.out.println("Masukkan Nama Anda");
                nama[i]=input2.nextLine();
                System.out.println("Masukkan Jumlah Saldo Anda");
                saldo[i]=input.nextInt();
            }
        }else if(pilih==2){
            System.out.println("Masukkan nama akun");
            String cari=input2.nextLine();
            for (int i = 0; i <nama.length; i++) {
                if (cari.equalsIgnoreCase(nama[i])) {
                    System.out.println("Masukkan jumlah uang yang ingin anda ambil");
                    int tarik=input.nextInt();
                    int total=saldo[i]-tarik;
                    System.out.println("No rekening anda "+norek_arr[i]);
                    System.out.println("Sisa saldo anda "+total);
                }
            }
        }else if(pilih==3){
            System.out.println("Masukkan nama akun");
            String cari=input2.nextLine();
            for (int i = 0; i <nama.length; i++) {
                if (cari.equalsIgnoreCase(nama[i])) {
                    System.out.println("Masukkan jumlah uang yang ingin anda masukkan");
                    int masuk=input.nextInt();
                    int total=saldo[i]+masuk;
                    System.out.println("Total saldo anda "+total);
                }
            }
        }else if(pilih==4){
            System.out.println("Masukkan nama akun");
            String cari=input2.nextLine();
            for (int i = 0; i <nama.length; i++) {
                if (cari.equalsIgnoreCase(nama[i])) {
                    System.out.println("Masukkan jumlah uang yang ingin anda transfer");
                    int transfer=input.nextInt();
                    System.out.println("Masukkan nomor rekenig yang anda tuju");
                    int norek=input.nextInt();
                    int total=saldo[i]-transfer;
                    System.out.println("Masukkan nama yang anda tuju");
                    String nama_tuju=input2.nextLine();
                    System.out.println("Nama yang anda tuju"+nama_tuju);
                    System.out.println("No rekening yang anda tuju" +norek);
                    System.out.println("Sisa saldo anda "+total);
                }
    }
   
}
    
    }

}
