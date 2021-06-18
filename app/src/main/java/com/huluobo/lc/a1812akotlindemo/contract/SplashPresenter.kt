package com.huluobo.lc.a1812akotlindemo.contract

/**
 * @author Lc
 * @description:
 * @date :2021/6/18 11:03
 */
class SplashPresenter(private val view: SplashContract.View) : SplashContract.Presenter {
    override fun checkLoginStatus() {
        if (isLoggedIn()) view.onLoggedIn() else view.onNotLoggedIn()
    }

    //model层
    private fun isLoggedIn(): Boolean = false //TODO 需要进行网络请求,来判断是否已经本地登陆过
}