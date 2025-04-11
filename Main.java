public class Main {
    public static void main(String[] args) {

        Administrador admin = new Administrador(1, "Laura Admin", "admin@biblioteca.com");

        Cliente cliente = new Cliente(2, "Carlos Cliente", "carlos@mail.com");

        admin.registrarCliente(cliente);

        Libro libro = new Libro("123-ABC", "El Principito", "Antoine de Saint-Exupéry");

        admin.registrarLibro(libro);

        admin.realizarPrestamo(cliente, libro);

        admin.realizarPrestamo(cliente, libro);

        Prestamo prestamo = new Prestamo(libro, cliente);
        prestamo.entregar();
        System.out.println("Estado del préstamo: entregado");

        admin.realizarPrestamo(cliente, libro);
    }
}

