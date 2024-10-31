package com.ilal

import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.access.annotation.Secured

class RedirectController {

    @Secured(['ROLE_USER', 'ROLE_ORGANIZER'])
    def defaultRedirect() {
        def roles = SecurityContextHolder.context.authentication.authorities*.authority

        if (roles.contains('ROLE_ORGANIZER')) {
            redirect(controller: 'organizer', action: 'index')
            return
        } else if (roles.contains('ROLE_USER')) {
            redirect(controller: 'user', action: 'index')
            return
        } else {
            redirect(uri: '/') // Jika role tidak dikenali
            return
        }
    }
}