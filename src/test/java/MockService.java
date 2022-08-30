public class MockService implements Service{


    @Override
    public String busca(int id){
        if (id ==10){

            return ProfessorConst.PROFESSOR_NOTURNO;
        }
        return ProfessorConst.PROFESSOR_INTEGRAL;





    }


}
