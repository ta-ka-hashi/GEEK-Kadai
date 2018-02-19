/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author takahashi
 */
public class TimeStampHyouzi2 {

    public static void main(String[] args) throws Exception {

        Date a = new Date();
        // SimpleDateFormat作成
        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");

        //2015年1月1日 0時0分0秒
        Calendar c1 = Calendar.getInstance();
        c1.set(2015, 0, 1, 00, 00, 00);
        Date d1 = c1.getTime();
        System.out.println(sdf.format(d1) + "のミリ秒は" + d1.getTime());

        /*
        int HH1 = c1.get(Calendar.HOUR);
        int mm1 = c1.get(Calendar.MINUTE);
        int ss1 = c1.get(Calendar.SECOND);
         */
        //2015年12月31日 23時59分59
        Calendar c2 = Calendar.getInstance();
        c2.set(2015, 11, 31, 23, 59, 59);
        Date d2 = c2.getTime();
        System.out.println(sdf.format(d2) + "のミリ秒は" + d2.getTime());

        /*
        int HH2 = c2.get(Calendar.HOUR);
        int mm2 = c2.get(Calendar.MINUTE);
        int ss2 = c2.get(Calendar.SECOND);
         */

 /* 
        int HH = HH2 - HH1;
        int mm = mm2 - mm1;
        int ss = ss2 - ss1;
         */
        //System.out.println("時刻の差は " + HH + ":" + mm + ":" + ss);
        System.out.println("ミリ秒の差は" + (d2.getTime() - d1.getTime()));
    }
}
