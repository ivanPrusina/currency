package cinnamon.currency.converter.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import cinnamon.currency.converter.R
import cinnamon.currency.converter.databinding.SplashFragmentBinding


class SplashFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var binding: SplashFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.splash_fragment, container, false)

        val viewModel = SplashViewModel()

        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment // without this i didn't get any data of characters which is pretty much obvious but Im dumb mofo
        binding.setLifecycleOwner(this)

        return binding.root
    }



}
