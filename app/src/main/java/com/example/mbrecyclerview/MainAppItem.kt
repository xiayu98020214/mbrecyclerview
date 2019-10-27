package com.example.mbrecyclerview


import com.daimler.mbuikit.components.recyclerview.MBBaseRecyclerItem

class MainAppItem(private val app: FamilyApp, private val callback: FamilyAppEvents) : MBBaseRecyclerItem() {

    val title = app.name

    override fun getLayoutRes(): Int = R.layout.item_family_app

    override fun getModelId(): Int = BR.item

    fun onItemClicked() {
        callback.onAppSelected(app)
    }

    interface FamilyAppEvents {
        fun onAppSelected(app: FamilyApp)
    }
}