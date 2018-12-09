package com.dicoding.assosiate.myapplication;

import android.net.Uri;

import java.util.ArrayList;

public class TestPresidentData {
    public static String[][] data = new String[][]{
            {"Ramdan Riawan", "Mahasiswa", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.ramdanriawan).toString()},
            {"Eka Pradana", "Mahasiswa", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.eka_pradanaa).toString()},
            {"Sukaesih", "IRT", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.ibuk_ekaa).toString()},
            {"Ecepman", "Pegawai swasta", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.bapak_ekaa).toString()},
            {"Ngadri", "Supir", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.ngadri).toString()},
            {"Sophia", "Pelajar", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.sophia).toString()},
            {"Mustopa", "Pelajar", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.mustopa).toString()}
    };

    public static ArrayList<President> getListData(String nama){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        president = new President();

        if(nama == "Ramdan Riawan")
        {
            president.setName(data[0][0]);
            president.setRemarks(data[0][1]);
            president.setPhoto(data[0][2]);
        }
        else if(nama == "Eka Pradana")
        {
            president.setName(data[1][0]);
            president.setRemarks(data[1][1]);
            president.setPhoto(data[1][2]);
        }
        else if(nama == "Sukaesih")
        {
            president.setName(data[2][0]);
            president.setRemarks(data[2][1]);
            president.setPhoto(data[2][2]);
        }
        else if(nama == "Ecepman")
        {
            president.setName(data[3][0]);
            president.setRemarks(data[3][1]);
            president.setPhoto(data[3][2]);
        }
        else if(nama == "Ngadri")
        {
            president.setName(data[4][0]);
            president.setRemarks(data[4][1]);
            president.setPhoto(data[4][2]);
        }
        else if(nama == "Sophia")
        {
            president.setName(data[5][0]);
            president.setRemarks(data[5][1]);
            president.setPhoto(data[5][2]);
        }
        else if(nama == "Mustopa")
        {
            president.setName(data[6][0]);
            president.setRemarks(data[6][1]);
            president.setPhoto(data[6][2]);
        }

        list.add(president);

        return list;
    }
}
