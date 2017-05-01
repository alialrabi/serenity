(function () {
    'use strict';

    angular
        .module('cucumberserenityApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
