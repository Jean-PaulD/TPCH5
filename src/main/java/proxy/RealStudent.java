package proxy;

/**
 * Created by Jean-Paul D on 2017-04-02.
 */
public class RealStudent  implements Student {

    String studentDetails;

    public RealStudent(String studentDetails){

        this.studentDetails = studentDetails;
        loadFromDB(studentDetails);
    }

    @Override
    public String showStudentNumber() {
      return "Displaying: "+studentDetails;
    }

    public String loadFromDB(String studentDetails){
        return "Loading: "+ studentDetails;
    }
}
