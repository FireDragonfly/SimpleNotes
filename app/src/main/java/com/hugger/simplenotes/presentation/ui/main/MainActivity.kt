package com.hugger.simplenotes.presentation.ui.main

import com.hugger.simplenotes.core.ui.BaseActivity
import com.hugger.simplenotes.databinding.ActivityMainLayoutBinding

class MainActivity: BaseActivity<ActivityMainLayoutBinding>() {

    override fun inflateViewBinding(): ActivityMainLayoutBinding {
        return ActivityMainLayoutBinding.inflate(layoutInflater)
    }

    override fun ActivityMainLayoutBinding.setupLayout() {

    }
}