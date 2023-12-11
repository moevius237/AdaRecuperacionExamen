package Examen1.Tarea3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ej4t4Ex1 {
    public static void main(String[] args) {
            String entrada = "texto.txt";
            String salida = "info_filtrado.txt";
            String filtrar = "INFO:";
            try (BufferedReader lector = new BufferedReader(new FileReader(entrada));
                 BufferedWriter escritor = new BufferedWriter(new FileWriter(salida))) {
                String lin;
                while ((lin = lector.readLine())!= null){
                    if (lin.startsWith(filtrar)){
                        escritor.write(lin);
                        escritor.newLine();
                    }
                }
                System.out.println("Se han filtrado " + filtrar + " en " + salida);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
