package io.github.pouyarezaei.costum.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

public class Utils {


    public static int dpToPx(Context context, int dp) {
        return ((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics()));
    }

    public static int spToPx(Context context, int sp) {
        return ((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, context.getResources().getDisplayMetrics()));
    }

    public static Bitmap getResizedBitmap(Bitmap image, int dstWidth, int dstHeight) {
        Matrix matrix = new Matrix();
        RectF src = new RectF(0, 0, image.getWidth(), image.getHeight());
        RectF dst = new RectF(0, 0, dstWidth, dstHeight);
        matrix.setRectToRect(src, dst, Matrix.ScaleToFit.CENTER);
        return Bitmap.createBitmap(image, 0, 0, image.getWidth(), image.getHeight(), matrix, true);
    }

    public static Bitmap convertDrawableToBitmap(Drawable drawable, int dstBitmapWidthPixels, int dstBitmapHeightPixels) {
        Bitmap mutableBitmap = Bitmap.createBitmap(dstBitmapWidthPixels, dstBitmapHeightPixels, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mutableBitmap);
        drawable.setBounds(0, 0, dstBitmapWidthPixels, dstBitmapHeightPixels);
        drawable.draw(canvas);
        return mutableBitmap;
    }

}
