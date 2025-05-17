function fazerLogin() {
    const usuarios = ["Cleyton", "Fernanda", "Beatriz", "Caio"];
    const senhaCorreta = "12345";

    const nomeUsuario = document.getElementById("usuario").value.trim();
    const senha = document.getElementById("senha").value;

    if (usuarios.includes(nomeUsuario) && senha === senhaCorreta) {
        localStorage.setItem("usuario", nomeUsuario);
        window.location.href = "questionario.html";
    } else {
        alert("Usuário ou senha incorretos. Tente novamente.");
    }
}

document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("questionarioForm");
    if (form) {
        form.addEventListener("submit", function (e) {
            e.preventDefault();
            const respostas = {};
            const perguntas = form.querySelectorAll(".card");

            perguntas.forEach((p, i) => {
                const perguntaTexto = p.querySelector("p").innerText;
                const radios = p.querySelectorAll("input[type='radio']");
                let resposta = "";

                if (radios.length > 0) {
                    const selecionado = p.querySelector("input[type='radio']:checked");
                    resposta = selecionado ? selecionado.value : "Não respondido";
                } else {
                    const textarea = p.querySelector("textarea");
                    resposta = textarea ? textarea.value.trim() : "Não respondido";
                }
                respostas[perguntaTexto] = resposta;
            });

            localStorage.setItem("respostas", JSON.stringify(respostas));
            window.location.href = "agradecimento.html";
        });
    }
});