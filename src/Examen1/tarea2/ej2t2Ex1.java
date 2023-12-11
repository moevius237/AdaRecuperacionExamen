package Examen1.tarea2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class ej2t2Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saa");
        String sa = sc.next();
        try(Stream <Path> stream = Files.find(Paths.get("C:\\Users\\arzmo\\Desktop\\hu"),
                Integer.MAX_VALUE,((path, basicFileAttributes) ->
                        path.getFileName().toString().equals(sa)))) {
            stream.forEach(path -> {
                System.out.println("El archivo " + stream + " een " + path);
            });
            if (stream.count()==0){
                System.out.println("no existe");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
