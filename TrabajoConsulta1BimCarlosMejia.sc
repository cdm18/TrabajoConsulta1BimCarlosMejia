/*
1 . Crear una función con nombre (integracion) que use el método de Simpson para
calcular el valor aproximado de cualquier función . Se recomienda analizar lo
siguiente:
 */

def integracion (f: Double => Double, a: Double, b: Double): Double = {
  val media: Double = (a+b)/2.0;

  (b-a) * ((f(a) + (4*f(media)) + f(b))/ 6)
}


/*
2. Aproxima el valor de las siguientes integrales definidas usando la función
integracion creada en el paso 1
 */

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

/*
3. Calcula el error que se presenta en cada aproximación. El error es igual al valor
absoluto de la resta entre el valor esperado y el valor obtenido.

 */
def error(esperado: Double, obtenido: Double) = {
  val e: Double = esperado - obtenido
  e.abs
}

// Ejemplo con f1
val esperado1 = 7.33
val e1 = error(esperado1, aproximate1)

// Ejemplo con f2
val esperado2 = 8
val e2 = error(esperado2, aproximate2)

// Ejemplo con f3
val esperado3 = 3.333
val e3 = error(esperado3, aproximate3)

// Ejemplo con f4
val esperado4 = 1.09861
val e4 = error(esperado4, aproximate4)

// Ejemplo con f5
val esperado5 = 1.71828
val e5 = error(esperado5, aproximate5)

// Ejemplo con f6
val esperado6 = 0.828427
val e6 = error(esperado6, aproximate6)

// Ejemplo con f7
val esperado7 = 0.785398
val e7 = error(esperado7, aproximate7)



