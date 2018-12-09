package com.dicoding.assosiate.myapplication;

import android.net.Uri;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String[][]{
            {"Ramdan Riawan", "Mahasiswa", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.ramdanriawan).toString()},
            {"Eka Pradana", "Mahasiswa", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.eka_pradanaa).toString()},
            {"Sukaesih", "IRT", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.ibuk_ekaa).toString()},
            {"Ecepman", "Pegawai swasta", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.bapak_ekaa).toString()},
            {"Ngadri", "Supir", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.ngadri).toString()},
            {"Sophia", "Pelajar", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.sophia).toString()},
            {"Mustopa", "Pelajar", Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +R.drawable.mustopa).toString()},
    };

    public static ArrayList<President> getListData(){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            president = new President();
            president.setName(data[i][0]);
            president.setRemarks(data[i][1]);
            president.setPhoto(data[i][2]);

            list.add(president);
        }

        return list;
    }
}
