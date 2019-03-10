package university;

public class Department {
    private String id;
    private Group groups[];

    public Department(String id,Group[] groups){
        this.id=id;
        this.groups=groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void showDepartmentInf(){
        System.out.println(" Department ID "+id);
        for(Group group:groups){
            group.showGroupInf();
        }
    }
}
