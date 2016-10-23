package com.example.zver.bookofwisdom;

import android.graphics.Bitmap;

/**
 * Created 07.09.2016.
 */
public class ItemsOfRow {

    public String TitleName;
    public String TitleContent;

    public Bitmap getTitleImage() {
        return TitleImage;
    }

    public void setTitleImage(Bitmap titleImage) {
        TitleImage = titleImage;
    }

    public String getTitleContent() {
        return TitleContent;
    }

    public void setTitleContent(String titleContent) {
        TitleContent = titleContent;
    }

    public String getTitleName() {
        return TitleName;
    }

    public void setTitleName(String titleName) {
        TitleName = titleName;
    }

    public Bitmap TitleImage;


}
