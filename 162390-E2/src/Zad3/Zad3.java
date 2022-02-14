package Zad3;

import java.io.File;
import java.util.List;

public class Zad3 {
    public static void main(String[] args){
        List.of(katalogi("src/"));
    }
    public static String[] katalogi(String a){
        String[] b = {};
        File folder = new File(a);
        b = folder.list((f,g)->f.isDirectory());
        if(b!=null){
            for(String file:b){
                System.out.print(file + "\n");
            }
        }
        return b;
    }
}
