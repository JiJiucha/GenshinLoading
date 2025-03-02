package com.jux.GenshinLoading;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff;
public class GenshinLoading {
    int[] colors;
    int[] size={0,0};
    int last=0;
    Bitmap bitmap;
    Bitmap resultBitmap;
    boolean first=true;
    public GenshinLoading(Bitmap bitmap, int[] colors) {
        this.colors = colors;
        this.bitmap = bitmap;
        this.size[0] = bitmap.getWidth();
        this.size[1] = bitmap.getHeight();
        resultBitmap = Bitmap.createBitmap(this.size[0], this.size[1], bitmap.getConfig());
    }
    public Bitmap programTo(int i) {
        if (i == last) return resultBitmap;
        if (i < 0 || i > size[0])return null;
        for (int w=(first?0:(last < i ?last: i));w < (first?(last < i ?i: last):size[0]);w++) {
            for (int h=0;h < size[1];h++) {
                if (Color.alpha(bitmap.getPixel(w, h)) != 00) {
                    if (w <= i) {
                        resultBitmap.setPixel(w, h, colors[0]);
                    }
                    if (w > i) {
                        resultBitmap.setPixel(w, h, colors[1]);
                    }
                }
            }
        }
        if(first)first=false;
        last = i;
        return resultBitmap;
    }
}
