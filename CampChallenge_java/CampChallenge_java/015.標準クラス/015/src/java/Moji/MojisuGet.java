/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moji;

/**
 *
 * @author takahashi
 */
public class MojisuGet {

    public static void main(String[] args) {
        String adress = "ishida@gmail.com";
        System.out.println("アドレスは" + adress);

        //@の位置を探して、位置番号を変数に代入
        System.out.println("@の位置は" + adress.indexOf("@") + "番目");
        int a = adress.indexOf("@");

        // 位置番号以降を表示
        System.out.println("@以降の文字は" + adress.substring(a + 1));
        System.out.println("@以降の文字数は" + adress.substring(a + 1).length());
    }
}
