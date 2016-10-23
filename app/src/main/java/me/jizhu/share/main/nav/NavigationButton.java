package me.jizhu.share.main.nav;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by xieyongqing on 2016/10/23.
 */

public class NavigationButton extends FrameLayout {

    public NavigationButton(Context context) {
        super(context);
    }

    public NavigationButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NavigationButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public NavigationButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

}
