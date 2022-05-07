package com.offcn.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
   private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    //字符串转日期
    public static Date StringToDate(String ste){

        Date date = null;
        try {
            date = sdf.parse(ste);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  date;
    }
    //日期转字符串
    public static String DateToString(Date date){
       return sdf.format(date);
    }

}
