package util;

public class Utility {
    public String formatMoney(int moneyAmount) {
        if (moneyAmount % 10 == 1 && moneyAmount != 11) {
            return "рубль";
        }
        if ((moneyAmount % 10 == 2 | moneyAmount % 10 == 3 | moneyAmount % 10 == 4) && moneyAmount != 12 && moneyAmount != 13 && moneyAmount != 14) {
            return "рубля";
        } else return "рублей";
    }


    public String isLeapYear(int year) {
        if(year%100==0&&year%400!=0){
            return "не високосный";
        }
        else return "високосный";
    }

    public int[] linearizeArray(int [][] matrix,int rows,int columns){
        int[] array= new int[rows*columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                array[i*j+j]=matrix[i][j];
            }
        }
        return array;
    }
}
