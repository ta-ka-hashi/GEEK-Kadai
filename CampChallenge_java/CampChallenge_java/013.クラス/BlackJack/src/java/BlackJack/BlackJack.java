package BlackJack;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author takahashi
 */
public class BlackJack {

    public static void main(String[] args) {
        
       //ディーラーの動作定義
        //↓↓↓↓↓↓↓↓↓↓↓↓↓
        
        Dealer d = new Dealer();

        ArrayList<Integer> dCard = d.deal();
        //~~~~~~~~~~~~~~~~~~~~   ~~~~~~~~Dealer の deal() メソッドの呼び出し
        // ↑                     　　　（ディーラーに頼んでカードを２枚引いてもらっている状態）
        // └ deal() メソッドの戻り値の型が ArrayList<Integer> なので、それに合わせている
        // 引いてきたカードを変数に格納している（一時的に保管しているイメージ。このあと setCard() メソッドを呼び出して手札に追加させる）
        d.setCard(dCard);
        d.open();

        System.out.println("ディーラーの手札は" + d.myCards);
        System.out.println("ディーラーの手札の合計値は" + d.open());
        System.out.println();

        ////ディーラーのその後の動作定義
        //合計値が17以上になるまでカードを引くようにしてある
        while (d.checkSum() == true) {
            {
                dCard = d.hit();
                d.setCard(dCard);

                d.open();
            }
            System.out.println("ディーラーの手札は17未満のためヒット");
            System.out.println("ヒット後のディーラーの手札は" + d.myCards);
            System.out.println("ヒット後のディーラーの手札の合計値は" + d.open());
            System.out.println();
        }
        System.out.println("手札が17以上のためディーラーの行動終了");
        System.out.println();

        //ここよりユーザーの動作定義
        //↓↓↓↓↓↓↓↓↓↓↓↓↓
        User u = new User();
        ArrayList<Integer> uCard = d.deal();

        u.setCard(uCard);
        u.open();

        System.out.println("ユーザーの手札は" + u.myCards);
        System.out.println("ユーザーの手札の合計値は" + u.open());
        System.out.println();

        
        //ユーザーの動作定義　合計値が21未満の場合ヒットするか否か
        while (u.checkSum() == true && u.open() < 21) {
            String action = "Hit";//ここでヒットするか否かを決める

             //ヒット時の処理
                    //現状はヒット1回で終了するようにしてある
            if (action == "Hit") {

                {
                    {
                        uCard = d.hit();
                        u.setCard(uCard);

                        u.open();
                    }
                    System.out.println("ユーザーはヒット選択");
                    System.out.println("ヒット後のユーザーの手札は" + u.myCards);
                    System.out.println("ヒット後のユーザーの手札の合計値は" + u.open());
                    System.out.println("ユーザーの行動終了");
                    System.out.println();
                    break;
                }
                /*
                System.out.println("ユーザーの行動終了");
                System.out.println();*/

            } 
            //スタンド時の処理
            else if (action == "Stand") {

                System.out.println("ユーザーはスタンド選択");
                System.out.println("ユーザーの行動終了");
                System.out.println();
                break;
            }

        }

        //以下、勝敗の判定基準
        if (u.open() > 21) {
            System.out.println("***勝者：ディーラー***");
            System.out.println("事由➡ユーザーが21を超えたため");
        } else if (d.open() > 21  ) {
            System.out.println("***勝者：ユーザー***");
            System.out.println("事由➡ディーラーが21を超えたため");
        } else if (d.open() > 21 && u.open() > 21) {
            System.out.println("***勝者：ディーラー***");
            System.out.println("事由➡両者が21を超えたため");
        } else if (d.open() == u.open()) {
            System.out.println("***引き分け***");
            System.out.println("事由➡両者、同値のため");
        } 
         else if (d.open() > u.open()) {
            System.out.println("***勝者：ディーラー***");
            System.out.println("事由➡ディーラーの手札の方が強いため");
        } else if (d.open() < u.open()) {
            System.out.println("***勝者：ユーザー***");
            System.out.println("事由➡ユーザーの手札の方が強いため");
        } else {
            System.out.println("　");
        }
    }

}
