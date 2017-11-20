/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizielemansayma;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author omero
 */
public class DiziElemanSayma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String pointer=null;
        int timer=0,k=0,area;
        System.out.print("Kaç eleman: ");
        area=s.nextInt();
        String dizi []=new String [area];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+". eleman: ");
            dizi[i]=s.next();
        }
        Arrays.sort(dizi);
        pointer=dizi[0];
        for (int i = k; i < dizi.length; i++) {
            if(pointer.equals(dizi[i])){
                timer++;
                
            }
            else{
                System.out.println(pointer+"--->"+timer);
                pointer=dizi[i];
                timer=1;
            }
            if(i==dizi.length-1)
                System.out.println(pointer+"--->"+timer);
        }
    }
    
}
