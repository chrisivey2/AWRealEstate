package com.example.awrealestate.simpsons

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.awrealestate.databinding.FragmentSimpsonsBinding
import com.example.data.network.simpsons.SimpsonsModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SimpsonsFragment : Fragment() {

    private var _binding: FragmentSimpsonsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSimpsonsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(this)[SimpsonsViewModel::class.java]

        viewModel.simpsons.observe(viewLifecycleOwner) {
            loadStores(it)
        }

        viewModel.getSimpsons()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun loadStores(simpsons: SimpsonsModel) {
        val rv: RecyclerView = binding.rvSimpsons
        rv.layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.VERTICAL, false
        )

        val adapter = SimpsonsAdapter(simpsons.relatedTopics)
        rv.adapter = adapter
    }

    companion object {
        private const val TAG = "SimpsonsFragment"
    }
}