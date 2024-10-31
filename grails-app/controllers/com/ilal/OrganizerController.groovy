package com.ilal

import org.springframework.security.access.annotation.Secured
import grails.gorm.transactions.Transactional
import org.springframework.security.core.context.SecurityContextHolder

@Secured('ROLE_ORGANIZER')
class OrganizerController {

    def springSecurityService

    def index() {
        def organizer = springSecurityService.currentUser as User
        def events = Event.findAllByOrganizer(organizer) // Mendapatkan event yang dibuat oleh organizer yang login
        [events: events]
    }

    @Transactional
    def saveEvent(){
        def organizer = springSecurityService.currentUser as User
        def event = new Event(
                nama: params.nama,
                harga: params.harga as BigDecimal,
                lokasi: params.lokasi,
                organizer: organizer
        )
        if (event.save(flush: true)){
            flash.message = "Event berhasil ditambahkan"
        } else {
            flash.error = "Gagal menyimpan event. Coba lagi"
        }
        redirect(action: "index")
    }

}