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
//public class Keisyo 
class Clear extends Human {

    public static void main(String[] args) {
        Clear test = new Clear();
        test.set("髙橋", 100);//仮代入
        test.Disp();
        test.Reset();//初期化実行
        test.Disp();//初期化後の表示
    }

    public void Reset() {
        set("", 0);//初期化
    }
}
