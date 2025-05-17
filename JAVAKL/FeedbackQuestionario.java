import java.util.ArrayList;
import java.util.List;

public class FeedbackQuestionario {

    // Método para obter perguntas
    public static List<String> obterPerguntas() {
        List<String> perguntas = new ArrayList<>();

        perguntas.add("1. Como você avalia o ambiente de trabalho da empresa? (1 = Muito ruim / 5 = Excelente)");
        perguntas.add("2. Você sente que a comunicação com a equipe está fluindo bem? ( ) Sim   ( ) Não   ( ) Parcialmente");
        perguntas.add("3. Há algo que você acredita que poderia ser melhorado na empresa? (Resposta opcional)");
        perguntas.add("4. Você recomendaria a empresa como um bom lugar para trabalhar? ( ) Sim   ( ) Não   ( ) Talvez)");
        perguntas.add("5. Como você avalia o equilíbrio entre sua vida pessoal e profissional? (1 = Muito desequilibrado / 5 = Totalmente equilibrado)");
        perguntas.add("6. Você sente que seu trabalho é reconhecido e valorizado? ( ) Sim   ( ) Não   ( ) Às vezes)");
        perguntas.add("7. Se desejar, conte o que poderia ser feito para você se sentir mais valorizado(a): (Resposta opcional)");
        perguntas.add("8. O que você considera mais positivo em trabalhar aqui?");
        perguntas.add("9. Existe algo que você gostaria de ver diferente no ambiente de trabalho?");
        perguntas.add("10. Você tem sugestões para melhorar o clima e a colaboração na empresa?");
        perguntas.add("11. Gostaria de deixar algum comentário adicional?");

        return perguntas;
    }
}


