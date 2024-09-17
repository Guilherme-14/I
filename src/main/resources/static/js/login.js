function loadLogin() {
  const cadastro = {
    nome: $('#nome').val(),
    email: $('#email').val(),
    senha: $('#senha').val(),
  };

  $.getJSON('/usuario')
    .done(function(data) {
      const nome = data.nome;
      const email = data.email;
      const senha = data.senha;

      console.log(data);

      if (cadastro.nome === nome) {
        if (cadastro.email === email) {
          if (cadastro.senha === senha) {
            window.location.href = "principal.html";
          } if(cadastro.senha != senha) {
            alert("Senha incorreta");
          }
        } else {
          alert("E-mail incorreto");
        }
      } else {
        alert("Nome de usuário incorreto");
      }
    })
    .fail(function(jqxhr, textStatus, error) {
      console.error("Error:", textStatus, error);
      alert("Erro ao carregar dados do usuário");
    });
}