package university;

public class Group {
    private String id;
    private Student prefect;
    private Student[] students;

    Group(String id,Student prefect,Student[] students){
        this.id=id;
        this.prefect=prefect;
        this.students=students;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrefect(Student prefect) {
        this.prefect = prefect;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getId() {
        return id;
    }

    public Student getPrefect() {
        return prefect;
    }

    public Student[] getStudents() {
        return students;
    }

    public void showGroupInf(){
        System.out.println("ID: "+id);
        prefect.showStudentInf();
        for(Student student:students){
            student.showStudentInf();
        }
    }
}
