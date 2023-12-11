package Examen1.tarea4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class ej1t4Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            RandomAccessFile ra = new RandomAccessFile("C:\\Users\\arzmo\\Desktop\\entornos\\AdaRecuperacionExamen\\ficheros\\ej1.txt","rw");


        System.out.println("Dime una palabra");
        String rem= sc.next();
        System.out.println("Dime una del mismo tamaño de " + rem.length());
        String rem1 = sc.next();
        int su = rem.length();
        String line;
        while ((line = ra.readLine()) != null)
        if (line.equals(rem)){
           ra.seek(su);
           ra.writeUTF(rem1);
           break;
        }else {
            System.out.println("no existe");
        }
        ra.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
