package com.example.polycap.increasingbrainpower;

import java.util.Random;

/**
 * Created by Polycap on 7/30/2015.
 */
public class Titles {
    private String titles;
    private int mThumbnail;
    private static final Random RANDOM = new Random();

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public int getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.mThumbnail = thumbnail;
    }


    public static int getRandompicture(){
        switch (RANDOM.nextInt(14)){
            default:
            case 0:
                return R.drawable.breathdeep;
            case 1:
                return R.drawable.meditate;
            case 2:
                return R.drawable.situpstraight;
            case 3:
                return R.drawable.phosphatidylserine;
            case 4:
                return R.drawable.intuition;
            case 5:
                return R.drawable.subconsciousmind;
            case 6:
                return R.drawable.vinpocetine;
            case 7:
                return R.drawable.rosemary;
            case 8:
                return R.drawable.ginkgoleaves;
            case 9:
                return R.drawable.brainfoods;
            case 10:
                return R.drawable.huperzinea;
            case 11:
                return R.drawable.calmmozarton;
            case 12:
                return R.drawable.alphalipoicacid;
            case 13:
                return R.drawable.askquestion;


        }
    }



}
