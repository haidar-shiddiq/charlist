package com.omellete.charlist;

import java.util.ArrayList;

public class character {
    private static String[] charNames = {
            "Franklin",
            "Michael",
            "Trevor",
            "Lester",
            "Dave",
            "Devin",
            "Agent 14",
            "Avon",
            "Martin",
            "Chop"
    };

    private static String[] charDetails = {
            "Seorang pekerja serabutan di daerah Los Santos. Hidupnya berubah setelah ia bertemu Michael.",
            "Seorang 'pensiunan' kriminal. Berkat rencananya untuk menghianati temannya, ia kini hidup di mansion mewah di Los Santos.",
            "'Partner in crime'nya Michael di masa lalu. Hanya ia yang selamat dari ulah Michael. Mentalnya agak 'Tidak Stabil'.",
            "Meskipun bisa disebut pengangguran, Lester adalah Hacker terbaik di Los Santos. Lester juga ikut berkontribusi besar dalam aksi-aksi kriminal yang terjadi di Los Santos.",
            "Agen rahasia pemerintah. Dave ikut andil dalam rencana Michael untuk menghianati teman-temannya. Berkat itu dia naik jabatan dan harus melindungi Michael dari hukum.",
            "Konglomerat Los Santos. Ya, dia seorang pebisnis handal, bisnisnya tersebar di penjuru Los Santos. Hanya saja semua bisnisnya itu bisnis kotor.",
            "Agen pemerintah yang satu ini korupnya bukan main. Ia menjalankan bisnis persenjataan untuk disuplai ke negara-negara yang sedang konflik.",
            "Orang jenius. Begitu setidaknya Badan keamanan negara menganggapnya sebelum memecatnya karena ide-ide nya terlalu liar dan berbahaya.",
            "Bos kartel paling disegani di US dan Mexico. Markas pusatnya berada di Los Santos.",
            "Chop sangat setia kepada Franklin, ia menemani Franklin dalam berbagai misi berbahaya. Ya, Chop adalah seekor anjing."
    };

    private static int[] charImages = {
            R.drawable.franklin,
            R.drawable.michael,
            R.drawable.trevor,
            R.drawable.lester,
            R.drawable.dave,
            R.drawable.devin,
            R.drawable.agent14,
            R.drawable.avon,
            R.drawable.martin,
            R.drawable.chop
    };

    static ArrayList<Charv> getListData() {
        ArrayList<Charv> list = new ArrayList<>();
        for (int position = 0; position < charNames.length; position++) {
            Charv charv = new Charv();
            charv.setName(charNames[position]);
            charv.setDetail(charDetails[position]);
            charv.setPhoto(charImages[position]);
            list.add(charv);
        }
        return list;
    }
}