package com.ilal

class BootStrap {

    def springSecurityService

    def init = { servletContext ->
        Role.withTransaction {
            // Buat roles jika belum ada
            def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
            def organizerRole = Role.findByAuthority('ROLE_ORGANIZER') ?: new Role(authority: 'ROLE_ORGANIZER').save(failOnError: true)

            // Buat akun User
            def user = User.findByUsername('user') ?: new User(
                    username: 'user',
                    password: 'password'
            ).save(failOnError: true)
            if (!user.authorities.contains(userRole)) {
                UserRole.create(user, userRole, true)
            }

            // Buat akun Organizer
            def organizer = User.findByUsername('organizer') ?: new User(
                    username: 'organizer',
                    password: 'password'
            ).save(failOnError: true)
            if (!organizer.authorities.contains(organizerRole)) {
                UserRole.create(organizer, organizerRole, true)
            }

            def organizer2 = User.findByUsername('ilal') ?: new User(
                    username: 'ilal',
                    password: 'password'
            ).save(failOnError: true)
            if (!organizer2.authorities.contains(organizerRole)) {
                UserRole.create(organizer2, organizerRole, true)
            }
        }
    }

    def destroy = {}
}

