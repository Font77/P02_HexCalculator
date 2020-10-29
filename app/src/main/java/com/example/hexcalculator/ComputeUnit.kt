package com.example.hexcalculator

class ComputeUnit(_num: Long){
    var num: Long = _num
        get() {
            return field
        }
        set(value){
            field = value
        }


    fun get_hex(): String {
        return "%X".format(this.num, 16)
    }


}