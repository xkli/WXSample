package com.weex.sample.extend.module;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

/**
 * Created by lixinke on 2017/2/17.
 */

public class NetworkModule extends WXModule {

  /**
   * Module同步方法必须在非UI线程
   * @return
   */
  @JSMethod
  public void isNetworkConnected(JSCallback callback) {
    boolean isConnected = false;
    ConnectivityManager manager = (ConnectivityManager) mWXSDKInstance.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo networkInfo = manager.getActiveNetworkInfo();
    if (networkInfo != null) {
      isConnected = networkInfo.isConnected();
    }
    callback.invoke(isConnected);
  }
}
