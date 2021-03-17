
package Herencia;
import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args){

        int opc;
        Scanner in = new Scanner(System.in);
        Pajaro[] p = new Pajaro[3];

        p[0] = new Red("RED","MEDIANO","MEDIO");
        p[1] = new Black("BOMB","GRANDE","MEDIO");
        p[2] = new Purple("GALE","MEDIANO","PEQUEÑO");

        do{
            System.out.print("1.-Red. 2.-Bomb. 3.-Purple \nQue AngryBird quiere usar:");
        opc = in.nextInt();
        
        switch (opc) {
            case 1:
                System.out.print("Hola me llamo "+p[0].getNombre()+" mi tamaño es "+p[0].getTamanho()+" tengo un alcance "+p[0].getAlcance());
                p[0].mostrarHabilidad();
                p[0].gritoGuerra();
                break;
            case 2:
                System.out.print("Hola me llamo "+p[1].getNombre()+" mi tamaño es "+p[1].getTamanho()+" tengo un alcance "+p[1].getAlcance()+" y mi habilidad");
                p[1].mostrarHabilidad();
                p[1].gritoGuerra();
                break;
            case 3:
                System.out.print("Hola me llamo "+p[2].getNombre()+" mi tamaño es "+p[2].getTamanho()+" tengo un alcance "+p[2].getAlcance()+" y mi habilidad");
                p[2].mostrarHabilidad();
                break;
            case 4:
                System.out.println("NOS VEMOS");
                break;
            default:
                System.out.println("Opcion Invalida");
        }
        }while(opc != 4);
        
        
    }
        
}
