def integracion (f: Double => Double, a: Double, b: Double): Double = {
  val media: Double = (a+b)/2.0;

  (b-a) * ((f(a) + (4*f(media)) + f(b))/ 6)
}

// 1
val f1 = (a: Double) => -Math.pow(a,2) + 8*a -12
var aproximate1 = integracion (f1,3,5);

// 2
val f2 = (a: Double) => 3 * Math.pow(a,2)
var aproximate2 = integracion (f2,0,2);

// 3
val f3 = (a: Double) => a +  2*Math.pow(a, 2) - Math.pow(a, 3) + 5*Math.pow(a, 4)
var aproximate3 = integracion (f3,-1,1);

//val f3 = integracion (a =>  a +  2*Math.pow(a, 2) - Math.pow(a, 3) + 5*Math.pow(a, 4), -1, 1)

// 4
val f4 = (a: Double) => ((2 * a) + 1 ) / (Math.pow(a, 2) + a)
var aproximate4 = integracion (f4,1,2);

// 5
val f5 = (a: Double) => Math.exp(a)
var aproximate5 = integracion (f5,0,1);

// 6
val f6 = (a: Double) => 1 / math.sqrt(a - 1)
var aproximate6 = integracion (f6,2,3);

// 7
val f7 = (a: Double) => 1 / 1 + math.pow(a,2)
var aproximate7 = integracion (f7,0,1);


def error(esperado: Double, obtenido: Double) = {
  val e = esperado - obtenido
  e.abs
}

// Ejemplo con f1 1
val esperado1 = 8
val e1 = error(esperado1, aproximate2)
println(e1) // 0.003328326822920737