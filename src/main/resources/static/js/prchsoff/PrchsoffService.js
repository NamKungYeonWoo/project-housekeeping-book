'use strict';

app.factory('PrcshoffService', ['$http', '$q', function ($http, $q) {
    return {
        fetchAllPrcshoff: function () {
            return $http.get('/prchsoff/')
                .then(
                    function (response) {
                        return response.data;
                    },
                    function (errResponse) {
                        console.error('Error while fetch Prcshoff');
                        return $q.reject(errResponse);
                    }
                );
        }
    };
}]);