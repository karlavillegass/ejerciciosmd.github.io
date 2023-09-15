/* //*Calcular área de un triángulo 
function calcularArea(base, altura) { 
    const area = (1 / 2) * base * altura; 
    return area; 
 } 
 const base = 50;  
 const altura = 10;  
 const areaTriangulo = calcularArea(base, altura); 
 console.log('El área del triángulo es: ' + areaTriangulo); */


/* //Convertir Celsius a Fahrenheit
  function convertirAF(celsius){
    let fahrenheit;
    fahrenheit = (celsius * 9/5) + 32;
    return fahrenheit;
 }
console.log( "El resultado es: " +convertirAF(38)); 
 */

//Ver si es un palindromo
function esPalindromo(cadena){
    let array = cadena.split("");
    let reverse = array.reverse();
    return cadena == reverse.join("") ? "Si es un palindromo" : "No es un Palindromo"
}
console.log(esPalindromo("venado"))