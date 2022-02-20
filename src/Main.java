import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setDescricao("Aprenda Java 11 do Zero ao Essencial");
        curso.setTitulo("Java");
        curso.setCargaHoraria(360);
        System.out.println(curso);

    }
}
