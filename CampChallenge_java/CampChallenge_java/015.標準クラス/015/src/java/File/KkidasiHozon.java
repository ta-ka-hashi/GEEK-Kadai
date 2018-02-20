/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.*;

/**
 *
 * @author takahashi
 */
//課題内容
//自己紹介の記述されたテキストファイルを作成してください。ファイルの作成は，File クラスなどを利用することによって行ってください
public class KkidasiHozon {

    public static void main(String[] args) {

        try {
            // ファイルオープン
            File fp = new File("自己紹介の記述されたテキストファイル.txt");

            // FileWriter作成
            FileWriter fw = new FileWriter(fp);
            // 自己紹介書き込み
            fw.write("俺の名前は！");
            // クローズ
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
