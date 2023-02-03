package com.miHoYo.Gensh.maaaiananaclal

import android.app.Application
import android.content.Context
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.vfbrfgfrgrfgrfgyrfgy
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.instIdgttg
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.bngjgtitghgtg
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.bgngtjgtjgtjigt
import com.miHoYo.Gensh.uuutttiils.appModulegtgtgtgt
import com.miHoYo.Gensh.uuutttiils.viewModelModulegtgtgtgt
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class SoSoSoClass:Application() {


    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(vfbrfgfrgrfgrfgyrfgy)

        val shPgtgtgt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val settingsgttg = getSharedPreferences("PREFS_NAME", 0)

        val gthgtiuhtghuh = MyTracker.getTrackerParams()
        val gntntggtgtijgtgt = MyTracker.getTrackerConfig()
        val instIDgtgtgt = MyTracker.getInstanceId(this)
        gntntggtgtijgtgt.isTrackingLaunchEnabled = true
        val IDINgtgtgt = UUID.randomUUID().toString()

        if (settingsgttg.getBoolean("my_first_time", true)) {
            gthgtiuhtghuh.setCustomUserId(IDINgtgtgt)
            shPgtgtgt.edit().putString(bgngtjgtjgtjigt, IDINgtgtgt).apply()
            shPgtgtgt.edit().putString(instIdgttg, instIDgtgtgt).apply()
            settingsgttg.edit().putBoolean("my_first_time", false).apply()
        } else {
            val gtgtihgthui = shPgtgtgt.getString(bgngtjgtjgtjigt, IDINgtgtgt)
            gthgtiuhtghuh.setCustomUserId(gtgtihgthui)
        }
        MyTracker.initTracker(bngjgtitghgtg, this)

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