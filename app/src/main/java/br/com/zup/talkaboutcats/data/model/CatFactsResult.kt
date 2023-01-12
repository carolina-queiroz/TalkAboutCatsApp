package br.com.zup.talkaboutcats.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "catfacts")
data class CatFactsResult(
    @SerializedName("id")
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    @SerializedName("catfact")
    var catfact: String,
    var isFavorite: Boolean
) : Parcelable
