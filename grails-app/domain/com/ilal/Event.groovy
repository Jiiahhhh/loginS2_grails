package com.ilal

class Event {
    String nama
    BigDecimal harga
    String lokasi
    User organizer

    static constraints = {
        nama nullable: false, blank: false
        harga nullable: false, min: 0.0
        lokasi nullable: false, blank: false
        organizer nullable: false
    }
}