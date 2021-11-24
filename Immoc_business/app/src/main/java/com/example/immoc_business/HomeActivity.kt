package com.example.immoc_business

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

/**
 * Created by yanshirong on 2021/11/23.
 * E-Mail:yanshirong@shanda.com
 * Description:
 */
class HomeActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()
        initData()
    }

    private fun initData() {
    }

    private fun initView() {
    }

}