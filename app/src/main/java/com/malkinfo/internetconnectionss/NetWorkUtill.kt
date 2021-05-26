package com.malkinfo.internetconnectionss

import android.content.Context
import android.net.ConnectivityManager

internal object NetWorkUtill {

    fun getConnectionStatusString(context:Context):String?{
        var status :String? = null

        var cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activityNetwork = cm.activeNetworkInfo
        if (activityNetwork != null){
            if (activityNetwork.type == ConnectivityManager.TYPE_WIFI){
                status = "Wifi Enabled"
                return status
            }
            else if (activityNetwork.type == ConnectivityManager.TYPE_MOBILE){
                status = "Mobile data Enabled"
                return status
            }
        }
        else {
            status = "No Internet is available"
            return status
        }

        return status
    }

}