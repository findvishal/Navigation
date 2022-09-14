package com.example.navigationcomponent.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R

class FragmentB : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val buttonB: Button = view.findViewById(R.id.buttonB)
        buttonB.setOnClickListener {
            val direction=FragmentBDirections.actionFragmentBToFragmentA("Nav")

            findNavController().navigate(direction)
        }
        return view
    }
}