package com.example.awrealestate.wire

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.awrealestate.databinding.ItemWireBinding


class WireAdapter(
    private val dataSet: List<com.example.data.network.wire.RelatedTopic>?
) : RecyclerView.Adapter<WireAdapter.WireViewHolder>() {

    private var context: Context? = null

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): WireViewHolder {
        context = parent.context

        return WireViewHolder(
            ItemWireBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: WireViewHolder, position: Int
    ) {
        val item = dataSet?.get(position)
        holder.thirdUrl.text = item?.firstURL
        holder.icon.text = item?.icon.toString()
        holder.result.text = item?.result
        holder.text.text = item?.text
    }

    override fun getItemCount(): Int = dataSet?.size!!

    inner class WireViewHolder(
        binding: ItemWireBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        var thirdUrl: TextView
        var icon: TextView
        var result: TextView
        var text: TextView

        init {
            thirdUrl = binding.tvThirdUrl
            icon = binding.tvWireIcon
            result = binding.tvWireResult
            text = binding.tvWireText
        }
    }
}
