package com.example.awrealestate.wire

import androidx.fragment.app.Fragment
import com.example.awrealestate.databinding.FragmentWireBinding
import dagger.hilt.android.AndroidEntryPoint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.data.network.wire.WireModel


@AndroidEntryPoint
class WireFragment : Fragment() {

    private var _binding: FragmentWireBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWireBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(this)[WireViewModel::class.java]

        viewModel.wire.observe(viewLifecycleOwner) {
            loadStores(it)
        }

        viewModel.getWire()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun loadStores(wire: WireModel) {
        val rv: RecyclerView = binding.rvWire
        rv.layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.VERTICAL, false
        )

        val adapter = WireAdapter(wire.relatedTopics)
        rv.adapter = adapter
    }

    companion object {
        private const val TAG = "WireFragment"
    }
}
