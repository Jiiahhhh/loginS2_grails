package com.ilal

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EventSpec extends Specification implements DomainUnitTest<Event> {

     void "test domain constraints"() {
        when:
        Event domain = new Event()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
