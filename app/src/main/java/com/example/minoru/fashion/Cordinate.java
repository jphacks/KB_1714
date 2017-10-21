package com.example.minoru.fashion;

import com.example.minoru.fashion.clothes.botoms;
import com.example.minoru.fashion.clothes.shoes;
import com.example.minoru.fashion.clothes.tops;

import java.util.ArrayList;

/**
 * Created by minoru on 2017/10/21.
 */

public class Cordinate {
    private ArrayList<tops> choiceTops = new ArrayList<tops>();
    private ArrayList<botoms> choiceBotoms = new ArrayList<botoms>();
    private ArrayList<shoes> choiceShoes = new ArrayList<shoes>();

    Cordinate(){

    }

    private void set(int num){
        choiceTops.get(num).set();
        choiceBotoms.get(num).set();
        choiceShoes.get(num).set();
    }

    private void result(){

    }

}
