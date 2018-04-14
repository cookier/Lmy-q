document.onkeydown = function(event) //noinspection UnterminatedStatementJS
{
	e = event ? event : (window.event ? window.event : null);
	if (e.keyCode == 13) {
		$("input[type='submit']").focus();
		$("input[type='submit']").click();
	}
};
