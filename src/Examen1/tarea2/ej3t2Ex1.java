package Examen1.tarea2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.stream.Stream;

public class ej3t2Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ruta ");
        String ruta = sc.next();

        Path path = Path.of(ruta);

        try(Stream <Path> pathStream = Files.find(path,Integer.MAX_VALUE,
                (patha, aatbr) -> aatbr.isRegularFile()&& aatbr.lastModifiedTime().toInstant()
                        .isAfter(Instant.now().minus(7, ChronoUnit.DAYS)))){
            pathStream.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
