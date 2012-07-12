package ${package};

import android.graphics.Color;
import android.os.Bundle;                       
import org.apache.cordova.DroidGap;
import android.webkit.WebSettings;
//import android.webkit.WebSettings.ZoomDensity;

public class CordovaActivity extends DroidGap {
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	//設定PhoneGet 可載入外部網頁
    	super.setBooleanProperty("loadInWebView", true);
    	//設定頁底顏色
    	super.setIntegerProperty("backgroundColor", Color.WHITE);
    	//設定離開程式畫面後,程式是否繼續背景執行
    	super.setBooleanProperty("keepRunning", false);
    	//載入時顯示的背景圖
    	super.setIntegerProperty("splashscreen", R.drawable.splash);
    	//載入網頁之等待時間(ms)
    	super.setIntegerProperty("loadUrlTimeoutValue", 60000);
    	super.onCreate(savedInstanceState);
    	//載入網頁
    	super.loadUrl("file:///android_asset/www/index.html");
    	WebSettings settings = appView.getSettings();
    	settings.setSupportZoom(true);
    	settings.setUseWideViewPort(true);
    	settings.setBuiltInZoomControls(true);
    	settings.setLoadWithOverviewMode(true);
    	/*
      settings.setDefaultZoom(ZoomDensity.FAR);*/
    }
}