// Generated code from Butter Knife. Do not modify!
package com.stx.openeyes.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.stx.openeyes.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FindDetailActivity_ViewBinding implements Unbinder {
  private FindDetailActivity target;

  private View view2131230835;

  private View view2131230840;

  @UiThread
  public FindDetailActivity_ViewBinding(FindDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FindDetailActivity_ViewBinding(final FindDetailActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.find_back, "field 'findBack' and method 'onClick'");
    target.findBack = Utils.castView(view, R.id.find_back, "field 'findBack'", ImageButton.class);
    view2131230835 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.findDetailTitle = Utils.findRequiredViewAsType(source, R.id.find_detail_title, "field 'findDetailTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.find_right, "field 'findRight' and method 'onClick'");
    target.findRight = Utils.castView(view, R.id.find_right, "field 'findRight'", ImageButton.class);
    view2131230840 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.findToolbar = Utils.findRequiredViewAsType(source, R.id.find_toolbar, "field 'findToolbar'", Toolbar.class);
    target.viewpagertab = Utils.findRequiredViewAsType(source, R.id.viewpagertab, "field 'viewpagertab'", SmartTabLayout.class);
    target.findDetailViewpager = Utils.findRequiredViewAsType(source, R.id.find_detail_viewpager, "field 'findDetailViewpager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FindDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.findBack = null;
    target.findDetailTitle = null;
    target.findRight = null;
    target.findToolbar = null;
    target.viewpagertab = null;
    target.findDetailViewpager = null;

    view2131230835.setOnClickListener(null);
    view2131230835 = null;
    view2131230840.setOnClickListener(null);
    view2131230840 = null;
  }
}
