package com.huluobo.lc.a1812akotlindemo

import android.os.Handler
import android.util.Log
import com.huluobo.lc.a1812akotlindemo.contract.SplashContract
import com.huluobo.lc.a1812akotlindemo.contract.SplashPresenter
import org.jetbrains.anko.startActivity

/**
 * @author Lc
 * @description: 功能需求:
 * 1.如果没有登录,延时2秒,跳转到登录页面
 * 2.如果已经登录,直接跳转到主页面
 * @date :2021/6/18 11:05
 */
class SplashActivity : BaseActivity(), SplashContract.View {
    private val presenter = SplashPresenter(this)

    override fun init() {
        super.init()
        presenter.checkLoginStatus()
    }

    companion object {
        const val DELAY = 2000L
    }

    //实现懒加载 handler = new Handler(),行程一个懒汉模式的单例模式
    private val handler by lazy {
        Handler()
    }

    override fun getLayoutResId(): Int = R.layout.activity_splash

    //1.如果没有登录,延时2秒,跳转到登录页面
    override fun onNotLoggedIn() {
        Log.i("TagA","onNotLoggedIn")
        handler.postDelayed(
            {
                startActivity<LoginActivity>()//相当于添加intent来进行跳转
                finish()
            }, DELAY
        )
    }

    //2.如果已经登录,直接跳转到主页面
    override fun onLoggedIn() {
        Log.i("TagA","onLoggedIn")
        startActivity<MainActivity>()
        finish()
    }
}