package curso

class Curso {

    String nombre;
    String descripcion;

    static constraints = {

        nombre(blank: false);
        descripcion(blank:  false);

    }
}
