package com.niveler1.newsapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.niveler1.newsapp.R
import com.niveler1.newsapp.databinding.FragmentDetailsBinding
import com.niveler1.newsapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {


    private var _binding: FragmentMainBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(layoutInflater,container,false)
        return mBinding.root
    }
}