package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Case1PortfolioPage : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var userArrayList: ArrayList<user>
    private lateinit var adapter: adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_case1_portfolio_page)

        // local database that saves ID to retrieve from cloud
        val sharedPreferences = getSharedPreferences("myKey", MODE_PRIVATE)
        val ID = sharedPreferences.getString("ID", "0").toString()

//        userArrayList = arrayListOf()
//        adapter = adapter(userArrayList)
//        recyclerView.adapter = adapter
//        EventChangeListener(ID)
    }

//    private fun EventChangeListener(ID :String){
//        // retrieving data from firebase example
//
//        db = FirebaseFirestore.getInstance()
//        db.collection(email).
//        addSnapshotListener(object: EventListener<QuerySnapshot>{
//            @SuppressLint("NotifyDataSetChanged")
//            override fun onEvent(
//                value: QuerySnapshot?,
//                error: FirebaseFirestoreException?
//            ) {
//                if(error != null) {
//                    Log.e("Firestore Error", error.message.toString())
//                    return
//                }
//                for(dc : DocumentChange in value?.documentChanges!!){
//                    if(dc.type == DocumentChange.Type.ADDED){
//                        userArrayList.add(dc.document.toObject(user::class.java))
//                    }
//                }
//                userArrayList.sortByDescending {
//                    it.datetime
//                }
//                adapter.notifyDataSetChanged()
//            }
//        })
//    }
}