package com.example.awrealestate.simpsons


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.awrealestate.databinding.ItemSimpsonsBinding

class SimpsonsAdapter(
    private val dataSet: List<com.example.data.network.simpsons.RelatedTopic>?
) : RecyclerView.Adapter<SimpsonsAdapter.SimpsonsViewHolder>() {

    private var context: Context? = null

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): SimpsonsViewHolder {
        context = parent.context

        return SimpsonsViewHolder(
            ItemSimpsonsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: SimpsonsViewHolder, position: Int
    ) {
        val item = dataSet?.get(position)
        holder.secondUrl.text = item?.firstURL
        holder.icon.text = item?.icon.toString()
        holder.result.text = item?.result
        holder.text.text = item?.text
    }

    override fun getItemCount(): Int = dataSet?.size!!

    inner class SimpsonsViewHolder(
        binding: ItemSimpsonsBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        var secondUrl: TextView
        var icon: TextView
        var result: TextView
        var text: TextView

        init {
            secondUrl = binding.tvSecondUrl
            icon = binding.tvSimpsonsIcon
            result = binding.tvSimpsonsResult
            text = binding.tvSimpsonsText
        }
    }
}