var num=0;

function loop(){
	++num;
	postMessage("test : " + num);
	setTimeout("loop()", 1000); // thread.sleep(1000) 비슷한 기능
}

loop();