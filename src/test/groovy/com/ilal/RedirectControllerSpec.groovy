package com.ilal

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class RedirectControllerSpec extends Specification implements ControllerUnitTest<RedirectController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}