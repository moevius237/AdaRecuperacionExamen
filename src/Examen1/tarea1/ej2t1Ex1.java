package Examen1.tarea1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ej2t1Ex1 {
    public static void main(String[] args) {

        Path path = Path.of("./ficheros/datos.txt");
        Path p2 = path.getParent();
        try {
            Files.writeString(path,"Internet es la tecnología decisiva de la era de la información del mismo modo que el motor eléctrico fue el vector de la transformación tecnológica durante la era industrial. Esta red global de redes informáticas, que actualmente operan sobre todo a través de plataformas de comunicaciones inalámbricas, nos proporciona la ubicuidad de una comunicación multimodal e interactiva en cualquier momento y libre de límites espaciales. La tecnología de internet en realidad no es algo nuevo. Su antepasada, Arpanet, se desarrolló ya en 1969 (Abbate, 1999). Pero no llegó a los usuarios particulares hasta la década de 1990, cuando el US Commerce Department (Ministerio de Comercio de Estados Unidos) liberalizó su uso. Desde ese momento se propagó por el mundo a una velocidad extraordinaria. En 1996 se calculó por primera vez el número de usuarios de internet, con un resultado de 40 millones. En 2013 ya son más de 2.500 millones, la mayoría residente en China. Por otro lado, la expansión de internet se vio restringida durante un tiempo debido a la dificultad que planteaba la instalación de infraestructuras de telecomunicaciones terrestres en países en vías de desarrollo. Esto ha cambiado con la eclosión de las comunicaciones inalámbricas a principios del siglo XXI. Así, mientras en 1991 había unos 16 millones de suscriptores (números) de dispositivos inalámbricos en el mundo, en 2013 son casi 7.000 millones (para un planeta de 7.700 millones de habitantes). Teniendo en cuenta el uso que se hace de la telefonía móvil en los entornos familiar y rural y considerando el uso limitado de estos aparatos entre niños menores de cinco años, podemos decir que casi toda la humanidad está conectada, aunque con importantes diferencias en cuanto a ancho de banda y a eficiencia y precio del servicio");
            System.out.println("El fichero tiene " + Files.lines(path).count() + " lineas");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (p2 != null){
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

