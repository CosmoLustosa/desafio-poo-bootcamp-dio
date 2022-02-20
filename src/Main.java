import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso(); //cria um curso
        curso.setDescricao("Aprenda Java 11 do Zero ao Essencial");
        curso.setTitulo("Java");
        curso.setCargaHoraria(360);

        Curso mentoria = new Curso(); //cria um curso
        mentoria.setDescricao("Mentoria Python");
        mentoria.setCargaHoraria(26);
        mentoria.setTitulo("Python");

        Curso c3 = new Curso();
        c3.setTitulo("Git");
        c3.setDescricao("GitHub Avançado");
        c3.setCargaHoraria(30);

        Curso c4 = new Curso();
        c4.setTitulo("JS");
        c4.setDescricao("JS Avançado");
        c4.setCargaHoraria(36);

        Curso c5 = new Curso();
        c5.setTitulo("Docker");
        c5.setDescricao("Docker Avançado");
        c5.setCargaHoraria(34);

        BootCamp bootjava = new BootCamp();// cria o bootcamp
        bootjava.setNome("BootCamp Java Developer");
        bootjava.setDescricao("Inicie sua carreira java");
        bootjava.getConteudos().add(curso);
        bootjava.getConteudos().add(mentoria);
        bootjava.getConteudos().add(c3);
        bootjava.getConteudos().add(c4);
        bootjava.getConteudos().add(c5);

        BootCamp python = new BootCamp();// cria o bootcamp
        python.setNome("BootCamp Python Developer");
        python.setDescricao("Inicie sua carreira Python");
        python.getConteudos().add(mentoria);
        python.getConteudos().add(curso);
        python.getConteudos().add(c3);
        python.getConteudos().add(c4);
        python.getConteudos().add(c5);

        Dev cosmo = new Dev(); // cria o dev cosmo
        cosmo.setNome("Cosmo Lustosa");
        cosmo.inscreverBootCamp(bootjava);
        System.out.println("Inscrições do Cosmo: " + cosmo.getConteudoInscritos());
        cosmo.progredir(); //progredi no curso!
        cosmo.progredir(); //progredi no curso!
        cosmo.progredir(); //progredi no curso!
        System.out.println("Cursos concluidos: " + cosmo.getConteudoConcluido());
        System.out.println("Inscrições do Cosmo: " + cosmo.getConteudoInscritos());
        System.out.println("XP: " + cosmo.calcularTotalXP());


        Dev ana = new Dev(); //cria a dev ana
        ana.setNome("Ana Parbath");
        ana.inscreverBootCamp(python);
        System.out.println("Inscrições do Ana: " + ana.getConteudoInscritos());
        ana.progredir();//progredi no curso
        ana.progredir();//progredi no curso
        System.out.println("Cursos concluidos: " + ana.getConteudoConcluido());
        System.out.println("Inscrições do Ana: " + ana.getConteudoInscritos());
        System.out.println("XP: " + ana.calcularTotalXP());

    }
}
