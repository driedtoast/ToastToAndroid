package ${package};

import android.graphics.Color;
import android.os.Bundle;                       
import org.apache.cordova.DroidGap;
import android.webkit.WebSettings;

public class CordovaActivity extends DroidGap {
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	// PhoneGet
    	super.setBooleanProperty("loadInWebView", true);
    	super.setIntegerProperty("backgroundColor", Color.WHITE);
    	super.setBooleanProperty("keepRunning", false);
    	super.setIntegerProperty("splashscreen", R.drawable.splash);
    	super.setIntegerProperty("loadUrlTimeoutValue", 60000);
    	super.onCreate(savedInstanceState);
    	super.loadUrl("file:///android_asset/www/index.html");
    	WebSettings settings = appView.getSettings();
    	settings.setSupportZoom(true);
    	settings.setUseWideViewPort(true);
    	settings.setBuiltInZoomControls(true);
    	settings.setLoadWithOverviewMode(true);
    }
}
