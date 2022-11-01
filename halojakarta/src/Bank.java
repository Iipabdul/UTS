/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Bank {
    int saldoSaya;
    int total;
    Bank(int saldo){
        saldoSaya = saldo;
    }
    void getSaldo(){
        System.out.println("Selamat datang di bank ABC");
        System.out.println("Saldo anda saat ini : Rp." + total);
    }
    void simpanUang(int simpan){
        total = simpan + saldoSaya;
        System.out.println("Simpan Uang : " + simpan);
        System.out.println("Saldo saat ini : Rp." + total);
    }
    void ambilUang(int ambil){
       int total2 = total - ambil;
        System.out.println("Ambil uang : " + ambil);
        System.out.println("Saldo saat ini : Rp. " + total2);
    }
}
