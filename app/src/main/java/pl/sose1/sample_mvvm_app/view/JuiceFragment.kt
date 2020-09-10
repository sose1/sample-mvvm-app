package pl.sose1.sample_mvvm_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.main_activity_fragment.*
import pl.sose1.sample_mvvm_app.viewModel.JuiceViewModel
import pl.sose1.sample_mvvm_app.R

class JuiceFragment : Fragment() {

    private val viewModel: JuiceViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_activity_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListener()
        observeJuice()
    }

    private fun setupClickListener() {
        juice_button.setOnClickListener{viewModel.getRandomJuice()}
    }

    private fun observeJuice() {
        viewModel.juiceLiveData.observe(viewLifecycleOwner, Observer { juice ->
            juice_name.text = juice })
    }

}