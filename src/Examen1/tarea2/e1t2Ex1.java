package Examen1.tarea2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class e1t2Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasa una ruta ");
        String ruta = sc.next();
        try {
        Path directorio = Paths.get(ruta);
        if (Files.isDirectory(directorio)){
            Files.list(directorio)
                    .filter(Files::isRegularFile)
                    .max((path1 , path2) ->{
                        try {
                            long tamaño1 = Files.size(path1);
                            long tamaño2 = Files.size(path2);
                            return Long.compare(tamaño1, tamaño2);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .ifPresent(mayor -> System.out.println("el archivo mayor es " + mayor));
        }else{
            System.out.println("LA ruta no es valida");
        }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
