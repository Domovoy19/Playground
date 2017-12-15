package com.example.testapplication.modules.main

import android.app.DownloadManager
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.testapplication.R
import com.example.testapplication.modules.bird.BirdActivity
import com.example.testapplication.modules.currency.CurrencyActivity
import com.example.testapplication.modules.customtoggles.CustomToggleActivity
import com.example.testapplication.modules.easyimage.EasyImageActivity
import com.example.testapplication.modules.expandableText.ExpandableTextActivity
import com.example.testapplication.modules.expandablelist.ExpandableListActivity
import com.example.testapplication.modules.flexboxlist.FlexBoxListActivity
import com.example.testapplication.modules.keyframeanimation.KeyframeAnimationActivity
import com.example.testapplication.modules.simplelist.SimpleListActivity
import com.example.testapplication.modules.staggeredanimations.StaggeredAnimationsActivity
import com.example.testapplication.modules.textarea.TextAreaActivity
import com.example.testapplication.modules.textboxes.TextBoxesActivity
import com.example.testapplication.modules.textviews.TextViewsActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.sdk19.listeners.onClick
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        showListButton.onClick { startActivity<SimpleListActivity>() }
        showFlexBoxListButton.onClick { startActivity<FlexBoxListActivity>() }
        showTextAreaButton.onClick { startActivity<TextAreaActivity>() }
        showTextViewsButton.onClick { startActivity<TextViewsActivity>() }
        showTexBoxesButton.onClick { startActivity<TextBoxesActivity>() }
        showExpandableListButton.onClick { startActivity<ExpandableListActivity>() }
        birdButton.onClick { startActivity<BirdActivity>() }
        expandableTextButton.onClick { startActivity<ExpandableTextActivity>() }
        staggeredAnimationsButton.onClick { startActivity<StaggeredAnimationsActivity>() }
        currencyButton.onClick { startActivity<CurrencyActivity>() }
        easyImageButton.onClick { startActivity<EasyImageActivity>() }
        customTogglesButton.onClick { startActivity<CustomToggleActivity>() }
        keyframeAnimationButton.onClick { startActivity<KeyframeAnimationActivity>() }

        openFileDirectoryButton.onClick {
            startActivity(Intent(DownloadManager.ACTION_VIEW_DOWNLOADS))
        }

    }
}
