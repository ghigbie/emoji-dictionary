package com.traiingtrack.emojidictionary

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class EmojiAdapter: RecyclerView.Adapter<EmojiAdapter.TextHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row, parent, false))
    }

    override fun getItemCount(): Int {
       return 10
    }

    override fun onBindViewHolder(holder: EmojiAdapter.TextHolder, position: Int) {
        holder.bindEmoji("")
    }

    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener{
        var view: View = v
        var emoji: String = "👍"


        fun bindEmoji(emoji: String){
            this.emoji = emoji
            view.itemTextView.text = emoji
        }

        override fun onClick(v: View?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}