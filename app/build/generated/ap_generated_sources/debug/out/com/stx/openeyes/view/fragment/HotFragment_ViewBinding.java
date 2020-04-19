// Generated code from Butter Knife. Do not modify!
package com.stx.openeyes.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.stx.openeyes.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HotFragment_ViewBinding implements Unbinder {
  private HotFragment target;

  @UiThread
  public HotFragment_ViewBinding(HotFragment target, View source) {
    this.target = target;

    target.hotViewpager = Utils.findRequiredViewAsType(source, R.id.hot_viewpager, "field 'hotViewpager'", ViewPager.class);
    target.viewpagertab = Utils.findRequiredViewAsType(source, R.id.viewpagertab, "field 'viewpagertab'", SmartTabLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HotFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.hotViewpager = null;
    target.viewpagertab = null;
  }
}
