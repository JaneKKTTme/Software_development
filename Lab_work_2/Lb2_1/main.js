function main(q, w, e, t) {
	return function() {
		return Math.sqrt(t+Math.pow(Math.E, q*t))*Math.log((w*t*t-1)/(e*t*t+3));
	}
}

var a = 2.44;
var b = 1.39;
var c = 6.21;
var x = 3.10;
var result = main(a, b, c, x);

alert('Result: ' + result());

onunload = function() {
	result = null;
}