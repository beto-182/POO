
package Herencia;



public class Purple extends Pajaro{

    private String habilidad;

    public Purple(String nombre, String tamanho, String alcance) {
        super(nombre, tamanho, alcance);
        this.habilidad = "DEBILITAR";
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public void mostrarHabilidad(){
        System.out.println("es "+this.getHabilidad());
    }
    
    

}