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
class User extends Human {

    public int open() {
        Integer x = 0;
        for (int i = 0; i < myCards.size(); i++) {
            x += myCards.get(i);
        }
        return x;
    }

    public void setCard(ArrayList<Integer> set) {
        while( set.size() != 0 ){
            //① set から要素を一枚取り出して、一時的な変数に代入する
            Integer a = set.remove(0);

            //② 一時的な変数を、myCards に追加する           
            myCards.add(a);            
        }
    }

    //プレイヤーは21を超えなければ何回でもヒットすることができる
    public boolean checkSum() {
        if (open() < 21) {
            return true;
        } else {
            return false;
        }

    }

}
