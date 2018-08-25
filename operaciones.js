function CalculoAngulos(n) {
    console.log(n);
    n = n.value;
    var Res = (180 * (n - 2)) / n;
    var e = document.getElementById("Respuesta");
    e.innerHTML = Res;
    return Res;
}