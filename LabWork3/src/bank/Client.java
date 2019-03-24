package bank;

public class Client {
    String surname;
    String name;
    String patronymic;
    String passport;

    IEUser user;

    Account basic;
    Account reserve;

    Client(String surname, String name, String patronymic, String passport){
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
        this.passport=passport;
        user=new IEUser("","");
        basic=new Account(0,0);
        reserve=new Account(0,0);
    }

    Client(){
        user=new IEUser("","");
        basic=new Account(0,0);
        reserve=new Account(0,0);

    }

    public void setLoginAndPassword(String userName,String password){
        user.password=password;
        user.userName=userName;
    }

    public IEUser getUser(){
        return this.user;
    }

    public Account getBasic() {
        return basic;
    }

    public Account getReserve() {
        return reserve;
    }
}
