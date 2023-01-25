package com.example.newadmin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comptime {


    public Boolean ischeck() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse("2022-12-01");
        Date d2 = sdf.parse("2023-5-28");
        System.out.println("d1=d2时,before函数:" + d1.before(d2));
        System.out.println("d1=d2时,after函数:" + d1.after(d2));

        d1 = sdf.parse("2019-5-28");
        d2 = sdf.parse("2019-5-29");
        System.out.println("d1<d2时,before函数:" + d1.before(d2));
        System.out.println("d1<d2时,after函数:" + d1.after(d2));

        d1 = sdf.parse("2019-5-28");
        d2 = sdf.parse("2019-5-27");
        System.out.println("d1>d2时,before函数:" + d1.before(d2));
        System.out.println("d1>d2时,after函数:" + d1.after(d2));

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date s1 = sdf1.parse("2019-5-28 12:30:25");
        Date s2 = sdf1.parse("2019-5-28 12:31:25");
        System.out.println("s1.before(s2) = " + s1.before(s2));
        return true;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(new Comptime().ischeck());
    }
}
