package me.whiteship.java8to11;

import org.apache.juli.logging.Log;

public class innerClass {
    String name;
    Integer age;
    Long tall;
    ZipAddress zipAddress;
    static String aa = "aaa";


    public innerClass() {
        zipAddress = new ZipAddress();
    }

    public class ZipAddress {
        String address1;
        String address2;
         String aa = "b";
        public void printName(){
        }
    }
}
