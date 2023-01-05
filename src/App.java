import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Curso cursoDeJava = new Curso();
        cursoDeJava.setTitulo("Curso de Java");
        cursoDeJava.setDescricao("Curso completo de Java 11");
        cursoDeJava.setCargaHoraria(8);
        System.out.println(cursoDeJava);

        Curso cursoDePython = new Curso();
        cursoDePython.setTitulo("Curso de Python");
        cursoDePython.setDescricao("Curso completo de Python com Django");
        cursoDePython.setCargaHoraria(10);
        System.out.println(cursoDePython);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria sobre a linguagem java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}
