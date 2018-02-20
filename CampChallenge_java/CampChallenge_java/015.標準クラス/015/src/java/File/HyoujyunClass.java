/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

/**
 *
 * @author takahashi
 */
public class HyoujyunClass {

    public static void main(String[] args) {

        try {
            //*****ファイル作成
            // ファイルオープン
            File fp = new File("トータル課題.txt");

            //*******初期設定段階******************
            //現在時刻取得
            Calendar c = Calendar.getInstance();
            //時刻Format作成
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            // FileWriter作成
            FileWriter fw = new FileWriter(fp);
            // 処理開始宣言とその時刻を
            fw.write(f.format(c.getTime()) + "　開始！\r\n");       //\r\nは改行指令
            // クローズ
            fw.close();

            // FileWriter作成 -- 追記モード
            FileWriter fw2 = new FileWriter(fp, true);
            // 書き込み

            if (c.get(Calendar.SECOND) == 0) {
                for (int i = 1; 1 < 5; i++) {
                    fw.write("０\r\n");
                }
            }

            // クローズおよび終了宣言
            if (c.get(Calendar.SECOND) == 10) {

                fw2.write(f.format(c.getTime()) + "　終了！\r\n");
                fw2.close();
            }

            //ファイル読み出し
            FileReader fr = new FileReader(fp);
            // BufferedReader作成
            BufferedReader br = new BufferedReader(fr);
            // 1行読み出し
            System.out.print(br.readLine());

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
