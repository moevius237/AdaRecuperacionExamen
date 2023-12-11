package Examen1.Tarea3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ej3t3Ex1 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\arzmo\\Desktop\\entornos\\AdaRecuperacionExamen\\ficheros\\numeros.txt");
        try(BufferedReader br = Files.newBufferedReader(path)) {
            String lin;
            int num = 0;
            int cont =0;
            while ((lin = br.readLine()) != null){
                String p [] = lin.split(",");
                for (String s: p) {
                    try {
                        double dou = Double.parseDouble(s);
                        num += dou;
                        cont++;
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (num >0){
                int media = num/cont;
                System.out.println("la media es " + media);
            }else {
                System.out.println("No hay numeros");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
