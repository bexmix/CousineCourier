/**
 * 
 */

const Item = {
		quant: 0,
		id = 0
}



function addItem(id){
	var quant = parseInt(document.getElementById(id).innerHTML);
	quant += 1;
	document.getElementById(id).innerHTML = quant;
}

function subItem(id){
	var quant = parseInt(document.getElementById(id).innerHTML);
	if(quant > 0){
		quant -= 1;
		document.getElementById(id).innerHTML = quant;		
	}
}
	
function compileOrder(length, size){
	var list = new Array();
	item = new Item();
	
	for(let i = 0; i <= size; i++){
		item.id = document.getElementById(i+Id).innerHTML;
		item.quant = document.getElementById(i+"count").innerHTML;
		list[i] = item;
		item = new Item();
		
		return list;
	}
	
	
	

}

