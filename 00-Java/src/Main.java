import ejercicios.Calculadora;
import ejercicios.Conversion;
import ejercicios.Operaciones;
import ejercicios.Usuario;

public class Main {
    public static void main(String[] args) {

        int x = 144;
        int y = 999;

        // Operaciones
        System.out.println(x);
        System.out.println(y);
        System.out.println("Suma " + Operaciones.sumar(x, y));
        System.out.println("Resta " + Operaciones.restar(x, y));
        System.out.println("Multiplicacion " + Operaciones.multiplicar(x, y));
        System.out.println("Division " + Operaciones.dividir(x, y));

        // Usuario
        Usuario usuario = new Usuario();
        usuario.setNombre("Rafael");
        usuario.setDireccion("Calle Falsa 123");
        usuario.setTelefono("123456789");
        System.out.println("Nombre " + usuario.getNombre());
        System.out.println("Direccion " + usuario.getDireccion());
        System.out.println("Telefono " + usuario.getTelefono());

        // Conversor
        double euros = 100;
        double pesetas = 1000;
        System.out.println("Euros a pesetas " + Conversion.eurosAPesetas(euros));
        System.out.println("Pesetas a euros " + Conversion.pesetasAEuros(pesetas));

        // Calculadora
        Calculadora calculadora = new Calculadora();
        calculadora.baseImponible = 100;
        System.out.println("Total " + calculadora.calcularTotal());

    }
}