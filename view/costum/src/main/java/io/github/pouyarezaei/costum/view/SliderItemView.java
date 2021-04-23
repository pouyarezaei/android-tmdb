package io.github.pouyarezaei.costum.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;

import androidx.annotation.Nullable;

import io.github.pouyarezaei.costum.R;
import io.github.pouyarezaei.costum.util.Utils;


public class SliderItemView extends View {
    TextPaint textPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
    Bitmap image;
    GradientDrawable gradientDrawable;
    private Bitmap gradient;
    String text;
    private String trimmedText;
    float textSize;
    int textColor;
    int horizontalTextMargin = Utils.dpToPx(getContext(), 8);

    public SliderItemView(Context context) {
        super(context);
        init(null);
    }

    public SliderItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public SliderItemView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }


    private void init(@Nullable AttributeSet attrs) {
        if (attrs != null) {
            TypedArray attributes = getContext().getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.SliderItemView,
                    0, 0);
            try {
                text = attributes.getString(R.styleable.SliderItemView_siv_text);
                textSize = attributes.getDimension(R.styleable.SliderItemView_siv_text_size, 12.0f);
                textColor = attributes.getColor(R.styleable.SliderItemView_siv_text_color, Color.WHITE);
                int imageRes = attributes.getResourceId(R.styleable.SliderItemView_siv_image, R.drawable.img);
                image = BitmapFactory.decodeResource(getResources(),
                        imageRes);
                textPaint.setColor(textColor);
                textPaint.setTextSize(textSize);
                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0xff151c25, Color.TRANSPARENT});
            } finally {
                attributes.recycle();
            }

        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                getViewTreeObserver().removeOnGlobalLayoutListener(this);
                image = Utils.getResizedBitmap(image, getWidth(), getHeight());
                gradient = Utils.convertDrawableToBitmap(gradientDrawable, getWidth(), getHeight() / 4);
                trimmedText = TextUtils.ellipsize(text, textPaint, getWidth() - horizontalTextMargin, TextUtils.TruncateAt.END).toString();
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(image, 0, 0, null);
        canvas.drawBitmap(gradient, 0, (image.getHeight() - (float) image.getHeight() / 4), null);
        canvas.drawText(trimmedText, (horizontalTextMargin - (float) horizontalTextMargin / 2), image.getHeight() - ((float) gradient.getHeight() / 3), textPaint);
    }

    /**
     * @param textSize support sp density
     */
    public void setTextSize(int textSize) {
        this.textSize = textSize;
        invalidate();
    }

    public void setText(String text) {
        this.text = text;
        invalidate();
    }

    public void setGradientDrawable(GradientDrawable gradientDrawable) {
        this.gradientDrawable = gradientDrawable;
        invalidate();
    }

    public void setImage(Bitmap image) {
        this.image = image;
        invalidate();
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
        invalidate();
    }
}
