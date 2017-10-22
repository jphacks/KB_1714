package com.example.riddl.test;

/**
 * Created by rmorimoto on 2017/10/22.
 */

public class Cordinate {

    private static int OWNNUM = 100;

    public static void main(String args[]){
        Cordinate.cordinate();
    }

    static void cordinate(){
        Tops[] tops = new Tops[OWNNUM];
        for(int ti = 0; ti < OWNNUM; ti++){
            tops[ti] = new Tops();
        }
        for(int ti2 = 0; ti2 < OWNNUM; ti2++) {
            tops[ti2].set_init("black", "mode", "summer", "cotton", "aaa", "uncv");
        }
        System.out.println(tops[1].color);

    }
}
