package ge.edu.btu.task10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EventsRecyclerAdapter(
    private val items: ArrayList<Event>
) : RecyclerView.Adapter<EventsRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.action_item,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(items[position])
    }

    override fun getItemCount() = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var event: TextView
        private lateinit var createDate: TextView

        fun onBind(item: Event) {
            event = itemView.findViewById(R.id.event)
            createDate = itemView.findViewById(R.id.createDate)

            event.text = item.eventName
            createDate.text = item.createDate
        }
    }
}
