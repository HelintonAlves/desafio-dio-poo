import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo POO com Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Aprendendo Javascript");
        curso2.setCargaHoraria(16);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Auxiliando alunos do curso Java");
        mentoriaJava.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoriaJava);
         */

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Java Developer");
        bootCamp.setDescricao("Desenvolvendo com Java");
        bootCamp.getConteudoSet().add(curso1);
        bootCamp.getConteudoSet().add(curso2);
        bootCamp.getConteudoSet().add(mentoriaJava);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdo Inscrito: " + dev1.getConteudoSetInscrito());
        dev1.progredir();
        System.out.println("Conteúdo Inscrito: " + dev1.getConteudoSetInscrito());
        System.out.println("Conteúdo concluído: " + dev1.getConteudoSetConcluido());
        System.out.println("XP: " + dev1.caluclarTotalXp());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        Dev dev2 = new Dev();
        dev1.setNome("Helinton");
        dev2.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdo Inscrito: " + dev2.getConteudoSetInscrito());
        dev2.progredir();
        System.out.println("Conteúdo Inscrito: " + dev2.getConteudoSetInscrito());
        System.out.println("Conteúdo concluído: " + dev2.getConteudoSetConcluido());
        System.out.println("XP: " + dev2.caluclarTotalXp());


    }
}