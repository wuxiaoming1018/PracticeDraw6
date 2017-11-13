package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice04Alpha extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    private int count = 0;

    public Practice04Alpha(Context context) {
        super(context);
    }

    public Practice04Alpha(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice04Alpha(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                // TODO 在这里处理点击事件，通过 View.animate().alpha() 来改变 View 的透明度
                //当参数小于0的时候，相当于等于0，全透明即view不可见
                //当参数大于1的时候，相当于等于1，不透明即view原亮度展示
                switch (count) {
                    case 0:
                        imageView.animate().alpha(-0.2f);
                        break;
                    case 1:
                        imageView.animate().alpha(0f);
                        break;
                    case 2:
                        imageView.animate().alpha(0.2f);
                        break;
                    case 3:
                        imageView.animate().alpha(0.4f);
                        break;
                    case 4:
                        imageView.animate().alpha(0.6f);
                        break;
                    case 5:
                        imageView.animate().alpha(0.8f);
                        break;
                    case 6:
                        imageView.animate().alpha(1f);
                        break;
                    case 7:
                        imageView.animate().alpha(1.2f);
                        break;
                }
                count++;
                if (count == 8) {
                    count = 0;
                }
            }
        });
    }
}