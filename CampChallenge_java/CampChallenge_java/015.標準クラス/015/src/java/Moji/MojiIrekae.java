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
public class MojiIrekae {

    public static void main(String[] args) {
        String X = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        System.out.println(X);

        X = X.replace("I", "い");//余分
        X = X.replace("U", "う");//余分
        System.out.println("文字化け変換後↓");
        System.out.println(X.replace("I", "い").replace("U","う" ));

    }

}
