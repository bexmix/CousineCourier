var storeDao = new StoreDaoImpl();
var storeArray = storeDao.buildRestaurantPage()
var store = new Store()
var length = storeArray.length;
var width = 3;
var depth = (width/length)+1;
var count = 0;
var myTable = "<table>";

for(var y = 0; y < depth; y++)
	{
	myTable += "<tr>";
	for(var x = 0; x < width; x++)
		{
			store = storeArray[count];
			myTable += "<td>" + store.getName() + "</td>";
			count++;
			
		}
	myTable += "</tr>";
	}
myTable += "</table>";

console.log(myTable);

document.write(myTable);