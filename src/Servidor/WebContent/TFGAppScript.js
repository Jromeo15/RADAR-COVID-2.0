$(document).ready(function(){

    $.ajax({

        url: '/RADAR-COVID/rest/datos',

        type: 'get',

        dataType: 'JSON',

        success: function(response){

            var len = response.length;

            for(var i=0; i<len; i++){

                var email = response[i].email;

                var DNI = response[i].DNI;

                var contraseña = response[i].contraseña;



                var document = response[i].document;


                var tr_str = "<tr>" +

                    "<td align='center'>" + email + "</td>" +

                    "<td align='center'>" + DNI + "</td>" +

                    "<td align='center'>" + contraseña + "</td>" +


                    "</tr>";


                $("#userTable tbody").append(tr_str);

            }


        }

    });

});