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
            FileWriter fw2 = new FileWriter(fp, true);
            // 処理開始宣言とその時刻を
            fw.write(f.format(c.getTime()) + "　開始！\r\n");       //\r\nは改行指令

            // 書き込み
            //Mathとは
            //Mathクラスは、指数関数、対数関数、平方根、および三角関数といった基本的な数値処理を実行するためのメソッドを含んでる
            //Mathクラスのメソッドはすべてstaticメソッドなので、new文でインスタンスを生成すること無しに使用できます
            double a = Math.sqrt(2);// aには2の平方根の値が入ります
            //ひたすら繰り返し計算  
            for(int j=1;j<10000;j++){
            for(int i=1;i<1000000000;i++){
            fw2.write((a * 100000) + "\r\n");
            }
            }

            // クローズ
            fw2.write(f.format(c.getTime()) + "　終了！\r\n");      //**********この処理では結果的に1秒も経過しな
            fw.close();
            fw2.close();
            
/*
            FileReader fr = new FileReader(fp);
            // BufferedReader作成
            BufferedReader br = new BufferedReader(fr);
            // 1行読み出し、1行につき1行の書き出し指令
            System.out.println(br.readLine());
            System.out.println(br.readLine());

            String str;
            while ((str = br.readLine()) != null) { //「読み込んだ文字列がnullでない間は」
                System.out.println(str);
            }

            br.close();*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
