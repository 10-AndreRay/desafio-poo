import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        Curso cursoDeJava = new Curso();
        cursoDeJava.setTitulo("Curso de Java");
        cursoDeJava.setDescricao("Curso completo de Java 11");
        cursoDeJava.setCargaHoraria(8);

        Curso cursoDePython = new Curso();
        cursoDePython.setTitulo("Curso de Python");
        cursoDePython.setDescricao("Curso completo de Python com Django");
        cursoDePython.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria sobre a linguagem java");
        mentoria.setData(LocalDate.now());

        Bootcamp orangeTech = new Bootcamp();
        orangeTech.setNome("Orange Tech + Backend");
        orangeTech.setDescricao("Bootcamp da DIO com a Inter");
        orangeTech.getConteudos().add(cursoDeJava);
        orangeTech.getConteudos().add(cursoDePython);
        orangeTech.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Manoel");

        Dev dev2 = new Dev();
        dev2.setNome("Manuela");

        dev1.inscreverBootcamp(orangeTech);
        dev2.inscreverBootcamp(orangeTech);

        System.out.println(dev1.getConteudosInscritos());
        dev1.progredir();

        System.out.println(dev2.getConteudosInscritos());
        dev2.progredir();

        System.out.println(dev1.getConteudosConcluidos());
        System.out.println(dev2.getConteudosConcluidos());
    }
}
