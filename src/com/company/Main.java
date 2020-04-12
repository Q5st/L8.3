package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Name[] arrName = new Name[3];
        arrName[0] = new Name("dfgsgdb42_523tagadfggadfgadfgagagfadgfagdfg");
        arrName[1] = new Name("dfgsgdb42_523tag@");
        arrName[2] = new Name("df42_3tag");

        String pattern = "[a-z0-9_]+";
        Pattern p = Pattern.compile(pattern);

        for (int i=0; i<arrName.length; i++){
            Matcher m = p.matcher(arrName[i].name);
            if (m.matches()==true && arrName[i].length()==true){System.out.println(true);}
            else {System.out.println(false);}
        }
    }
}

class Name{
    public String name;
    public int lng;
    public boolean less;
    public boolean more;

    public Name(String name){
        this.name = name;
    }

    public boolean length() {
        lng = this.name.length();
        if (lng<3 || lng>15){return false;}
        else{return true;}
    }
}
