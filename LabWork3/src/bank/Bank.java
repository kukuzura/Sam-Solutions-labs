package bank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {
    Client clients[];
    double commission;

    Bank() {
        clients = new Client[4];
        clients[0]=new Client();
        clients[1]=new Client();
        clients[2]=new Client();
        clients[3]=new Client();
        commission = 1.3;
    }

    public boolean isUniqueLogin(String login) {
        boolean flag = true;
        for (int i=0;i<clients.length;i++) {
            {
                if ((clients[i].user.userName == login)) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public Client informationInput(){
        Client client;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите фамилию");
        String surname=scan.nextLine();
        System.out.println("Введите имя");
        String name=scan.nextLine();
        System.out.println("Введите отчество");
        String patronymic=scan.nextLine();
        System.out.println("Введите номер паспорта");
        String passpotr=scan.nextLine();

        String login=loginInputAndCheck();
        System.out.println("Введите пароль");
        String password=scan.nextLine();

        client=new Client(surname,name,patronymic,passpotr);
        client.user.password=password;
        client.user.userName=login;

        return client;
    }

    public String loginInputAndCheck(){
        Scanner scan = new Scanner(System.in);
        String login;
        System.out.println("Введите имя пользователя");
        login = scan.nextLine();

        while (!isUniqueLogin(login)) {
            System.out.println("Такое имя пользователя уже есть");
            System.out.println("Введите новое");
            login = scan.nextLine();

        }

        return login;

    }

    public void basicAccountCreation(Client client) {

        client.basic.accountId = (int) Math.round(Math.random() * 1000);
        client.basic.sum = 0;
    }

    public void reserveAccountCreation(Client client) {

        client.reserve.accountId = (int) Math.round(Math.random() * 1000);
        client.reserve.sum = 0;

    }
}