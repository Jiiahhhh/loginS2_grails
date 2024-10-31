package com.ilal

import org.springframework.security.access.annotation.Secured

@Secured('ROLE_USER')
class UserController {

    def index() {
        def events = Event.list()
        [events: events]
    }
}