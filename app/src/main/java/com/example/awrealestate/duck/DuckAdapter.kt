package com.example.awrealestate.duck

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.awrealestate.databinding.ItemDuckBinding
import com.example.data.network.duck.RelatedTopic

class DuckAdapter(
    private val dataSet: List<RelatedTopic?>?
) : RecyclerView.Adapter<DuckAdapter.DuckViewHolder>() {

    private var context: Context? = null

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): DuckViewHolder {
        context = parent.context

        return DuckViewHolder(
            ItemDuckBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: DuckViewHolder, position: Int
    ) {
        val item = dataSet?.get(position)
        holder.firstUrl.text = item?.firstURL
        holder.icon.text = item?.icon.toString()
        holder.result.text = item?.result
        holder.text.text = item?.text
    }

    override fun getItemCount(): Int = dataSet?.size!!

    inner class DuckViewHolder(
        binding: ItemDuckBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        var firstUrl: TextView
        var icon: TextView
        var result: TextView
        var text: TextView

        init {
            firstUrl = binding.tvFirstUrl
            icon = binding.tvIcon
            result = binding.tvResult
            text = binding.tvText
        }
    }
}