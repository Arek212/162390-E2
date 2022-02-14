package Zad2;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Zad2 {
    public static<T extends Iterable<E>, E> void wypiszCoDrugi(T iterable){
        boolean codrugi = true;
        for(E t: iterable){
            if(codrugi){
                System.out.print(t + ", ");
            }
            codrugi = !codrugi;
        }
    }
    public static void main(String[] args){
        List<String> lista = new ArrayList<String>();
        lista.add("Jeden");
        lista.add("Dwa");
        lista.add("Trzy");
        lista.add("Cztery");
        lista.add("Pięć");
        lista.add("Sześć");
        wypiszCoDrugi(lista);
        System.out.print("\n");
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        wypiszCoDrugi(set);
    }
}
