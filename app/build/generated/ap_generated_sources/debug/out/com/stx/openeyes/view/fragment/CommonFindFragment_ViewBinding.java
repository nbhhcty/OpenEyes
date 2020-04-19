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

public class CommonFindFragment_ViewBinding implements Unbinder {
  private CommonFindFragment target;

  @UiThread
  public CommonFindFragment_ViewBinding(CommonFindFragment target, View source) {
    this.target = target;

    target.findListview = Utils.findRequiredViewAsType(source, R.id.find_listview, "field 'findListview'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CommonFindFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.findListview = null;
  }
}
