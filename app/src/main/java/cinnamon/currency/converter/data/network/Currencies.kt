package cinnamon.currency.converter.data.network

import com.google.gson.annotations.SerializedName

data class Currencies (
    @SerializedName("broj_tecajnice") val brojTecajnice: String,
    @SerializedName("datum_primjene") val datumPrimjene: String,
    @SerializedName("drzava") val drzava: String,
    @SerializedName("drzava_iso") val drzavaISO: String,
    @SerializedName("sifra_valute") val sifraValute: String,
    @SerializedName("valuta") val valuta: String,
    @SerializedName("jedinica") val jedinica: Long,
    @SerializedName("kupovni_tecaj") val kupovniTecaj: String,
    @SerializedName("srednji_tecaj") val srednjiTecaj: String,
    @SerializedName("prodajni_tecaj") val prodajniTecaj: String
)