package leccion04Folder;

import javax.swing.JOptionPane;

public class objectAuto {

    public int id;
    public int anno;
    public String marca;
    public String color;

    public objectAuto() {
        this.id = 0;
        this.anno = 0;
        this.color = "";
        this.marca = "";
    }

    public void agregarAuto() {

        String idlectura = JOptionPane.showInputDialog("El nombre");
        id = Integer.parseInt(idlectura);
        mostrar(idlectura);
    }

    public void mostrar(String id) {
        JOptionPane.showMessageDialog(null,""+id);
    }
    
    

}
