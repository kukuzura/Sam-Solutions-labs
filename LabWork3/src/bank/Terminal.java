package bank;

import java.util.Scanner;

public class Terminal {


    public void menu0(Client client) {
        Scanner scan = new Scanner(System.in);
        String login,password;
        Bank bank = new Bank();
        int attemptsAmount=0;
        while (true) {
            System.out.println("1.Создание счета");
            System.out.println("2.Действия с существующим");
            switch (scan.nextInt()) {
                case 1:
                    client = bank.informationInput();
                    break;
                case 2:
                    System.out.println("Введите логин");
                    login=scan.nextLine();
                    System.out.println("Введите пароль");
                    password=scan.nextLine();
                    while(!client.user.isCorrectLoginAndPassword(login,password)&&attemptsAmount!=3) {
                        System.out.println("");
                        attemptsAmount++;
                        System.out.println("Введите логин");
                        login=scan.nextLine();
                        System.out.println("Введите пароль");
                        password=scan.nextLine();

                    }
                    if(attemptsAmount==3){
                        return;
                    }
                        System.out.println("1.Основной счет");
                        System.out.println("2.Резерный счет");
                        switch (scan.nextInt()) {
                            case 1:
                                menu1(client.basic);
                                break;
                            case 2:
                                menu1(client.reserve);
                                break;
                        }
                        attemptsAmount=0;
                        break;
            }
        }
    }

    public void menu1(Account client) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank();
        double moneyAmount;
        while (true) {
            System.out.println("1.Остаток на счете");
            System.out.println("2.Снять деньги со счета");
            System.out.println("3.Пополнить счет");
            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Остаток на счете");
                    System.out.println(client.getSum());
                    break;
                case 2:
                    System.out.println("Введите сумму для снятия");
                    moneyAmount = scan.nextDouble();
                    if (client.WithdrawMoney(moneyAmount)) {
                        System.out.println("Операция успешно проведена");
                    } else {
                        System.out.println("Ошибка: проверьте ввведеннуж сумму");
                    }
                    break;
                case 3:
                    System.out.println("Введите сумму для пополнения");
                    moneyAmount = scan.nextDouble();
                    client.sum += moneyAmount;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.clients[0]=new Client("1","1","1","1");
        bank.clients[0].user=new IEUser("user1","user1");

        bank.clients[1]=new Client("2","2","2","2");
        bank.clients[0].user=new IEUser("user2","user2");

        bank.clients[2]=new Client("3","3","3","3");
        bank.clients[2].user=new IEUser("user3","user3");

        bank.clients[3]=new Client();

        Terminal terminal=new Terminal();

        terminal.menu0(bank.clients[3]);

    }
}
