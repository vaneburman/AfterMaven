import CoderPOO.clases.Tutor;
import EjemploClaseAbstracta.Rectangulo;
import paisesDesafio.Paises;


public class Ejemplo {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Tutor tutor = new Tutor(1, "Vane", "Burman");
        System.out.println(tutor.getNombre());

        Rectangulo rectangulo = new Rectangulo("rectangulo");
        rectangulo.dibujar();

        //agregar un mensaje con log4j

        Mensaje mensaje = new Mensaje();
        mensaje.getLogError("Error en el progra paises = new Paises();ma");

        Paises pais = new Paises(1, "Argentina", 54);
        System.out.println(pais.getNombre());

    }
}
