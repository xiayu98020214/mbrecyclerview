package com.example.mbrecyclerview


import com.daimler.mbdeeplinkkit.sample.utils.extensions.newViewModel
import com.daimler.mbuikit.components.activities.MBBaseViewModelActivity
import com.example.mbrecyclerview.BR.*

class MainActivity : MBBaseViewModelActivity<MainViewModel>(){

    override fun getLayoutRes(): Int {

        return R.layout.activity_main
    }

    override fun getModelId(): Int {
        return model
    }

    override fun createViewModel(): MainViewModel = newViewModel()



}
