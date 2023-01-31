package com.miHoYo.Gensh.maaaiananaclal

import android.app.Application
import android.content.Context
import com.miHoYo.Gensh.gtjtjijigt.Util.ONESIGNAL_APP_IDgtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.instIdgttg
import com.miHoYo.Gensh.gtjtjijigt.Util.mtKeygttggt
import com.miHoYo.Gensh.gtjtjijigt.Util.myIdgtgtgt
import com.miHoYo.Gensh.uuutttiils.appModulegtgtgtgt
import com.miHoYo.Gensh.uuutttiils.viewModelModulegtgtgtgt
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import io.branch.referral.Branch
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class SoSoSoClass:Application() {


    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_IDgtgt)
        Branch.enableTestMode()
        Branch.getAutoInstance(this)

        val shPgtgtgt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val settingsgttg = getSharedPreferences("PREFS_NAME", 0)

        val trackerParamsgtgttg = MyTracker.getTrackerParams()
        val trackerConfiggttggt = MyTracker.getTrackerConfig()
        val instIDgtgtgt = MyTracker.getInstanceId(this)
        trackerConfiggttggt.isTrackingLaunchEnabled = true
        val IDINgtgtgt = UUID.randomUUID().toString()

        if (settingsgttg.getBoolean("my_first_time", true)) {
            trackerParamsgtgttg.setCustomUserId(IDINgtgtgt)
            shPgtgtgt.edit().putString(myIdgtgtgt, IDINgtgtgt).apply()
            shPgtgtgt.edit().putString(instIdgttg, instIDgtgtgt).apply()
            settingsgttg.edit().putBoolean("my_first_time", false).apply()
        } else {
            val gtgtihgthui = shPgtgtgt.getString(myIdgtgtgt, IDINgtgtgt)
            trackerParamsgtgttg.setCustomUserId(gtgtihgthui)
        }
        MyTracker.initTracker(mtKeygttggt, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@SoSoSoClass)
            modules(
                listOf(
                    viewModelModulegtgtgtgt, appModulegtgtgtgt
                )
            )
        }
    }
}