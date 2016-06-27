package com.weex.sample;

import android.widget.ImageView;

import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.common.WXImageStrategy;
import com.taobao.weex.dom.WXImageQuality;

/**
 * Created by lixinke on 16/6/1.
 */
public class ImageAdapter implements IWXImgLoaderAdapter {


  @Override
  public void setImage(String url, ImageView view, WXImageQuality quality, WXImageStrategy strategy) {
    //实现你自己的图片下载。
  }
}
