// Generated code from Butter Knife. Do not modify!
package com.stx.openeyes.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.stx.openeyes.R;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DailyFragment_ViewBinding implements Unbinder {
  private DailyFragment target;

  @UiThread
  public DailyFragment_ViewBinding(DailyFragment target, View source) {
    this.target = target;

    target.lvHome = Utils.findRequiredViewAsType(source, R.id.lv_home, "field 'lvHome'", ListView.class);
    target.ptr = Utils.findRequiredViewAsType(source, R.id.ptr, "field 'ptr'", PtrClassicFrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DailyFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lvHome = null;
    target.ptr = null;
  }
}
