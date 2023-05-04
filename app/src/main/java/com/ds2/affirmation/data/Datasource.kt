package com.ds2.affirmation.data

import com.ds2.affirmation.R
import com.ds2.affirmation.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation> (
            Affirmation(R.string.Affirmation1),
            Affirmation(R.string.Affirmation2),
            Affirmation(R.string.Affirmation3),
            Affirmation(R.string.Affirmation4),
            Affirmation(R.string.Affirmation5),
            Affirmation(R.string.Affirmation6),
            Affirmation(R.string.Affirmation7)
        )
    }
}