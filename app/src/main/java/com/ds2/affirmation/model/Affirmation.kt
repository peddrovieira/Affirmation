package com.ds2.affirmation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.sql.RowId

data class Affirmation(@StringRes val stringResourceId: Int,@DrawableRes  val imageResourceId: Int) {

}