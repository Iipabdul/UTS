/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import static java.lang.Integer.parseInt;

/**
 *
 * @author hp
 */
public class BankBeraksi {
public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank saldoSaya = new Bank (100000);
        
        saldoSaya.getSaldo();
        saldoSaya.simpanUang(500000);
        saldoSaya.ambilUang(150000);
    
}
}
