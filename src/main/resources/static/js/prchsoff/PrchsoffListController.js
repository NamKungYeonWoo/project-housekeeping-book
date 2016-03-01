'use strict';

app.controller('PrchsoffListController', ['$scope', 'PrcshoffService', function ($scope, PrcshoffService) {
    $scope.prchsoffList = {};

    $scope.fetchAllPrcshoff = function () {
        PrcshoffService.fetchAllPrcshoff()
            .then(
                function (response) {
                    $scope.prchsoffList = response;
                },
                function (errResponse) {
                    console.error('Error while fetch Prcshoff');
                }
            );
    };

    $scope.fetchAllPrcshoff();
}]);