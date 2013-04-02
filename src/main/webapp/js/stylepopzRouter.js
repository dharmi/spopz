angular.module('listapp', ['stylepopzFilters','stylepopzServices']).
    config(
    		function($routeProvider) {
    $routeProvider.
    when('/displayproducts', {templateUrl: 'partials/phone-list.html',   controller: stylepopzController}).
    when('/phones/:phoneId', {templateUrl: 'partials/phone-detail.html', controller: PhoneDetailCtrl}).
    otherwise({redirectTo: '/phones'});
   
});