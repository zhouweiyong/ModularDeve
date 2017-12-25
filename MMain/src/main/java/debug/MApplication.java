package debug;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.vst.commonlib.BuildConfig;

/**
 * Created by zwy on 2017/12/21.
 * email:16681805@qq.com
 */

public class MApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
