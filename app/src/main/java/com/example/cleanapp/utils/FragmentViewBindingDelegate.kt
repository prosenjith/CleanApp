package com.example.cleanapp.utils

import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.viewbinding.ViewBinding
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class FragmentViewBindingDelegate<T : ViewBinding>(
    private val fragment: Fragment,
    private val bindingInflater: (LayoutInflater) -> T
) : ReadOnlyProperty<Fragment, T>, DefaultLifecycleObserver {

    private var binding: T? = null

    init {
        fragment.lifecycle.addObserver(this)
    }

    override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
        return binding ?: throw IllegalStateException("Fragment view binding not initialized yet.")
    }

    override fun onCreate(owner: LifecycleOwner) {
        binding = bindingInflater.invoke(LayoutInflater.from(fragment.context))
        super.onCreate(owner)
    }

    override fun onDestroy(owner: LifecycleOwner) {
        binding = null
        fragment.lifecycle.removeObserver(this)
        super.onDestroy(owner)
    }
}