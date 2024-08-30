package ru.easycode.zerotoheroandroidtdd

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TestAdapter(private val data: List<String>): RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    class TestViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val textView = view.findViewById<TextView>(R.id.elementTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_viewholder, parent, false)
        return TestViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        val item = data[position]
        holder.textView.text = item
    }
}