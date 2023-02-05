package com.example.scapping.data

data class MuseumResponse(val status: Int?, val msg: String?, val data: List<Museum>?){
    fun isSuccess(): Boolean {
        return status == 200
    }
}
