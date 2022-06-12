package ge.edu.btu.task10

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class EventReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val database = EventsDatabaseHelper(context!!)
        if (intent != null)
            database.save(intent.action.toString())
    }
}
