package com.example.navigationcomponent.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R

class FragmentA : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_a, container, false)
        val buttonA:Button=view.findViewById(R.id.buttonA)
        buttonA.setOnClickListener{
            val direction=FragmentADirections.actionFragmentAToFragmentB("users")
            findNavController().navigate(direction)
        }
        return view
    }
}