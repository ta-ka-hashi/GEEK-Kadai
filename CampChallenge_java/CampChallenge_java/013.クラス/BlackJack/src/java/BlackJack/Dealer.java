package BlackJack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author takahashi
 */
import java.util.Random;
import java.util.ArrayList;

// Dealer クラスは抽象クラスではない
public class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<Integer>();

    //OK
    public Dealer() {

        //cards = new ArrayList<Integer>();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                
                //カード値が10以上ならば、値を10として要素に加える
                if(j>=10){
                    cards.add(10);
                }
                //カード値が10より低ければ、値をそのまま要素に加える
                else {
                cards.add(j);
                }
            }
        }

    }

//cardsからランダムで2枚のカードをArrayListにして返却
    public ArrayList deal() {

        // 返却用の変数（ArrayList<Integer>）を作成して、そこに add していく
        ArrayList<Integer> dealCard = new ArrayList<Integer>();
        //乱数取得
        Random rand = new Random();

        // 山札の要素数を利用して、「0 ～ 要素数」の値を乱数で取得する
        // 取得した乱数で要素番号を指定して、山札からカードを１枚ずつ引く
        // → get と remove の違いについて調べてみましょう
        Integer draw1 = rand.nextInt(cards.size());
        cards.remove(draw1);
        int draw11 = cards.get(draw1);

        Integer draw2 = rand.nextInt(cards.size());
        cards.remove(draw2);
        int draw22 = cards.get(draw2);

        dealCard.add(draw11);
        dealCard.add(draw22);

        // 返却用の ArrayList を return する
        return dealCard;
    }

    //cardsからランダムで1枚のカードをArrayListにして返却
    public ArrayList hit() {
        // 考え方は deal() と同様
        // ただし、hit() は deal() と異なり１枚だけ add すればOK

        ArrayList<Integer> hitCard = new ArrayList<Integer>();
        //乱数取得
        Random rand = new Random();

        Integer draw3 = rand.nextInt(this.cards.size());
        cards.remove(draw3);
        int draw33 = cards.get(draw3);

        hitCard.add(draw33);

        // 返却用の ArrayList を return する
        return hitCard;
    }

    public int open() {
        Integer x = 0;
        for (int i = 0; i < myCards.size(); i++) {
            x += myCards.get(i);
        }
        return x;
    }

    public void setCard(ArrayList<Integer> set) {
        // .size() : ArrayList の要素数を戻り値とする
        // set.size() : 「set」という変数名のArrayListの要素数を戻り値とする
        // ^^^引札（１枚のときと、２枚のときとがある）

        // for(int i = 0 ; i< set.size() ; i++){ ...
        //                   ^^^^^^^^^^^引札の数
        // 引き札の数に応じて、{ ... } の処理を１回か２回行うということ        
        /*for (int i = 0; 0 < set.size(); i++) {

            //① set から要素を一枚取り出して、一時的な変数に代入する
            Integer a = set.get(i);

            //② 一時的な変数を、myCards に追加           
            myCards.add(a);
        }*/
        while (set.size() != 0) {
            //① set から要素を一枚取り出して、一時的な変数に代入する
            Integer a = set.remove(0);

            //② 一時的な変数を、myCards に追加する           
            myCards.add(a);
        }
    }

    //自分の手が17以上になるまでカードを引かなければならず、17以上になったら、その後は追加のカードを引くことはできない
    public boolean checkSum() {
        if (open() <= 17) {
            return true;
        } else {
            return false;
        }
    }
}
