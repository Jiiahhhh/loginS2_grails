package com.ilal

import org.springframework.security.access.annotation.Secured

@Secured('ROLE_ORGANIZER')
class OrganizerController {

    def index() {
        render(view: 'organizerDashboard')
    }

}