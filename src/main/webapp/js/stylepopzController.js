function stylepopzController($scope, $http){
    $scope.items = [
        {text:'Enter ur Fav!!', deleted: false}
    ];
    
    $http.get('json/phones.json').success(function(data) {
        $scope.phones = data;
      });
     
    $scope.orderProp = 'age';
    
    $scope.addNewItem = function(){
        newItem = {
            text: $scope.itemText,
            deleted: false
        }
        $scope.items.push(newItem);

        // clear the form text, 2-way binding \o/
        $scope.itemText = '';
    }
      $scope.deleteItem = function(item){
        item.deleted = true;
    }
    
     $scope.name = "Controller ";
}