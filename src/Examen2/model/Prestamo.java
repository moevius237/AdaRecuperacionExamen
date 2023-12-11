package Examen2.model;

import java.time.LocalDateTime;

public class Prestamo {
    private int id;
    private String usuario;
    private LocalDateTime fecha_prestamo;
    private LocalDateTime fecha_devolucion;
    private int ejemplar_id;

    public Prestamo(String usuario, LocalDateTime fecha_prestamo, LocalDateTime fecha_devolucion) {
        this.usuario = usuario;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
    }

    public Prestamo() {
    }

    @Override
    public String toString() {
        return "prestamo{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", fecha_prestamo=" + fecha_prestamo +
                ", fecha_devolucion=" + fecha_devolucion +
                ", ejemplar_id=" + ejemplar_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(LocalDateTime fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public LocalDateTime getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(LocalDateTime fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public int getEjemplar_id() {
        return ejemplar_id;
    }

    public void setEjemplar_id(int ejemplar_id) {
        this.ejemplar_id = ejemplar_id;
    }
}
