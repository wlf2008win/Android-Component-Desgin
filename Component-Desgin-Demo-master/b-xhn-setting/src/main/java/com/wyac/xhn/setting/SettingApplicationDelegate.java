package com.wyac.xhn.setting;

import android.content.res.Configuration;

import com.wyac.common.annotations.EFModuleAnnotation;
import com.wyac.common.framework.module.interfaces.IApplicationDelegate;
import com.wyac.common.logmanager.EFLog;

import java.util.Map;

/**
 * 设置组件全局应用配置
 */
@EFModuleAnnotation(moduleName = "b-xhn-setting", delegateName = "com.wyac.xhn.setting.SettingApplicationDelegate")
public class SettingApplicationDelegate implements IApplicationDelegate {

    private static final String TAG = "SettingApplicationDelegate";


    @Override
    public void onCreate() {
        EFLog.d(TAG, "*------------------onCreate()---------------->");
    }

    @Override
    public void enterBackground() {
        EFLog.d(TAG, "*------------------enterBackground()---------------->");
    }

    @Override
    public void enterForeground() {
        EFLog.d(TAG, "*------------------enterForeground()---------------->");
    }

    @Override
    public void receiveRemoteNotification(Map<String, String> message) {
        EFLog.d(TAG, "receiveRemoteNotification msg = " + message);
    }

    @Override
    public void onTerminate() {
        EFLog.d(TAG, "*------------------onTerminate()---------------->");
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        EFLog.d(TAG, "*------------------onConfigurationChanged()---------------->");
    }

    @Override
    public void onLowMemory() {
        EFLog.d(TAG, "*------------------onLowMemory()---------------->");
    }

    @Override
    public void onTrimMemory(int var1) {
        EFLog.d(TAG, "*------------------onTrimMemory()---------------->");
    }
}
