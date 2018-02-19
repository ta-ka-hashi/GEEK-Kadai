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
public class TimeStampHyouzi {

    //課題内容
    //2016年11月4日 10時0分0秒のタイムスタンプを作成し、「年-月-日 時:分:秒」で表示
    public static void main(String[] args) throws Exception {

        //現在時刻取得 のちに時刻上書き
        Calendar c = Calendar.getInstance();
        c.set(2016, 10, 4, 10, 00, 00);
        System.out.println((c.getTime()));

        //フォーマット作成
        SimpleDateFormat f = new SimpleDateFormat("yyyy年-MM月-dd日 HH時:mm分:ss秒");
        System.out.println(f.format(c.getTime()));

    }
}
