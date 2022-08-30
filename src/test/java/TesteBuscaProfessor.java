import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaProfessor {

    Service service;
    BuscaProfessor buscaProfessor;

    @Before
    public void setup(){
        this.service = new MockService();
        this.buscaProfessor = new BuscaProfessor(service);
    }

    @Test
    public void testeBuscaProfessorNoturno(){
    Professor professor = buscaProfessor.busca(10);

    assertEquals("Jairo",professor.getNome());
    assertEquals("16h69",professor.getHorarioDeAtendimento());
    assertEquals("7",professor.getPeriodo());
    }

    @Test
    public void testeBuscaProfessorIntegral(){
        Professor professor = buscaProfessor.busca(0);

        assertEquals("Barbiroto",professor.getNome());
        assertEquals("16h25",professor.getHorarioDeAtendimento());
        assertEquals("0.1",professor.getPeriodo());
    }




}
