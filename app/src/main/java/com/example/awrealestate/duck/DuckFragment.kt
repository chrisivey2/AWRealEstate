package com.example.awrealestate.duck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.awrealestate.databinding.FragmentDuckBinding
import com.example.data.network.duck.DuckModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DuckFragment : Fragment() {

    private var _binding: FragmentDuckBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDuckBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(this)[DuckViewModel::class.java]

        viewModel.duck.observe(viewLifecycleOwner) {
            loadStores(it)
        }

        viewModel.getDuck()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun loadStores(duck: DuckModel) {
        val rv: RecyclerView = binding.rvDuck
        rv.layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.VERTICAL, false
        )

        val adapter = DuckAdapter(duck.relatedTopics)
        rv.adapter = adapter
    }

    companion object {
        private const val TAG = "DuckFragment"
    }
}