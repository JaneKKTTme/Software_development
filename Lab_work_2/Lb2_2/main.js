function main() {
	var a = parseFloat(document.getElementById('first_element').value);
	var b = parseFloat(document.getElementById('second_element').value);
	var c = parseFloat(document.getElementById('third_element').value);
	var x = parseFloat(document.getElementById('fourth_element').value);
	var q = Math.sqrt(x+Math.pow(Math.E, a*x))*Math.log((b*x*x-1)/(c*x*x+3));
	document.getElementById('result').innerHTML = q;
	alert('Result: ' + q);
}

document.getElementById('enter').addEventListener('click', main);