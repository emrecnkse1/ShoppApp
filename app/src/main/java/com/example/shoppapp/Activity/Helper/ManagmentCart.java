package com.example.shoppapp.Activity.Helper;

import android.content.Context;

import com.example.shoppapp.Activity.Domain.PopularDomain;

import java.util.ArrayList;

public class ManagmentCart {
    private Context context ;
    private TinyDB tinyDB;

    public ManagmentCart(Context context) {
        this.context = context;
        this.tinyDB=new TinyDB(context);
    }

    public void insertFood(PopularDomain item) {

        ArrayList<PopularDomain> listPop=getListcart();

        boolean exisAlready = false ;
        int n=0 ;
        for (int  i=0 ; i < listPop.size();i++){
            if (listPop.get(i).getTitle().equals(item.getTitle())){

            }
        }


    }

    private ArrayList<PopularDomain> getListcart() {
        return tinyDB.getListObject("CartList");
    }

}
