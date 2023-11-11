def integracion (f: Double => Double, a: Int, b: Int): Double = {
  val media: Double = (a+b)/2;

  (b-a) * ((f(a) + (4*f(media)) + f(b))/ 6)
}

// 1
val f1 = (a: Double) => -Math.pow(a,2) + 8*a -12
var aproximate = integracion (f1,3,5);

// 2
val f2 = (a: Double) => 3 * Math.pow(a,2)
aproximate = integracion (f2,0,2);

// 3
val f3 = (a: Double) => a +  2*Math.pow(a, 2) - Math.pow(a, 3) + 5*Math.pow(a, 4)
aproximate = integracion (f3,-1,1);

// 4
val f4 = (a: Double) => ((2 * a) + 1 ) / (Math.pow(a, 2) + a)
aproximate = integracion (f4,1,2);

// 5
val f5 = (a: Double) => Math.exp(a)
aproximate = integracion (f5,0,1);

// 6
val f6 = (a: Double) => 1 / math.sqrt(a - 1)
aproximate = integracion (f6,2,3);

// 7
val f7 = (a: Double) => 1 / 1 + math.pow(a,2)
aproximate = integracion (f7,0,1);
