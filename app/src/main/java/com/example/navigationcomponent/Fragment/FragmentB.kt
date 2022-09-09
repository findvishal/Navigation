package com.example.navigationcomponent.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.navigationcomponent.R

class FragmentB : Fragment() {
    //new
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_b, container, false)
        val navController=activity?.let {
            Navigation.findNavController(it,R.id.fragment)
        }
        val buttonB: Button =view.findViewById(R.id.buttonB)
        buttonB.setOnClickListener{
            navController?.navigate(R.id.action_fragmentB_to_fragmentA)
        }
        return view
    }
}