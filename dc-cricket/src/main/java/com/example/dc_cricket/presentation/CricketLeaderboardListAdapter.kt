package com.example.dc_cricket.presentation


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.dc_cricket.R
import com.example.dc_cricket.data.LeaderboardListUiData
import com.example.dc_cricket.databinding.CricketGameLeaderboardItemBinding

class CricketLeaderboardListAdapter(private val filterList: List<LeaderboardListUiData>) :
    RecyclerView.Adapter<CricketLeaderboardListAdapter.LeaderboardListViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): LeaderboardListViewHolder {
        return LeaderboardListViewHolder(
            CricketGameLeaderboardItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return filterList.size
    }

    override fun onBindViewHolder(holder: LeaderboardListViewHolder, position: Int) {
        holder.onBind(filterList[position], position)
    }

    inner class LeaderboardListViewHolder(
        private val binding: CricketGameLeaderboardItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: LeaderboardListUiData, position: Int) {
            binding.model = item
            if (item.userType == "dc_user")

                binding.ivFlag.setImageDrawable(
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.ic_falg_pak
                    )
                )
            else
                binding.ivFlag.setImageDrawable(
                    ContextCompat.getDrawable(
                        binding.root.context,
                        R.drawable.ic_flag_india
                    )
                )

        }
    }
}