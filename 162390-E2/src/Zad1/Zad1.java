package Zad1;

import java.time.LocalTime;

public class Zad1 {
   public static <T extends  Comparable>void jestPalindromem(T[] tab){
       boolean palindrom = true;
       for(int i = 0;i < tab.length/2;i++){
           if(!tab[i].equals((tab[tab.length - 1 - i]))){
               palindrom = false;
               break;
           }
       }
       if(palindrom){
           System.out.print("Jest to palindrom\n");
       }
       else{
           System.out.print("Nie jest to palindrom\n");
       }
   }
   public static void main(String[] args){
       Integer[] posortowane = {1,2,3,4,5,6};
       jestPalindromem(posortowane);
       Integer[] nieposortowane = {1,2,3,2,1};
       jestPalindromem(nieposortowane);
       LocalTime[] posortowanedata = { LocalTime.of(1,1),LocalTime.of(2,2),LocalTime.of(3,3),LocalTime.of(4,4)};
       jestPalindromem(posortowanedata);
       LocalTime[] nieposortowanedata = { LocalTime.of(1,1),LocalTime.of(2,2),LocalTime.of(2,2),LocalTime.of(1,1)};
       jestPalindromem(nieposortowanedata);
   }
}
