package university;

public class Student {
    private String name;
    private String surname;
    private String phoneNumber;
    private String group;

    public Student(String name,String surname,String phoneNumber,String group){
        this.name=name;
        this.surname=surname;
        this.phoneNumber=phoneNumber;
        this.group=group;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void showStudentInf(){
        System.out.println("Ф.И.:"+ surname+name);
        System.out.println("Номер телефона:"+phoneNumber);
        System.out.println("Номер группы:"+group);
    }
}
