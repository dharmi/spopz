'use strict';

function ProfileCtrl($scope, $http, Navigation) {
  $scope.Navigation = Navigation;

  $scope.profile = {
    gender: undefined
  };

  $scope.selectFemale = function() {
    $scope.profile.gender = "F";
  };

  $scope.selectMale = function() {
    $scope.profile.gender = "M";
  };

  $scope.isMale = function() {
    return $scope.profile.gender == 'M';
  };

  $scope.isFemale = function() {
    return $scope.profile.gender == 'F';
  };
}

