angular.module('stylepopzServices', ['ngResource']).
    factory('Phone', function($resource){
  return $resource('json/:phoneId.json', {}, {
    query: {method:'GET', params:{phoneId:'phones'}, isArray:true}
  });
})