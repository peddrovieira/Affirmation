package com.ds2.affirmation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.ds2.affirmation.adapter.ItemAdapter
import com.ds2.affirmation.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Starta o data
        val myDataset = Datasource ().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)


        //Para uso de desempenho se sabe que o layout não vai ficar mudando
        recyclerView.setHasFixedSize(true)

    }
}