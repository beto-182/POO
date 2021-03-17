
package Herencia;


public class Pajaro {

    private String nombre, tamanho, alcance;

    public Pajaro(String nombre, String tamanho, String alcance) {
        this.nombre = nombre;
        this.tamanho = tamanho;
        this.alcance = alcance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }


    public void mostrarHabilidad(){
        System.out.print(" No tengo habilidad especial ");

    }
    
    public void gritoGuerra(){

    System.out.println("Los derrotare a todos");

}

}
