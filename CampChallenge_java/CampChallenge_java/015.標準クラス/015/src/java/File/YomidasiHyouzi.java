/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

/**
 *
 * @author takahashi
 */
public class YomidasiHyouzi {

    public static void main(String[] args) {

        try {
            // ファイルオープン
            File fp = new File("自己紹介の記述されたテキストファイル.txt");

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
