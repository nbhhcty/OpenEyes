// Generated code from Butter Knife. Do not modify!
package com.stx.openeyes;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.stx.openeyes.view.CustomTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131231025;

  private View view2131231027;

  private View view2131231029;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.mainToolbar = Utils.findRequiredViewAsType(source, R.id.main_toolbar, "field 'mainToolbar'", Toolbar.class);
    target.mainToolbarTvTime = Utils.findRequiredViewAsType(source, R.id.main_toolbar_tv_time, "field 'mainToolbarTvTime'", CustomTextView.class);
    target.mainToolbarIvRight = Utils.findRequiredViewAsType(source, R.id.main_toolbar_iv_right, "field 'mainToolbarIvRight'", ImageButton.class);
    view = Utils.findRequiredView(source, R.id.tv_daily, "field 'tvDaily' and method 'onClick'");
    target.tvDaily = Utils.castView(view, R.id.tv_daily, "field 'tvDaily'", TextView.class);
    view2131231025 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_find, "field 'tvFind' and method 'onClick'");
    target.tvFind = Utils.castView(view, R.id.tv_find, "field 'tvFind'", TextView.class);
    view2131231027 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_hot, "field 'tvHot' and method 'onClick'");
    target.tvHot = Utils.castView(view, R.id.tv_hot, "field 'tvHot'", TextView.class);
    view2131231029 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mainMenu = Utils.findRequiredViewAsType(source, R.id.main_menu, "field 'mainMenu'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mainToolbar = null;
    target.mainToolbarTvTime = null;
    target.mainToolbarIvRight = null;
    target.tvDaily = null;
    target.tvFind = null;
    target.tvHot = null;
    target.mainMenu = null;

    view2131231025.setOnClickListener(null);
    view2131231025 = null;
    view2131231027.setOnClickListener(null);
    view2131231027 = null;
    view2131231029.setOnClickListener(null);
    view2131231029 = null;
  }
}
