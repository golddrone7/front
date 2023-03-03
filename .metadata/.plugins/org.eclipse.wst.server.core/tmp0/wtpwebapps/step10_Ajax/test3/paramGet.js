/**
 * 
 */

 function startMethod(){
	var xhr = new XMLHttpRequest();
	var url= "result.jsp?"+ getParamValue();	
	xhr.open("GET", url, true);
	xhr.send(null);
	
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4 && xhr.status==200){
			document.getElementById("display").innerHTML =
					xhr.responseText;
			
		}	
	}
	

	
 }
 
 function getParamValue(){
	 var name = encodeURI(document.getElementById("name").value);
	 var age= encodeURI(document.getElementById("age").value);
	 var phone = encodeURI(document.getElementById("phone").value);
	 return "name="+name+"&age="+age+"&phone="+phone;
 }