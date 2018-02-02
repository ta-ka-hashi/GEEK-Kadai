/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classTask;

/**
 *
 * @author takahashi
 */
public class Human {

    // フィールドの宣言
    public String name = "";
    public int number = 0;

    // メソッドの宣言
    public void set(String n, int a) {
        // 引数をフィールドへ設定
        this.name = n;
        this.number = a;
    }
}
