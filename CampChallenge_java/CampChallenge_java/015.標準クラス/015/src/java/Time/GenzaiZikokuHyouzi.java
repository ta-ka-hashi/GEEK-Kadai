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
public class GenzaiZikokuHyouzi {

    //課題内容
    //現在の日時を「1988年5月21日 1時23分45秒」といった形式で表現
    public static void main(String[] args) throws Exception {

        //現在時刻取得
        Calendar c = Calendar.getInstance();
        System.out.println((c.getTime()));

        // SimpleDateFormat作成　時刻データ引き渡し
        SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        System.out.println(f.format(c.getTime()));

    }
}
