package university;

public class University {
    Department[] departments;

    University(Department[] departments){
        this.departments=departments;
    }

    public void showAllDepartments(){
        for(Department dep:departments){
            dep.showDepartmentInf();
        }
    }

    public void studentSearch(String surname){
        for(Department dep:departments){
            for(Group group:dep.getGroups()){
                for(Student student:group.getStudents()){
                    if(surname==student.getSurname()){
                        student.showStudentInf();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] students=new Student[6];
        students[0]=new Student("1","1","1","1");
        students[1]=new Student("2","2","2","2");
        students[2]=new Student("3","3","3","3");
        students[3]=new Student("4","4","4","4");
        students[4]=new Student("5","5","5","5");
        students[5]=new Student("6","6","6","6");
        Group[] groups=new Group[3];
        groups[0]=new Group("1",students[0],students);
        groups[1]=new Group("2",students[1],students);
        groups[1]=new Group("3",students[2],students);
        Department dep[]=new Department[1];
        dep[0]=new Department("1",groups);

        University univ=new University(dep);
        univ.showAllDepartments();

        //University university=new University()
    }

}
