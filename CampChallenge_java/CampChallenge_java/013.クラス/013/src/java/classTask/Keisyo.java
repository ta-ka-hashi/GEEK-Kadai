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
//public class Keisyo {

    class Teacher extends Human {

        public void kougi() {
            String msg = "講師の" + this.name + "です。講義を始めます。";
            System.out.print(msg);
        }
    }
