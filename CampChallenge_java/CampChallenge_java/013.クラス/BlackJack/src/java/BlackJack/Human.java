package BlackJack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author takahashi
 */
public abstract class Human {

    //例えば「カードの２番目の数字が４だった」という場合であれば，「２」が int 型，「４」が Integer型となります。
    //手札
    //UserとDealerの持つ手札情報
    //手札の一枚一枚は整数で表現
    ArrayList<Integer> myCards = new ArrayList<Integer>();

    //手札(myCards)の合計値を計算する
    //ﾒｿｯﾄﾞの戻り値は手札の合計値
    public abstract int open();

    //引いたカード情報を手札(myCards)に追加する
    public abstract void setCard(ArrayList<Integer> set);

    //手札の合計値(open)を確認し、まだカードが必要ならtrue、必要無ければfalseを返却する
    public abstract boolean checkSum();

    Human() {
    }

}
