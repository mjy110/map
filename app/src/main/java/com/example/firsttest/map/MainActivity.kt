package com.example.firsttest.map

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
   // private val myListener: MyLocationListener = MyLocationListener()
    // lateinit var mLocationClient:LocationClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      /*   mLocationClient=LocationClient(applicationContext)
        mLocationClient.registerLocationListener(myListener)
        val option = LocationClientOption()
        option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy)
        option.setNeedNewVersionRgc(true)
        option.setEnableSimulateGps(false)
        option.setWifiCacheTimeOut(5*60*1000)
        mLocationClient.setLocOption(option)
        option.SetIgnoreCacheException(false)
        option.setIgnoreKillProcess(false)
        option.setLocationNotify(true)
        option.setOpenGps(true)
        option.setScanSpan(1000)
        option.setCoorType("bd09ll")
        mLocationClient.start()*/
    }
    override fun onResume() {
        super.onResume()
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        bmapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        bmapView.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        bmapView.onDestroy()
    }
}