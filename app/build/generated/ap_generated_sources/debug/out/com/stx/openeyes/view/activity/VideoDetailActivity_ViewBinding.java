// Generated code from Butter Knife. Do not modify!
package com.stx.openeyes.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.stx.openeyes.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VideoDetailActivity_ViewBinding implements Unbinder {
  private VideoDetailActivity target;

  private View view2131231051;

  private View view2131231048;

  private View view2131231038;

  private View view2131231040;

  private View view2131231039;

  private View view2131231037;

  @UiThread
  public VideoDetailActivity_ViewBinding(VideoDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VideoDetailActivity_ViewBinding(final VideoDetailActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.video_toolbar_iv_right, "field 'videoToolbarIvRight' and method 'onClick'");
    target.videoToolbarIvRight = Utils.castView(view, R.id.video_toolbar_iv_right, "field 'videoToolbarIvRight'", ImageButton.class);
    view2131231051 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
    target.videoToolbar = Utils.findRequiredViewAsType(source, R.id.video_toolbar, "field 'videoToolbar'", Toolbar.class);
    target.videoDetailIv = Utils.findRequiredViewAsType(source, R.id.video_detail_iv, "field 'videoDetailIv'", SimpleDraweeView.class);
    view = Utils.findRequiredView(source, R.id.video_paly, "field 'videoPaly' and method 'onClick'");
    target.videoPaly = Utils.castView(view, R.id.video_paly, "field 'videoPaly'", ImageView.class);
    view2131231048 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.videoDetailIvmo = Utils.findRequiredViewAsType(source, R.id.video_detail_ivmo, "field 'videoDetailIvmo'", SimpleDraweeView.class);
    target.videoDetailTitle = Utils.findRequiredViewAsType(source, R.id.video_detail_title, "field 'videoDetailTitle'", TextView.class);
    target.videoDetailTime = Utils.findRequiredViewAsType(source, R.id.video_detail_time, "field 'videoDetailTime'", TextView.class);
    target.videoDetailDesc = Utils.findRequiredViewAsType(source, R.id.video_detail_desc, "field 'videoDetailDesc'", TextView.class);
    view = Utils.findRequiredView(source, R.id.video_detail_iv_fav, "field 'videoDetailIvFav' and method 'onClick'");
    target.videoDetailIvFav = Utils.castView(view, R.id.video_detail_iv_fav, "field 'videoDetailIvFav'", ImageView.class);
    view2131231038 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.videoDetailTvFav = Utils.findRequiredViewAsType(source, R.id.video_detail_tv_fav, "field 'videoDetailTvFav'", TextView.class);
    view = Utils.findRequiredView(source, R.id.video_detail_iv_share, "field 'videoDetailIvShare' and method 'onClick'");
    target.videoDetailIvShare = Utils.castView(view, R.id.video_detail_iv_share, "field 'videoDetailIvShare'", ImageView.class);
    view2131231040 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.videoDetailTvShare = Utils.findRequiredViewAsType(source, R.id.video_detail_tv_share, "field 'videoDetailTvShare'", TextView.class);
    view = Utils.findRequiredView(source, R.id.video_detail_iv_reply, "field 'videoDetailIvReply' and method 'onClick'");
    target.videoDetailIvReply = Utils.castView(view, R.id.video_detail_iv_reply, "field 'videoDetailIvReply'", ImageView.class);
    view2131231039 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.videoDetailTvReply = Utils.findRequiredViewAsType(source, R.id.video_detail_tv_reply, "field 'videoDetailTvReply'", TextView.class);
    view = Utils.findRequiredView(source, R.id.video_detail_iv_down, "field 'videoDetailIvDown' and method 'onClick'");
    target.videoDetailIvDown = Utils.castView(view, R.id.video_detail_iv_down, "field 'videoDetailIvDown'", ImageView.class);
    view2131231037 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.videoDetailTvDown = Utils.findRequiredViewAsType(source, R.id.video_detail_tv_down, "field 'videoDetailTvDown'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VideoDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.videoToolbarIvRight = null;
    target.videoToolbar = null;
    target.videoDetailIv = null;
    target.videoPaly = null;
    target.videoDetailIvmo = null;
    target.videoDetailTitle = null;
    target.videoDetailTime = null;
    target.videoDetailDesc = null;
    target.videoDetailIvFav = null;
    target.videoDetailTvFav = null;
    target.videoDetailIvShare = null;
    target.videoDetailTvShare = null;
    target.videoDetailIvReply = null;
    target.videoDetailTvReply = null;
    target.videoDetailIvDown = null;
    target.videoDetailTvDown = null;

    view2131231051.setOnClickListener(null);
    view2131231051 = null;
    view2131231048.setOnClickListener(null);
    view2131231048 = null;
    view2131231038.setOnClickListener(null);
    view2131231038 = null;
    view2131231040.setOnClickListener(null);
    view2131231040 = null;
    view2131231039.setOnClickListener(null);
    view2131231039 = null;
    view2131231037.setOnClickListener(null);
    view2131231037 = null;
  }
}
