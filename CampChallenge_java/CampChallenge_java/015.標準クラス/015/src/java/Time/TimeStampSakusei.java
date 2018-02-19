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
public class TimeStampSakusei {

    //課題内容
    //2016年11月4日 10時0分0秒」の情報を持つタイムスタンプ（ミリ秒）を生成し，画面に表示
    //さらにこの情報を「2016-11-04 10:00:00」の形式で画面に表示
    public static void main(String[] args) throws Exception {

        //現在時刻取得 のちに時刻上書き
        Calendar c = Calendar.getInstance();
        c.set(2016, 10, 4, 10, 00, 00);

        Date d = c.getTime();
        System.out.println("ミリ秒は" + d.getTime());

        //Format作成 そして時刻代入
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(f.format(c.getTime()));

    }

}
