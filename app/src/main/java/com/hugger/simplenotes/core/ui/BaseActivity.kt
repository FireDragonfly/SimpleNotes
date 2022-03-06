package com.hugger.simplenotes.core.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB: ViewBinding>: AppCompatActivity() {

    protected var binding: VB? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = inflateViewBinding()
        setContentView(binding!!.root)
        binding!!.setupLayout()
    }

    override fun onDestroy() {
        super.onDestroy()
        releaseViewBinding()
    }

    abstract fun inflateViewBinding(): VB

    protected open fun VB.setupLayout() {}

    private fun releaseViewBinding() {
        binding = null
    }
}