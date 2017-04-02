package proxy;

/**
 * Created by Jean-Paul D on 2017-04-02.
 */
public class ProxyStudent implements Student {

    private RealStudent realStudent;
    private String studentDetails;

    public ProxyStudent(String studentDetails){
        this.studentDetails = studentDetails;
    }

    @Override
    public String showStudentNumber() {
            if(realStudent == null){
                realStudent = new RealStudent(studentDetails);
            }
        return realStudent.showStudentNumber();
    }
}
