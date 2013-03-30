angular.module('listapp', []).
    config(
    		function($routeProvider) {
    $routeProvider.
        when('/addItem', {
            templateUrl: 'list.ngt',
            controller: 'stylepopzController'
        }).
        when('/editItem', {
            templateUrl: 'list.ngt',
            controller: 'stylepopzController'
        }).        
        otherwise({
            redirectTo: '/'
    });
});