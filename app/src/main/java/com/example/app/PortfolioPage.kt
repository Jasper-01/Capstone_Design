package com.example.app

import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class PortfolioPage : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var userArrayList: ArrayList<user>
    private lateinit var adapter: adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portfolio_page)

        val addBtn = findViewById<Button>(R.id.addPortfolioBtn)

        // local database that saves ID to retrieve from cloud
        val sharedPreferencesAcc = getSharedPreferences("accountDetails", MODE_PRIVATE)
        // saving details locally
        val sharedPreferencesPortfolio = getSharedPreferences("portfolio", MODE_PRIVATE)
        val editor = sharedPreferencesPortfolio.edit()

//        userArrayList = arrayListOf()
//        adapter = adapter(userArrayList)
//        recyclerView.adapter = adapter
//        EventChangeListener(ID)

        addBtn.setOnClickListener {
            val view = layoutInflater.inflate(R.layout.portfolio_card_add, null)
            val window = PopupWindow(this)
            window.contentView = view
            window.isFocusable = true
            window.showAtLocation(view, Gravity.CENTER, 0, 0)

            val applyBtn = view.findViewById<Button>(R.id.addPortfolioApplyBtn)
            val cancelBtn = view.findViewById<Button>(R.id.addPortfolioCancelBtn)

            val title = view.findViewById<EditText>(R.id.portfolioAddTitle)
            val desc = view.findViewById<EditText>(R.id.portfolioAddDesc)
            val img = view.findViewById<ImageButton>(R.id.portfolioAddPreviewImage)

            // need to figure out how to open file locally
            img.setOnClickListener {

            }

            applyBtn.setOnClickListener {
                // ignore warnings because it is editText
                if(title.text.toString() != null && desc.text.toString() != null){
                    editor.putString("portfolioTitle", title.text.toString())
                    editor.putString("portfolioDesc", desc.text.toString())

                    editor.apply()
                    window.dismiss()
                } else{
                    Toast.makeText(applicationContext, "Please enter Title and Description", Toast.LENGTH_SHORT).show()
                }
            }

            cancelBtn.setOnClickListener {
                window.dismiss()
            }
        }
    }

    private fun EventChangeListener(ID :String){
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
    }
}