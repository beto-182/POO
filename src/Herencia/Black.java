
package Herencia;


public class Black extends Pajaro{

    private String habilidad;

    public Black(String nombre, String tamanho, String alcance) {
        super(nombre, tamanho, alcance);
        this.habilidad = "Explotar";
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public void mostrarHabilidad(){
        System.out.print("es "+this.getHabilidad());
    }
    
    @Override
    public void gritoGuerra(){
        System.out.println("La explosion tirara todo");
    }

}
