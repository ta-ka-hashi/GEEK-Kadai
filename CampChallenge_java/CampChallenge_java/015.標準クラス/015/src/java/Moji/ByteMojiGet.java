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
public class ByteMojiGet {

    public static void main(String[] args) {
        String name = "髙橋勇大";

        // 文字列の長さを表示 -- 9
        System.out.println(name);
        System.out.println("文字数は" + name.length());
        System.out.println("バイト数は" + name.getBytes().length);

    }
}
