/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi_09_10_mobil;

import java.util.Scanner;

/**
 *
 * @author bodnart
 */
public class Hazi_09_10_mobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hány üzletben kapható a telefon? ");
        int bolt = sc.nextInt();
        int[] arak = new int[bolt];
        int ar = 0;
        int osszeg = 0;
        double atlagAr = 0;
        int draga = 0;
        int olcso = 0;
        int legolcsobbUzlet = 0;
        for (int i = 0; i < arak.length ; i++){
            System.out.println("Az "+ (i+1) + " üzletben mennyibe kerül a teló? ");
            ar = sc.nextInt();
            arak[i] = ar;
        }
//átlagár        
        for(int i = 0; i < arak.length; i++){
            osszeg = osszeg + arak[i];
            atlagAr = (double)osszeg / arak.length;
        }
        System.out.println("A telo átlagára: " + atlagAr);
//90.000-nél drágább        
        for(int i = 0; i < arak.length; i++){
            if (arak[i] > 90000){
                draga = draga + 1;
            }
        }
        System.out.println( draga + " üzletben drágább 90.000 forintnál a telo.");
//melyikben a legolcsóbb, és mennyi?       
        for (int i = 0; i < arak.length; i++){
            if (i == 0){
                olcso = arak[i];
            }else
                if(arak[i] < olcso){
                    olcso = arak[i];              
                legolcsobbUzlet = i+1;
                }
        }
        System.out.println("Az " + legolcsobbUzlet + ". üzletben a legolcsóbb, " + olcso + " forint a telo.");
//megkeresi, melyik boltban kapható az adott áron
        System.out.println("Mennyiért szeretnél venni telefont? ");
        int vetelAr = sc.nextInt();
        int uzletSzam = -1;
        for(int i = 0; i < arak.length; i++){
            if (vetelAr == arak[i]){
                uzletSzam = i+1;
            }
        }
        System.out.println("A " + uzletSzam + " számú üzletben ennyibe kerül.");
        }
        
    }
    

