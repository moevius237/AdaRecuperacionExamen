package Examen1.tarea1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ej1t1Ex1 {
    public static void main(String[] args) {

        Path path = Path.of("./ficheros/datos.txt");
        Path p2 = path.getParent();
        if (!Files.exists(p2)){
            try {
                Files.createDirectories(p2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            try {
                Files.deleteIfExists(path);
                Files.createDirectories(p2);
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        }
    }
