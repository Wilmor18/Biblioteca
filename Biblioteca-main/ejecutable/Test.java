import javax.swing.JOptionPane;

import modelo.Biblioteca;

public class Test {
    public static void main(String[] args) {

        String nameLibro = JOptionPane.showInputDialog("Digite el nombre del libro: ");
        String nameAutor = JOptionPane.showInputDialog("Digite el nombre del autor: ");
        int anioEdition = Integer.parseInt(JOptionPane.showInputDialog("Digite el año de salida del libro: "));
        String coleccion = JOptionPane.showInputDialog("El libro: " + nameLibro + " pertenece a una colección");
        String lujo = JOptionPane.showInputDialog("El libro: " + nameLibro + " es edicion de lujo: ");

        if (coleccion.equals("si")) {
            String nameColeccion = JOptionPane.showInputDialog("Digite el nombre de la colección: ");
            int numColeccion = Integer
                    .parseInt(JOptionPane.showInputDialog("Digite el numero que ocupa en la collecion: "));
            Biblioteca miBiblioteca = new Biblioteca(nameLibro, nameAutor, anioEdition, lujo, coleccion, nameColeccion,
                    numColeccion);
            Biblioteca.organizarInformacion1();
            JOptionPane.showMessageDialog(null, ("La informacion del libro es\n" + miBiblioteca.mostrarInformación()));
        }
        if (coleccion.equals("no")) {
            Biblioteca miBiblioteca = new Biblioteca(nameLibro, nameAutor, anioEdition, lujo, coleccion);
            miBiblioteca.organizarInformacion2();
            JOptionPane.showMessageDialog(null, ("La informacion del libro es\n" + miBiblioteca.mostrarInformación()));
        }

    }
}