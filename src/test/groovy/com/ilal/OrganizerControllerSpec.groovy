package com.ilal

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class OrganizerControllerSpec extends Specification implements ControllerUnitTest<OrganizerController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
