package modelo;

public class Libro {
    protected String nameLibro;
    protected String nameAutor;
    protected int anioEdition;
    protected String information;
    protected String lujo;
    protected String coleccion;

    public Libro(String nameLibro, String nameAutor, int anioEdition, String lujo, String coleccion) {
        this.nameLibro = nameLibro;
        this.nameAutor = nameAutor;
        this.anioEdition = anioEdition;
        this.lujo = lujo;
        this.coleccion = coleccion;

    }

    public String mostrarinformation() {
        return this.information;
    }
}
