package com.xujl.baselibrary.mvp.port;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.view.View;

import com.xujl.baselibrary.mvp.common.BaseToolBarModule;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃  神兽保佑
 * 　　　　┃　　　┃  代码无bug
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━感觉萌萌哒━━━━━━
 * Created by xujl on 2017/4/28.
 */

public interface IBaseView extends IBaseVP {
    void initView (IBasePresenter presenter);//初始化操作，由presenter负责调用

    View createUI (IBasePresenter presenter);//创建视图

    View exposeRootView ();//返回根布局

    <T extends View> T findView (int id);

    <D extends ViewDataBinding> D getDataBinding ();

    BaseToolBarModule getToolBarModule ();

    BaseToolBarModule createToolBarModule (IBaseView view, IBasePresenter presenter, int layoutId);

    void showToastMsg (Context context, String msg, int code);//toast提示用户消息

    void showToastMsg (Context context, String msg, int code, int time);//toast提示用户消息，自定义时间

    /**
     * 其他类调用相关
     **/
    void showLoading ();//显示加载

    void dismissLoading ();//隐藏加载

}
