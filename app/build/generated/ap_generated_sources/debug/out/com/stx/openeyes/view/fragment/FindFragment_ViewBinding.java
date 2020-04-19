// Generated code from Butter Knife. Do not modify!
package com.stx.openeyes.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.GridView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.stx.openeyes.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FindFragment_ViewBinding implements Unbinder {
  private FindFragment target;

  @UiThread
  public FindFragment_ViewBinding(FindFragment target, View source) {
    this.target = target;

    target.findGrid = Utils.findRequiredViewAsType(source, R.id.find_grid, "field 'findGrid'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FindFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.findGrid = null;
  }
}
