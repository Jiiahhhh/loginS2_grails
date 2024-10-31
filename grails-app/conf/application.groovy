// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.ilal.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.ilal.UserRole'
grails.plugin.springsecurity.authority.className = 'com.ilal.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        [pattern: '/', access: ['isAuthenticated()']],
        [pattern: '/error', access: ['permitAll']],
        [pattern: '/index', access: ['isAuthenticated()']],
        [pattern: '/index.gsp', access: ['isAuthenticated()']],
        [pattern: '/assets/**', access: ['permitAll']],
        [pattern: '/**/js/**', access: ['permitAll']],
        [pattern: '/**/css/**', access: ['permitAll']],
        [pattern: '/**/images/**', access: ['permitAll']],
        [pattern: '/**/favicon.ico', access: ['permitAll']],
        [pattern: '/login/**', access: ['permitAll']],
        [pattern: '/logout/**', access: ['permitAll']],
        [pattern: '/redirect/**', access: ['isAuthenticated()']]
]


grails.plugin.springsecurity.filterChain.chainMap = [
        [pattern: '/assets/**', filters: 'none'],
        [pattern: '/**/js/**', filters: 'none'],
        [pattern: '/**/css/**', filters: 'none'],
        [pattern: '/**/images/**', filters: 'none'],
        [pattern: '/**/favicon.ico', filters: 'none'],
        [pattern: '/**', filters: 'JOINED_FILTERS']
]

// Konfigurasi untuk mengarahkan ke halaman berbeda berdasarkan role
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/redirect/defaultRedirect'
grails.plugin.springsecurity.successHandler.alwaysUseDefault = false
grails.plugin.springsecurity.logout.postOnly = false