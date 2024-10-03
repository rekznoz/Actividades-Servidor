package test;

import ejercicios.Usuario;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void testUsuario() {
        Usuario u = new Usuario();
        u.setNombre("Alfonso");
        u.setDireccion("Calle 1");
        u.setTelefono("123456789");
        assert(u.getNombre().equals("Alfonso"));
        assert(u.getDireccion().equals("Calle 1"));
        assert(u.getTelefono().equals("123456789"));
    }

    @Test
    public void testUsuario2() {
        Usuario u = new Usuario();
        u.setNombre("Roberto");
        u.setDireccion("Calle 2");
        u.setTelefono("987654321");
        assert(u.getNombre().equals("Roberto"));
        assert(u.getDireccion().equals("Calle 2"));
        assert(u.getTelefono().equals("987654321"));
    }

}
