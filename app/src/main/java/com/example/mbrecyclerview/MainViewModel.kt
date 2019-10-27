package com.example.mbrecyclerview

import android.os.Handler
import androidx.lifecycle.ViewModel
import com.daimler.mbuikit.components.recyclerview.MutableLiveArrayList

class MainViewModel : ViewModel(), MainAppItem.FamilyAppEvents{
    val items = MutableLiveArrayList<MainAppItem>()

    init {
        var family1 = MainAppItem(FamilyApp("xiayu1"),this)
        var family2 = MainAppItem(FamilyApp("xiayu2"),this)

         items.value.addAll(listOf(family1))
         Handler().postDelayed({         items.value.addAll(listOf(family2))
             items.dispatchChange()
         },3000)

    }

    override fun onAppSelected(app: FamilyApp) {
    }
}