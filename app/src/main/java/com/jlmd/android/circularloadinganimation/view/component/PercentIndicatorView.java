package com.jlmd.android.circularloadinganimation.view.component;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

/**
 * @author jlmd
 */
public class PercentIndicatorView extends TextView {

  private final int parentWidth;

  public PercentIndicatorView(Context context, int parentWidth) {
    super(context);
    this.parentWidth = parentWidth;
    init();
  }

  private void init() {
    int textSize = (40 * parentWidth) / 700;
    setTextSize(textSize);
    setTextColor(Color.WHITE);
    setGravity(Gravity.CENTER);
  }

  public void setPercent(int percent) {
    setText(percent + "%");
  }

  public void startAlphaAnimation() {
    AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
    alphaAnimation.setDuration(700);
    alphaAnimation.setFillAfter(true);
    startAnimation(alphaAnimation);
  }
}