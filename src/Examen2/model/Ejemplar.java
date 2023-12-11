package Examen2.model;

public class Ejemplar {
    private int id;
    private String estado;
    private int libroId;

    public Ejemplar(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ejemplar{" +
                "id=" + id +
                ", estado='" + estado + '\'' +
                ", libroId=" + libroId +
                '}';
    }

    public Ejemplar() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getLibroId() {
        return libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }
}
