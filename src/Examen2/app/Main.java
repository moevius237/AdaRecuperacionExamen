package Examen2.app;

import Examen2.model.Ejemplar;
import Examen2.model.Prestamo;
import Examen2.mysql.LibroDb;
import Examen2.mysql.PrestamoDB;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Prestamo[]> mapa = new HashMap<>();
        Prestamo array0 = new Prestamo("perpito", LocalDateTime.now(),LocalDateTime.now());
        Prestamo array1 = new Prestamo("pepita", LocalDateTime.now(),LocalDateTime.now());
        Prestamo array2 = new Prestamo("pepin", LocalDateTime.now(),LocalDateTime.now());
        Prestamo[] pres = {array0, array1, array2};

        mapa.put(1,pres);
        System.out.println(LibroDb.existe(1));
        Ejemplar ejemplar = new Ejemplar("nuevo");


        for (Map.Entry<Integer, Prestamo[]> entrada : mapa.entrySet()) {
            if (LibroDb.existe(entrada.getKey())) {
                try {
                    LibroDb.insertEjemplar(ejemplar, entrada.getKey());
                    PrestamoDB.insertPrestamo(pres,ejemplar);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("no exist");
            }
        }


    }
    }

