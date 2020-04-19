// Generated code from Butter Knife. Do not modify!
package com.stx.openeyes.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.stx.openeyes.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CommonHotFragment_ViewBinding implements Unbinder {
  private CommonHotFragment target;

  @UiThread
  public CommonHotFragment_ViewBinding(CommonHotFragment target, View source) {
    this.target = target;

    target.hotListview = Utils.findRequiredViewAsType(source, R.id.hot_listview, "field 'hotListview'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CommonHotFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.hotListview = null;
  }
}
