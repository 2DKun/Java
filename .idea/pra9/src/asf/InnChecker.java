package asf;

import java.math.BigInteger;
import java.util.Scanner;

public class InnChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Введите номер ИНН");
            try{
                BigInteger inn =  new BigInteger(sc.nextLine());
                checkInn(inn);
                break;
            }catch (InnNotValidException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен!");
    }

    public static boolean checkInn(BigInteger inn) throws InnNotValidException{
        int i = 0;
        BigInteger cInn = new BigInteger(inn.toByteArray()); //байтовый массив
        while (!cInn.equals(new BigInteger("0"))){ //пока есть число ИНН
            i++;
            cInn = new BigInteger(cInn.divide(new BigInteger("10")).toByteArray()); //уменьшаю длину числа
        }
        if(i != 10 && i != 12) throw new InnNotValidException(inn);
        return true;
    }
}
