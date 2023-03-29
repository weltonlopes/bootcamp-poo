import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("java curso");
        curso1.setDescricao("java curso descricao");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("js curso");
        curso2.setDescricao("js curso descricao");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("java mentoria");
        mentoria.setDescricao("java mentoria descricao");
        mentoria.setData(LocalDate.now());


        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        // System.out.println(devCamila.getConteudosInscritos());
        Dev devWelton = new Dev();
        devWelton.setNome("Welton");
        devWelton.inscreverBootcamp(bootcamp);
        devWelton.progredir();
        System.out.println("welton concluidos: " + devWelton.getConteudosConcluidos());

    }
}
