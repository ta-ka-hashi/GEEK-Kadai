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
        test.set("髙橋", 100);
        test.Disp();
        test.ClearDisplay();
        test.Disp();
    }

    public void ClearDisplay() {
      //  Clear test = new Clar();e
        set("", 0);
        
    }
}
