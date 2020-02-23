package com.traiingtrack.emojidictionary

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class EmojiAdapter: RecyclerView.Adapter<EmojiAdapter.TextHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row, parent, false))
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: TextHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener{
        override fun onClick(v: View?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}