package pac.ex6;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
        try {  String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key){
        if(key == "") {
            try {
                throw new Exception( "Key set to empty string" );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo td = new ThrowsDemo();
        try {
            td.getKey();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}