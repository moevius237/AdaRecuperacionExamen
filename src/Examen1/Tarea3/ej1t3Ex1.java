package Examen1.Tarea3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ej1t3Ex1 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\arzmo\\Desktop\\entornos\\AdaRecuperacionExamen\\ficheros\\ej1.txt");
        int sum =0;
        int num =0;
        try(BufferedReader br = Files.newBufferedReader(path)) {
            String lin;
            while ((lin = br.readLine()) != null){
                sum += lin.length();
                num++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int promedio = sum/num;
        System.out.println("El promedio es: " + promedio);
    }
}
