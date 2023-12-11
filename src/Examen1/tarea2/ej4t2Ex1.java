package Examen1.tarea2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

public class ej4t2Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ruta");
        String rutas = sc.next();
        Path path = Path.of(rutas);


        try (Stream<Path> pathStream = Files.walk(path, Integer.MAX_VALUE)){
            System.out.println("Estas seguro");
            String isno = sc.next();
            if (isno.equalsIgnoreCase("si")){
                pathStream.sorted((p1 , p2) -> -p1.compareTo(p2)).
                        forEach(path1 ->{
                            try {
                                Files.delete(path);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
            }else {
                System.out.println("error");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
