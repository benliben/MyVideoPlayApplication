package com.example.chrisli.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xiao.nicevideoplayer.NiceVideoPlayer
import com.xiao.nicevideoplayer.TxVideoPlayerController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        activity_littele_window_player.setPlayerType(NiceVideoPlayer.TYPE_IJK)
//        activity_littele_window_player.setUp("http://tanzi27niu.cdsb.mobi/wps/wp-content/uploads/2017/05/2017-05-17_17-33-30.mp4",null)
        activity_littele_window_player.setUp("https://wx.uurtb.com/dbimg/vmp4/730a2dc5e99c839ba9513fae8e6d286b.mp4",null)
//        activity_littele_window_player.setUp("http://ips.ifeng.com/video19.ifeng.com/video09/2014/06/16/1989823-102-086-0009.mp4",null)


        var controller =  TxVideoPlayerController(this)
        controller.setTitle("测试小窗播放视频标题");  // controller为蒙版层，用于设置视频标题
        controller.setLenght(98000);  //时间以mm为单位计算
//        Glide.with(this).load(Const.testUrl.VIDEOIMG1)
//            .placeholder(R.mipmap.default_player_bg)
//            .crossFade()
//            .into(controller.imageView()); //加载视频图片到蒙版上
        activity_littele_window_player.setController(controller);

    }
}
