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
public class main {

    public static void main(String[] args) {
        //クラスのインスタンス生成
        Human Class = new Human();
        // インスタンスのフィールドへ値設定
        Class.birth = 40;
        Class.set("髙橋", 5);
        //hito.birth = 40;
        // インスタンスのメソッドを利用
        System.out.println("氏名　：" + Class.name);
        System.out.println("生誕　：" + Class.birth);
    }
}
