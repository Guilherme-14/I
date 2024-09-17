function addCadastro() {
	const cadastro = {
		nome: $('#nome').val(),
		cpf: $('#cpf').val(),
		email: $('#email').val(),
		telefone: $('#telefone').val(),
		cep: $('#cep').val(),
		anoEscolar: $('#ano-escolar').val(),
		senha: $('#senha').val()

	};
	$.ajax({
		url: '/usuario',
		type: 'POST',
		contentType: 'application/json',
		data: JSON.stringify(cadastro),
		success: function() {
			alert('Item cadastrado')
			window.location.href ="login.html";
		},
		error: function() {
			alert('Erro ao cadastrar-se')
		}
	});
}