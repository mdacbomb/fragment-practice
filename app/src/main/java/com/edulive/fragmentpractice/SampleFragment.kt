package com.edulive.fragmentpractice

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SampleFragment : Fragment(R.layout.fragment_sample) {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("FRAGMENT", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FRAGMENT", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("FRAGMENT", "onCreateView")
        return inflater.inflate(R.layout.fragment_sample, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("FRAGMENT", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("FRAGMENT", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FRAGMENT", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FRAGMENT", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FRAGMENT", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("FRAGMENT", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FRAGMENT", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("FRAGMENT", "onDetach")
    }
}