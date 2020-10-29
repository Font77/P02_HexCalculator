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

    fun del_tail_char(): Unit {
        if (this.num >= 10) {
            var s = this.num.toString()
            s = s.substring(0, s.length - 1)
            this.num = s.toLong()
        }

    }

}