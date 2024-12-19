$(function) {
    console.log('id');
    $("#listar").on("click", function() {
        $.get("http://localhost:1234/api/productos", function(data) {
            $("#resListar").attr("data-midato", data);
            console.log(data);
        })
});
$("#leer").on("click", function(button) {
    $.get("http://localhost:1234/api/productos/1", function(data) {
        $("#resLeer").text("ok"); 
        console.log(data);
    })
    
});

$('.add-to-cart').on('click',function() {
    //console.log('hola');
    $.ajax({
        url: "http://localhost:1234/api/productos",
        method: "POST",
        "data": JSON.stringify({
            "id": 1,
            "nombre": "Clase Azul Tequila",
            "precio": "490",
            "cantidad": "10"
            
        }),
        success: function(data) {
            //$("#resCrear").text("Ok"); 
            console.log(data);
        },
        error: function(data) {
            console.log(data);
        }
    });
});



$.get("http://localhost:1234/api/productos");
const btnCart = document.querySelector('.container-icon')
const containerCartProducts = document.querySelector('.container-cart-products')

btnCart.addEventListener('click', () => {
    containerCartProducts.classList.toggle('hidden-cart')
});