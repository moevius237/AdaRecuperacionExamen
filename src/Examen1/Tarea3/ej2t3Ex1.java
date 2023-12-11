package Examen1.Tarea3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ej2t3Ex1 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\arzmo\\Desktop\\entornos\\AdaRecuperacionExamen\\ficheros\\ej1.txt");
        int cont = 0;
        try(BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String lin;
            while ((lin = bufferedReader.readLine()) != null){
            String [] p = lin.split("\\s+");
                for (String pa: p) {
                    if (pa.length() <4){
                        cont++;
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("El numero es " + cont);
    }



}
