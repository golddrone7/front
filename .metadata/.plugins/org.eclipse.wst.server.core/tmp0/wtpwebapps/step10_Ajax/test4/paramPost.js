/**
 * 
 */

 function startMethod(){
	var xhr = new XMLHttpRequest();
	var url= "result.jsp";	
	xhr.open("POST", url, true);
	xhr.setRequestHeader("Content-Type", 
					"application/x-www-form-urlencoded;charset=utf-8");
	
	
	xhr.send(getParamValue());
	
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