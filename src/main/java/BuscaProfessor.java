import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaProfessor {

    Service service;

    public BuscaProfessor(Service service) {
        this.service = service;
    }


    public Professor busca(int id){
        String professorJson = service.busca(id);

        JsonObject jsonObject = JsonParser.parseString(professorJson).getAsJsonObject();

        return new Professor(
                jsonObject.get("nome").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString()
        );

    }


}

